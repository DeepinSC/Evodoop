find ./src/main/java -type f > all_class_paths.txt

src_dir=$(dirname $(head -n 1 all_class_paths.txt))
test_dir=${src_dir/src\/main\/java/src\/test\/java}

rm -f all_class_names.txt
while read p; do

  p_striped=${p#./src/main/java/}
  p_striped=${p_striped%.java}

  echo "${p_striped//\//.}" >> all_class_names.txt

done < all_class_paths.txt
rm -f all_class_paths.txt

rm -rf ./test_suites
while read p; do

  mkdir -p ./test_suites/evosuite/$p
  mkdir -p ./test_suites/randoop/$p
  mkdir -p ./test_suites/evodoop/$p

  echo $p > ./test_suites/randoop/$p/$p.txt

done < all_class_names.txt


jar_file=$(ls *.jar)
find ./test_suites/randoop/ -type f > single_class_name_txt_file_paths.txt

echo "<tools>" > code_coverage_by_class.xml
echo "<Randoop>" >> code_coverage_by_class.xml

total_line_rate=0
total_branch_rate=0
num_of_classes=0

while read p; do

  java -classpath ../../randoop/randoop-all-4.1.1.jar:$jar_file randoop.main.Main gentests --classlist=$p --time-limit=5 --flaky-test-behavior=DISCARD --junit-output-dir=$(dirname $p)
  
  class_name=${p##*/}
  class_name=${class_name%.txt}

  if ls $(dirname $p)/*.java 1>/dev/null 2>&1; then

    rm -rf $test_dir/*
    cp $(dirname $p)/*.java $test_dir

    rm -rf ./target
    mvn cobertura:cobertura

    echo "<$class_name>" >> code_coverage_by_class.xml

    total_line_rate=$(echo "scale=9; $total_line_rate + $(xmllint --xpath "string(/coverage/packages/package/classes/class[@name=\"$class_name\"]/@line-rate)" ./target/site/cobertura/coverage.xml)" | bc)
    total_branch_rate=$(echo "scale=9; $total_branch_rate + $(xmllint --xpath "string(/coverage/packages/package/classes/class[@name=\"$class_name\"]/@branch-rate)" ./target/site/cobertura/coverage.xml)" | bc)
    num_of_classes=$(($num_of_classes + 1))

    echo "<class_line_rate>$(xmllint --xpath "string(/coverage/packages/package/classes/class[@name=\"$class_name\"]/@line-rate)" ./target/site/cobertura/coverage.xml)</class_line_rate>" >> code_coverage_by_class.xml
    echo "<class_branch_rate>$(xmllint --xpath "string(/coverage/packages/package/classes/class[@name=\"$class_name\"]/@branch-rate)" ./target/site/cobertura/coverage.xml)</class_branch_rate>" >> code_coverage_by_class.xml

    echo "</$class_name>" >> code_coverage_by_class.xml

    mv ./target/site/cobertura/coverage.xml $(dirname $p)

  else

    echo "<$class_name>" >> code_coverage_by_class.xml

    echo "<class_line_rate>N/A</class_line_rate>" >> code_coverage_by_class.xml
    echo "<class_branch_rate>N/A</class_branch_rate>" >> code_coverage_by_class.xml

    echo "</$class_name>" >> code_coverage_by_class.xml

    mv ./target/site/cobertura/coverage.xml $(dirname $p)

  fi

done < single_class_name_txt_file_paths.txt
rm -f single_class_name_txt_file_paths.txt

rm -rf $test_dir/*
rm -rf ./target

echo "<average_line_rate>$(echo "scale=9; $total_line_rate / $num_of_classes" | bc)</average_line_rate>" >> code_coverage_by_class.xml
echo "<average_branch_rate>$(echo "scale=9; $total_branch_rate / $num_of_classes" | bc)</average_branch_rate>" >> code_coverage_by_class.xml

echo "</Randoop>" >> code_coverage_by_class.xml


mvn evosuite:generate
mvn evosuite:export
mvn clean
mvn cobertura:cobertura

cp ./target/site/cobertura/coverage.xml ./test_suites/evosuite

while read p; do

  mv $test_dir/${p##*.}_ESTest.java ./test_suites/evosuite/$p 1>/dev/null 2>&1
  mv $test_dir/${p##*.}_ESTest_scaffolding.java ./test_suites/evosuite/$p 1>/dev/null 2>&1

done < all_class_names.txt

echo "<EvoSuite>" >> code_coverage_by_class.xml

total_line_rate=0
total_branch_rate=0
num_of_classes=0

while read p; do

  if ls ./test_suites/evosuite/$p/*.java 1>/dev/null 2>&1; then

    echo "<$p>" >> code_coverage_by_class.xml

    total_line_rate=$(echo "scale=9; $total_line_rate + $(xmllint --xpath "string(/coverage/packages/package/classes/class[@name=\"$class_name\"]/@line-rate)" ./test_suites/evosuite/coverage.xml)" | bc)
    total_branch_rate=$(echo "scale=9; $total_branch_rate + $(xmllint --xpath "string(/coverage/packages/package/classes/class[@name=\"$class_name\"]/@branch-rate)" ./test_suites/evosuite/coverage.xml)" | bc)
    num_of_classes=$(($num_of_classes + 1))

    echo "<class_line_rate>$(xmllint --xpath "string(/coverage/packages/package/classes/class[@name=\"$p\"]/@line-rate)" ./test_suites/evosuite/coverage.xml)</class_line_rate>" >> code_coverage_by_class.xml
    echo "<class_branch_rate>$(xmllint --xpath "string(/coverage/packages/package/classes/class[@name=\"$p\"]/@branch-rate)" ./test_suites/evosuite/coverage.xml)</class_branch_rate>" >> code_coverage_by_class.xml

    echo "</$p>" >> code_coverage_by_class.xml

  else

    echo "<$p>" >> code_coverage_by_class.xml

    echo "<class_line_rate>N/A</class_line_rate>" >> code_coverage_by_class.xml
    echo "<class_branch_rate>N/A</class_branch_rate>" >> code_coverage_by_class.xml

    echo "</$p>" >> code_coverage_by_class.xml

  fi

done < all_class_names.txt

echo "<average_line_rate>$(echo "scale=9; $total_line_rate / $num_of_classes" | bc)</average_line_rate>" >> code_coverage_by_class.xml
echo "<average_branch_rate>$(echo "scale=9; $total_branch_rate / $num_of_classes" | bc)</average_branch_rate>" >> code_coverage_by_class.xml

echo "</EvoSuite>" >> code_coverage_by_class.xml

echo "</tools>" >> code_coverage_by_class.xml

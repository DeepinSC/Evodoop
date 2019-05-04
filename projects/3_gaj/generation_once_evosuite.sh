src_dir=$(dirname $(head -n 1 all_class_names_temp.txt))
test_dir=${src_dir/src\/main\/java/src\/test\/java}

while read p; do

  dir_name="${p}_$1"
  mkdir -p ./test_suites/evosuite/$dir_name

done < all_class_names.txt


mvn evosuite:generate

rm -rf $test_dir/*
mvn evosuite:export

mvn clean

rm -rf ./target
mvn cobertura:cobertura

mv ./target/site/cobertura/coverage.xml ./test_suites/evosuite/coverage_$1.xml

while read p; do

  dir_name="${p}_$1"
  mv $test_dir/${p##*.}_ESTest.java ./test_suites/evosuite/$dir_name 1>/dev/null 2>&1
  mv $test_dir/${p##*.}_ESTest_scaffolding.java ./test_suites/evosuite/$dir_name 1>/dev/null 2>&1

done < all_class_names.txt

rm -rf $test_dir/*
rm -rf ./target

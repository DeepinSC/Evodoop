src_dir=$(dirname $(head -n 1 all_class_names_temp.txt))
test_dir=${src_dir/src\/main\/java/src\/test\/java}

cur_date=$(date +%d-%m-%y)
while read p; do

  mkdir -p ./test_suites/evosuite/$p_$cur_date

done < all_class_names.txt


mvn evosuite:generate

rm -rf $test_dir/*
mvn evosuite:export

mvn clean

rm -rf ./target
mvn cobertura:cobertura

cp ./target/site/cobertura/coverage.xml ./test_suites/evosuite

while read p; do

  mv $test_dir/${p##*.}_ESTest.java ./test_suites/evosuite/$p_$cur_date 1>/dev/null 2>&1
  mv $test_dir/${p##*.}_ESTest_scaffolding.java ./test_suites/evosuite/$p_$cur_date 1>/dev/null 2>&1

done < all_class_names.txt

rm -rf $test_dir/*
rm -rf ./target
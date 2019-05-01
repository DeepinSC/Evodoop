src_dir=$(dirname $(head -n 1 all_class_names_temp.txt))
test_dir=${src_dir/src\/main\/java/src\/test\/java}

cur_date=$(date +%d-%m-%y)
while read p; do

  mkdir -p ./test_suites/randoop/$p_$cur_date
  echo $p > ./test_suites/randoop/$p_$cur_date/$p.txt

done < all_class_names.txt

jar_file=$(ls *.jar)
find ./test_suites/randoop/ -type f > single_class_name_txt_file_paths.txt

while read p; do

  java -classpath ../../randoop/randoop-all-4.1.1.jar:$jar_file \
    randoop.main.Main gentests --classlist=$p --time-limit=5 --flaky-test-behavior=DISCARD --junit-output-dir=$(dirname $p)

  if ls $(dirname $p)/*.java 1>/dev/null 2>&1; then

    rm -rf $test_dir/*
    cp $(dirname $p)/*.java $test_dir

    rm -rf ./target
    mvn cobertura:cobertura

    mv ./target/site/cobertura/coverage.xml $(dirname $p)

  fi

done < single_class_name_txt_file_paths.txt
rm -f single_class_name_txt_file_paths.txt

rm -rf $test_dir/*
rm -rf ./target
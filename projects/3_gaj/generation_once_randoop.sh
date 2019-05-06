src_dir=$(dirname $(head -n 1 all_class_paths.txt))
test_dir=${src_dir/src\/main\/java/src\/test\/java}
: ${test_dir:=/nonexistant}

while read p; do

  dir_name="${p}_$1"
  mkdir -p ./test_suites/randoop/$dir_name
  echo $p > ./test_suites/randoop/$dir_name/$p.txt

done < all_class_names.txt

jar_file=$(ls *.jar)

while read p; do

  dir_name="${p}_$1"

  java -classpath ../../randoop/randoop-all-4.1.1.jar:$jar_file \
    randoop.main.Main gentests --classlist=./test_suites/randoop/$dir_name/${p}.txt --time-limit=5 \
    --flaky-test-behavior=DISCARD --junit-output-dir=./test_suites/randoop/$dir_name

  if ls ./test_suites/randoop/$dir_name/*.java 1>/dev/null 2>&1; then

    rm -rf $test_dir/*
    cp ./test_suites/randoop/$dir_name/*.java $test_dir

    rm -rf ./target
    mvn cobertura:cobertura

    mv ./target/site/cobertura/coverage.xml ./test_suites/randoop/$dir_name

  fi

done < all_class_names.txt

rm -rf $test_dir/*
rm -rf ./target

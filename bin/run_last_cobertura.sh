#!/bin/bash

src_dir=$(dirname $(head -n 1 all_class_paths.txt))
test_dir=${src_dir/src\/main\/java/src\/test\/java}
: ${test_dir:=/nonexistant}

rm -rf $test_dir/*
mkdir -p $test_dir
cp ./test_suites/evodoop/*.java $test_dir

rm -rf ./target
mvn cobertura:cobertura

mv ./target/site/cobertura/coverage.xml ./test_suites/evodoop

rm -rf $test_dir/*
rm -rf ./target

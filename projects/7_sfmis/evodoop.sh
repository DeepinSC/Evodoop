if [[ ! $# -eq 1 ]] ; then
    echo 'Please input the number of test suites you want to generate for each of the tools!'
    exit 1
fi

find ./src/main/java -type f > all_class_paths.txt

rm -f all_class_names.txt
while read p; do

  p_striped=${p#./src/main/java/}
  p_striped=${p_striped%.java}

  echo "${p_striped//\//.}" >> all_class_names.txt

done < all_class_paths.txt

rm -rf ./test_suites

for (( i=1; i<=$1; i++ ))
do
  ./generation_once_randoop.sh $i
  python3 ./merge_randoop_xml.py $i
  ./generation_once_evosuite.sh $i
done

python3 ./minimize_test_suite.py $1

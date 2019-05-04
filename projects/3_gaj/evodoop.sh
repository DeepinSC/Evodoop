if [[ ! $# -eq 1 ]] ; then
    echo 'Please input the number of test suites you want to generate for each of the tools!'
    exit 1
fi

find ./src/main/java -type f > all_class_names_temp.txt

rm -f all_class_names.txt
while read p; do

  p_striped=${p#./src/main/java/}
  p_striped=${p_striped%.java}

  echo "${p_striped//\//.}" >> all_class_names.txt

done < all_class_names_temp.txt

rm -rf ./test_suites

for i in {1..$1}
do
  ./randoop_generation_once.sh $i
  python3 ./merge_randoop_xml.py $i
  ./evosuite_generation_once.sh $i
done
rm -f all_class_names_temp.txt

python3 ./minimize_test_suite.py $1

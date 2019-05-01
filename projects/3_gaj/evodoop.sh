find ./src/main/java -type f > all_class_names_temp.txt

rm -f all_class_names.txt
while read p; do

  p_striped=${p#./src/main/java/}
  p_striped=${p_striped%.java}

  echo "${p_striped//\//.}" >> all_class_names.txt

done < all_class_names_temp.txt
rm -f all_class_names_temp.txt

rm -rf ./test_suites
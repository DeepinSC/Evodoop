import xml.etree.ElementTree as ET
import os
import sys
import subprocess

cur_dir = os.path.dirname(os.path.abspath(__file__))

with open(cur_dir + "/all_class_names.txt") as f:
    class_names = f.readlines()

class_names_xml_paths = {}
for class_name in class_names:
    class_names_xml_paths[class_name] = (
        cur_dir + "/test_suites/randoop/" + class_name.strip() + "_" + sys.argv[1] + "/coverage.xml")

is_first_xml = True
for class_name, xml_path in class_names_xml_paths.items():
    if os.path.isfile(xml_path):
        if is_first_xml:
            is_first_xml = False
            to_path = cur_dir + "/test_suites/randoop/coverage_" + sys.argv[1] + ".xml"
            subprocess.Popen(["cp", xml_path, to_path])
        else:
            all_classes_tree = ET.parse(cur_dir + "/test_suites/randoop/coverage_" + sys.argv[1] + ".xml")
            all_classes_root = all_classes_tree.getroot()
            this_class_tree = ET.parse(xml_path)
            this_class_root = this_class_tree.getroot()

            classes = next(this_class_root.iter("classes"))
            for class_under_test in classes.findall("class"):
                if class_under_test.get("name") == class_name:
                    class_to_insert = class_under_test
                    break

            classes = next(all_classes_root.iter("classes"))
            for class_under_test in classes.findall("class"):
                if class_under_test.get("name") == class_name:
                    classes.remove(class_under_test)
                    classes.append(class_to_insert)
                    break
            all_classes_tree.write(cur_dir + "/test_suites/randoop/coverage_" + sys.argv[1] + ".xml")

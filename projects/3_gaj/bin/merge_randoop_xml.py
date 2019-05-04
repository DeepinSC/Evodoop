import xml.etree.ElementTree as ET
import os
import sys
import subprocess

with open("all_class_names.txt") as f:
    class_names = f.readlines()

xml_paths = []
for class_name in class_names:
    xml_paths.append("./test_suites/randoop/" + class_name.strip() + "_" + sys.argv[1] + "/coverage.xml")

is_first_xml = True
for xml_path in xml_paths:
    if os.path.isfile(xml_path):
        if is_first_xml:
            is_first_xml = False
            subprocess.Popen(["cp", xml_path, "./test_suites/randoop/coverage_", sys.argv[1], ".xml"])
        else:
            all_classes_root = ET.parse("./test_suites/randoop/coverage_" + sys.argv[1] + ".xml").getroot()
            this_class_root = ET.parse(xml_path).getroot()

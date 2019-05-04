import xml.etree.ElementTree as ET

new_tree = ET.parse("output.xml")
new_root = new_tree.getroot()
insertion_point = next(new_root.iter("classes"))

tree = ET.parse("test.xml")
root = tree.getroot()
for classes in root.iter("classes"):
    for class_under_test in classes.findall("class"):
        if class_under_test.get("name") == "brain.ga.Evaluator":
            insertion_point.append(class_under_test)
            break

new_tree.write('output.xml')

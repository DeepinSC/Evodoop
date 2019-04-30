import xml.etree.ElementTree as ET


class xml_parser:

    def class_line_hit(self, path_of_xml):
        class_line_hit = {}

        root = ET.parse(path_of_xml).getroot()

        for class_under_test in root.iter("class"):
            class_name = class_under_test.get("name")
            class_line_hit[class_name] = {}
            lines = class_under_test.find("lines")
            for line in lines:
                class_line_hit[class_name][line.get("number")] = line.get("hits")

        return class_line_hit


if __name__ == "__main__":
    xml_parser = xml_parser()
    print(xml_parser.class_line_hit("./test_suites/evosuite/coverage.xml"))

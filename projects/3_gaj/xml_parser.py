import xml.etree.ElementTree as ET


class xml_parser:

    def __init__(self):
        return

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

    def minimize_test_suite(self, line_hit):
        res = []
        valid_hit = {}
        for c in line_hit:
            temp = {}
            for key in line_hit[c]:
                if line_hit[c][key] != '0':
                    temp[key] = int(line_hit[c][key])

            if temp:
                valid_hit[c] = temp

        def dfs(hits, res, hit_lines):
            best_key = None
            best_count = 0
            for key in hits:
                count = 0
                for line in hits[key]:
                    if line not in hit_lines:
                        count += 1
                if count > best_count:
                    best_key = key
                    best_count = count

            if best_key:
                res.append(best_key)
                for line in hits[best_key]:
                    if line not in hit_lines:
                        hit_lines.append(line)

                del hits[best_key]
                return dfs(hits, res, hit_lines)

            return res, len(hit_lines)

        return dfs(valid_hit, [], [])


if __name__ == "__main__":
    xml_parser = xml_parser()
    line_hit = xml_parser.class_line_hit("./test_suites/coverage.xml")
    print(xml_parser.minimize_test_suite(line_hit))

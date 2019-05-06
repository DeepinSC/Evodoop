import os
import sys
import subprocess
import xml.etree.ElementTree as ET


class MinimizeTestSuite:

    def __init__(self):
        return

    def tool_version_class_line_hit(self):
        cur_dir = os.path.dirname(os.path.abspath(__file__))

        tool_version_class_line_hit = {"randoop": {}, "evosuite": {}}

        for i in range(int(sys.argv[1])):
            tool_version_class_line_hit["randoop"][str(i + 1)] = \
                self.class_line_hit(cur_dir + "/test_suites/randoop/coverage_" + str(i + 1) + ".xml")
            tool_version_class_line_hit["evosuite"][str(i + 1)] = \
                self.class_line_hit(cur_dir + "/test_suites/randoop/coverage_" + str(i + 1) + ".xml")

        return tool_version_class_line_hit

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

        def flat_map(line_hit):
            flatten_map = {}
            for tool in line_hit:
                for version in line_hit[tool]:
                    key = tool + "_" + version
                    flatten_map[key] = line_hit[tool][version]

            return flatten_map

        def dfs(hits, res, hit_lines):
            best_key = None
            best_count = 0
            for key in hits:
                count = 0
                for line in hits[key]:
                    if line not in hit_lines and hits[key][line] != '0':
                        count += 1
                if count > best_count:
                    best_key = key
                    best_count = count

            if best_key:
                res.append(best_key)
                for line in hits[best_key]:
                    if line not in hit_lines and hits[key][line] != '0':
                        hit_lines.append(line)

                del hits[best_key]
                return dfs(hits, res, hit_lines)
            return res

        flatten_map = flat_map(line_hit)

        classes = [key for key in flatten_map["evosuite_1"]]
        result = {}
        for c in classes:
            hits = {}
            for suite in flatten_map:
                hits[suite] = flatten_map[suite][c]

            result[c] = dfs(hits, [], [])

        return result


def random_data(test_suite=2, classes=5, lines=5):
    import random
    tools = ['evosuite', 'randoop']
    res = {}
    for tool in tools:
        val = {}
        for i in range(test_suite):
            val[str(i)] = {}
            for j in range(classes):
                key = 'c' + str(j)
                val[str(i)][key] = {}
                for k in range(lines):
                    val[str(i)][key][k] = str(random.randint(0, 1))
        res[tool] = val

    return res


def output_test_suite(class_tool_version):
    import glob

    subprocess.call(["mkdir", "-p", "./test_suites/evodoop"])

    for class_name, tool_versions in class_tool_version.items():
        index = 1
        for tool_version in tool_versions:
            tool, version = tool_version.split("_")
            for file_path in glob.glob("./test_suites/" + tool + "/" + class_name + "_" + version + "/*.java"):
                subprocess.call(["cp", file_path, "./test_suites/evodoop/" + class_name + "_" + str(index) + ".java"])
                index += 1


if __name__ == "__main__":
    minimize_test_suite = MinimizeTestSuite()

    tool_version_class_line_hit = minimize_test_suite.tool_version_class_line_hit()
    print(tool_version_class_line_hit)

    # data = random_data()
    # print(data)
    # print(minimize_test_suite.minimize_test_suite(data))
    class_tool_version = minimize_test_suite.minimize_test_suite(tool_version_class_line_hit)
    print(class_tool_version)

    output_test_suite(class_tool_version)
    print("The final test suite has been generated.")

    cur_dir = os.path.dirname(os.path.abspath(__file__))
    # subprocess.call([cur_dir + "/run_last_cobertura.sh"])

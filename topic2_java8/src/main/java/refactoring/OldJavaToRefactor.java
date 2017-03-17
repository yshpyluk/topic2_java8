package refactoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static java.lang.Character.isDigit;

/**
 * Refactor all these method using Java8.
 * 1. Create test to cover the logic of method.
 * 2. Refactor.
 * 3. Check that all tests are Green.
 */
public class OldJavaToRefactor {

    public int countLetters(List<String> strings) {
        int count = 0;
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            count += string.length();
        }
        return count;
    }

    /**
     * @param cities   {@link List} with {@link String} city names.
     * @param cityName {@link String}
     * @return int the count of cityName in the list.
     */
    public int cityCount(List<String> cities, String cityName) {
        int count = 0;
        for (String artist : cities) {
            if (artist.contains(cityName)) {
                count++;
            }
        }
        return count;
    }

    public List<String> transformToUpperCase(List<String> lowerCaseStrings) {
        List<String> collected = new ArrayList<>();
        for (String string : lowerCaseStrings) {
            String uppercaseString = string.toUpperCase();
            collected.add(uppercaseString);
        }
        return collected;
    }

    public List<String> filterDigitStrings(List<String> inputStrings) {
        List<String> beginningWithNumbers = new ArrayList<>();
        for (String value : inputStrings) {
            if (isDigit(value.charAt(0))) {
                beginningWithNumbers.add(value);
            }
        }
        return beginningWithNumbers;
    }

    public List<String> getNames(List<Student> students) {
        List<String> names = new ArrayList<>();
        for (Student student : students) {
            names.add(student.getName());
        }
        return names;
    }

    class Student {
        String name;
        String group;

        public Student(String name, String group) {
            this.name = name;
            this.group = group;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }
    }

    public Map<String, Integer> groupStudents(List<Student> students) {
        HashMap<String, Integer> groupedStudents = new HashMap<>();
        for (Student student: students) {
            Integer count = groupedStudents.get(student.getName());
            if (count != null) {
                groupedStudents.put(student.getName(), count + 1);
            } else {
                groupedStudents.put(student.getName(), 1);
            }
        }
        return groupedStudents;
    }

    //Anonymous class -> to functional interface.


}
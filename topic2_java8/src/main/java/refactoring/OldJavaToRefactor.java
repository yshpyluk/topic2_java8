package refactoring;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.Character.isDigit;
import static java.util.stream.Collectors.toList;

/**
 * Refactor all these method using Java8.
 * 1. Create test to cover the logic of method.
 * 2. Refactor.
 * 3. Check that all tests are Green.
 */
public class OldJavaToRefactor {

    public int countLetters(List<String> strings) {
//        int count = 0;
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            String string = iterator.next();
//            count += string.length();
//        }
        return strings.stream()
				.mapToInt(String::length)
				.sum();
//        return count;
    }

    /**
     * @param cities   {@link List} with {@link String} city names.
     * @param cityName {@link String}
     * @return int the count of cityName in the list.
     */
    public long cityCount(List<String> cities, String cityName) {
//        int count = 0;
//        for (String artist : cities) {
//            if (artist.contains(cityName)) {
//                count++;
//            }
//        }
//        return count;
		return cities.stream()
				.filter(city -> city.equals(cityName))
				.count();
//				.collect(toList())
//				.size();
    }

    public List<String> transformToUpperCase(List<String> lowerCaseStrings) {
    	return lowerCaseStrings.stream()
				.map(String::toUpperCase)
				.collect(toList());
//        List<String> collected = new ArrayList<>();
//        for (String string : lowerCaseStrings) {
//            String uppercaseString = string.toUpperCase();
//            collected.add(uppercaseString);
//        }
//        return collected;
    }

    public List<String> filterDigitStrings(List<String> inputStrings) {
    	return inputStrings.stream()
				.filter(a -> isDigit(a.charAt(0)))
				.collect(toList());
//        List<String> beginningWithNumbers = new ArrayList<>();
//        for (String value : inputStrings) {
//            if (isDigit(value.charAt(0))) {
//                beginningWithNumbers.add(value);
//            }
//        }
//        return beginningWithNumbers;
    }

    public List<String> getNames(List<Student> students) {
    	return students.stream()
				.map(Student::getName)
				.collect(toList());
//        List<String> names = new ArrayList<>();
//        for (Student student : students) {
//            names.add(student.getName());
//        }
//        return names;
    }

	public Map<String, Long> groupStudents(List<Student> students) {
    	return students.stream()
				.map(Student::getName)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//				.collect(Collectors.toMap(x -> x.getName()))
//
//				.group(student -> student.getName())



//
//        HashMap<String, Integer> groupedStudents = new HashMap<>();
//        for (Student student: students) {
//            Integer count = groupedStudents.get(student.getName());
//            if (count != null) {
//                groupedStudents.put(student.getName(), count + 1);
//            } else {
//                groupedStudents.put(student.getName(), 1);
//            }
//        }
//        return groupedStudents;
    }

    //Anonymous class -> to functional interface.


}
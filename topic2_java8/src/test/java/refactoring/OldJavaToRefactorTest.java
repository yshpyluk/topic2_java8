package refactoring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class OldJavaToRefactorTest {

    private OldJavaToRefactor code;

    @Before
    public void init() {
        code = new OldJavaToRefactor();
    }

    @Test
    public void testLoanSum() {
        assertEquals(17, code.countLetters(Arrays.asList("Java", "9", "is", "coming", "soon")));
    }

    @Test
    public void testNumberOfCities(){
        assertEquals(3, code.cityCount(Arrays.asList("Lviv", "Kyiv", "Lviv", "Sun Frankivsk", "Boston", "Lviv"), "Lviv"));
    }


    @Test
    public void testTransformToUpperCase() {
		List<String> actualList = Arrays.asList("first", "second");
		List<String> expectedList = Arrays.asList("FIRST", "SECOND");

        assertTrue(expectedList.containsAll(code.transformToUpperCase(actualList)));
    }

    @Test
	public void testFilterDigitStrings() {
		List<String> actualList = Arrays.asList("1first", "2second", "some", "text", "3third");
		List<String> expectedList = Arrays.asList("1first", "2second", "3third");

		assertTrue(expectedList.containsAll(code.filterDigitStrings(actualList)));
	}

	@Test
	public void testGetNames() {
    	List<Student> students = new ArrayList<>();
    	students.add(new Student("Andriy", "A"));
    	students.add(new Student("Sergiy", "B"));
    	students.add(new Student("Olga", "B"));
    	students.add(new Student("Oksana", "B"));

    	List<String> names = Arrays.asList("Andriy", "Sergiy", "Olga", "Oksana");

		assertTrue(names.containsAll(code.getNames(students)));
	}

	@Test
	public void testGroupStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Andriy", "A"));
		students.add(new Student("Sergiy", "B"));
		students.add(new Student("Olga", "B"));
		students.add(new Student("Sergiy", "B"));
		students.add(new Student("Olga", "C"));

		Map<String, Integer> expected = new HashMap<>();
		expected.put("Andriy", 1);
		expected.put("Sergiy", 2);
		expected.put("Olga", 2);

//		Map<String, Integer> actual = code.groupStudents(students);
//		for (Map.Entry entry: expected.entrySet()){
//			assertTrue(actual.get(entry.getKey()) == entry.getValue());
//		}

		code.groupStudents(students).entrySet()
				.forEach(a -> assertTrue(new Long(expected.get(a.getKey())).equals(a.getValue())));
	}

    //Add here test to all methods of OldJavaToRefactor

}
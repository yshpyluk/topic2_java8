package refactoring;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

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

    //Add here test to all methods of OldJavaToRefactor

}
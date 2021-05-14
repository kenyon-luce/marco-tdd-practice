import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FirstTests {
    //not going to use a main method this time
    //instead we will be using ANNOTATIONS (@Do-this)

    @Test
    public void firstTest() {
        System.out.println("Inside our first test");
        //returns "test passed" after running (since we aren't testing anything technically)
    }

    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual); //"test passed"
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5); //as long as the returned change (expected) is not more than 50 cents off, it will pass
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();

        Object clonedSheep = sheep;

        Object instructor1 = new String("Douglass");
        Object instructor2 = new String("Douglass");

//        assertSame(dog, sheep); //"test failed", dog and sheep are both objects, but they have different names
        assertNotSame(dog, sheep); //"test passed"
        assertSame(sheep, clonedSheep); //"test passed"
//        assertSame(instructor1, instructor2); //"test failed", looks at variable name
        assertEquals(instructor1, instructor2); //"test passed", looks at value
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J', 'u', 'n', 'i', 't'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {
        boolean learningTDD = true;

        assertTrue(learningTDD);
//        assertFalse(learningTDD); //"test failed"
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    private List<String> names;

    @Before
    public void setUp() {
        this.names = new ArrayList<>();
        this.names.add("Fer");
    }

    // We can verify that the names list is not longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void testIfNamesIsInitialized() {
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded() {
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size()); //false, since startup runs before everything else (@Before above it) it looks at that first, resulting in a "reset" and ignoring whatever was added to it in the tests below
//        assertSame("fer", this.names.get(0)); //"test failed"
        assertSame("Zach", this.names.get(1));
    }
}

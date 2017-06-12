import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void calculate_0() {
        int testIndex = 0;
        int expectedResult = 1;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }

    @Test
    public void calculate_1() {
        int testIndex = 1;
        int expectedResult = 1;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }

    @Test
    public void calculate_6() {
        int testIndex = 6;
        int expectedResult = 13;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }

    @Test
    public void calculate_20() {
        int testIndex = 20;
        int expectedResults = 10946;

        assertEquals(expectedResults, fibonacci.calculate(testIndex));
    }
//
//    @Test
//    public void calculate_negative() {
//        int testIndex = -5;
//        int expectedResults = 0;
//
//        assertEqual(expectedResults, fibonacci.calculate(testIndex));
//    }
}

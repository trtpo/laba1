package demo.parallel;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    private Complex testValue_10_15;
    private Complex testValue_7_9;

    @BeforeEach
    void init() {
        testValue_10_15 = new Complex (10.0, 15.0);
        testValue_7_9 = new Complex (7.0, 9.0);
    }

    @Test
    void subtractNormalTest() {
        String errorMessage = "Subtraction error.";
        testValue_10_15.minus(testValue_7_9);
        assertEquals(testValue_10_15, new Complex(3.0, 6.0), errorMessage);
    }

    @Test
    void divideZeroTest() {
        String errorMessage = "Division by zero error.";
        assertThrows(ArithmeticException.class, () ->
                testValue_10_15.divide(new Complex(0, 0)), errorMessage);
    }

    @Test
    void divideNormalTest() {
        String errorMessage = "Normal division error.";
        testValue_10_15.divide(testValue_7_9);
        assertEquals(testValue_10_15, new Complex(41.0 / 26.0, 3.0 / 26.0), errorMessage);
    }
}
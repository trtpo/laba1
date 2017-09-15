package demo.parallel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    //objects for division test
    private static Complex numeratorForDivisionTest;
    private static Complex nonZeroDenominatorForDivisionTest;
    private static Complex zeroDenominatorForDivisionTest;
    //objects for sine function test
    private static Complex zeroNumberForSineTest;
    private static Complex nonZeroNumberForSineTest;
    //objects for cosine function test
    private static Complex zeroNumberForCosineTest;
    private static Complex nonZeroNumberForCosineTest;

    @BeforeAll
    static void initializeTest() {
        numeratorForDivisionTest = new Complex(-2, 1);
        nonZeroDenominatorForDivisionTest = new Complex(1, -1);
        zeroDenominatorForDivisionTest = new Complex(0, 0);
        zeroNumberForSineTest = new Complex(0, 0);
        nonZeroNumberForSineTest = new Complex(3, 5);
        zeroNumberForCosineTest = new Complex(0, 0);
        nonZeroNumberForCosineTest = new Complex(5, -5.32);
    }

    @Test
    void divideOperationTest() {
        Complex expectedResult = new Complex(-1.5, -0.5);
        assertAll("Divide operation test",
                () -> assertEquals(numeratorForDivisionTest.div(nonZeroDenominatorForDivisionTest), expectedResult, "Divide by non-zero test"),
                () -> assertThrows(ArithmeticException.class, () -> numeratorForDivisionTest.div(zeroDenominatorForDivisionTest), "Divide by zero test"));
    }

    @Test
    void sineFunctionTest() {
        Complex expectedSineOfZero = new Complex(0, 0);
        Complex expectedSizeofNonZero = new Complex(10.47, -73.46);

        assertAll("Sine function test",
                () -> assertEquals(zeroNumberForSineTest.sin(), expectedSineOfZero, "Sine function test for zero"),
                () -> assertEquals(nonZeroNumberForSineTest.sin(), expectedSizeofNonZero, "Sine function test for non-zero"));
    }

    @Test
    void cosineFunctionTest() {
        Complex expectedCosineOfZero = new Complex(1, 0);
        Complex expectedCosineOfNonZero = new Complex(28.99, -97.99);

        assertAll("Cosine function test",
                () -> assertEquals(zeroNumberForCosineTest.cos(), expectedCosineOfZero, "Cosine function test for zero"),
                () -> assertEquals(nonZeroNumberForCosineTest.cos(), expectedCosineOfNonZero, "Cosine function test for non-zero"));
    }

}
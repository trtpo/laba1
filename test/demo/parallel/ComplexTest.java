package demo.parallel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    @Test
    void divideOperationTest() {
        Complex Numerator = new Complex(-2, 1);
        Complex nonZeroDenominator = new Complex(1, -1);
        Complex expectedResult = new Complex(-1.5, -0.5);
        Complex zeroDenominator = new Complex(0, 0);

        assertAll("Divide operation test",
                () -> assertEquals(Numerator.div(nonZeroDenominator), expectedResult, "Divide by non-zero test"),
                () -> assertThrows(ArithmeticException.class, () -> Numerator.div(zeroDenominator), "Divide by zero test"));
    }

    @Test
    void sineFunctionTest() {
        Complex zeroNumber = new Complex(0, 0);
        Complex expectedSineOfZero = new Complex(0, 0);

        Complex nonZeroNumber = new Complex(3, 5);
        Complex expectedSizeofNonZero = new Complex(10.47, -73.46);

        assertAll("Sine function test",
                () -> assertEquals(zeroNumber.sin(), expectedSineOfZero, "Sine function test for zero"),
                () -> assertEquals(nonZeroNumber.sin(), expectedSizeofNonZero, "Sine function test for non-zero"));
    }

    @Test
    void cosineFunctionTest() {
        Complex zeroNumber = new Complex(0, 0);
        Complex expectedCosineOfZero = new Complex(1, 0);

        Complex nonZeroNumber = new Complex(5, -5.32);
        Complex expectedCosineOfNonZero = new Complex(28.99, -97.99);

        assertAll("Cosine function test",
                () -> assertEquals(zeroNumber.cos(), expectedCosineOfZero, "Cosine function test for zero"),
                () -> assertEquals(nonZeroNumber.cos(), expectedCosineOfNonZero, "Cosine function test for non-zero"));
    }

}
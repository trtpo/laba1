package demo.parallel;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ComplexTest {

    @BeforeClass
    public static void allTestsStarted() {
        System.out.println("All tests started");
    }

    @AfterClass
    public static void allTestsFinished() {
        System.out.println("All tests finished");
    }

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void testAddingPositiveNumbers() {
        // arrange
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        Complex expectedResult = new Complex(2, 2);
        // aсt
        Complex actualResult = a.plus(b);
        // assert
        assertEquals("Addition of 2 numbers with '+' sign was calculated incorrectly",
                expectedResult.toString(),
                actualResult.toString()
        );
    }

    @Test
    public void testAddingNegativeNumbers() {
        Complex a = new Complex(-1, -1);
        Complex b = new Complex(-1, -1);
        Complex expectedResult = new Complex(-2, -2);
        Complex actualResult = a.plus(b);
        assertEquals("Addition of 2 numbers with '-' sign was calculated incorrectly",
                expectedResult.toString(),
                actualResult.toString()
        );
    }

    @Test
    public void testSubtractionPositiveNumbers() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        Complex expectedResult = new Complex(0, 0);
        Complex actualResult = a.minus(b);
        assertEquals("Subtraction 2 numbers with '+' signs  was calculated incorrectly",
                expectedResult.toString(),
                actualResult.toString()
        );
    }

    @Test
    public void testSubtractionNegativeNumbers() {
        Complex a = new Complex(-1, -1);
        Complex b = new Complex(-1, -1);
        Complex expectedResult = new Complex(0, 0);
        Complex actualResult = a.minus(b);
        assertEquals("Subtraction 2 numbers with '-' signs  was calculated incorrectly",
                expectedResult.toString(),
                actualResult.toString()
        );
    }

    @Test
    @Ignore
    public void testSubtractionPositiveAndNegativeNumbers() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(-1, -1);
        Complex expectedResult = new Complex(2, 2);
        Complex actualResult = a.minus(b);
        assertEquals("Subtraction 2 numbers with opposite signs  was calculated incorrectly",
                expectedResult.toString(),
                actualResult.toString()
        );
    }

    @Test
    public void testDivisionNumbersWithExceptionWithMessage() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(0, 0);
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Division by zero is forbidden");
        a.divide(b);
    }

    @Test
    public void testDivisionNumbers() {
        Complex a = new Complex(10, 10);
        Complex b = new Complex(5, 5);
        Complex expectedResult = new Complex(2, 0);
        Complex actualResult = a.divide(b);
        assertEquals("Divide 2 numbers completed incorrectly",
                expectedResult.toString(),
                actualResult.toString()
        );
    }

    @Test
    public void testMultiplicationTwoNumbers() {
        Complex a = new Complex(10, 10);
        Complex b = new Complex(5, 5);
        Complex expectedResult = new Complex(0, 100);
        Complex actualResult = a.times(b);
        assertEquals("The operation of multiplication is not correct",
                expectedResult.toString(),
                actualResult.toString()
        );
    }

    @Test
    public void testMultiplyNumberByZero() {
        Complex a = new Complex(10, 10);
        Complex b = new Complex(0, 0);
        Complex expectedResult = new Complex(0, 0);
        Complex actualResult = a.times(b);
        assertEquals("The operation of multiplication is not correct",
                expectedResult.toString(),
                actualResult.toString()
        );
    }

    @Test
    public void testConjugateWithNotZeroIm() {
        Complex a = new Complex(10, 10);
        Complex expectedResult = new Complex(10, -10);
        Complex actualResult = a.conjugate();
        assertEquals("Complex conjugate number is calculated wrong",
                expectedResult.toString(),
                actualResult.toString()
        );
    }

    @Test
    public void testConjugateWithZeroIm() {
        Complex a = new Complex(10, 0);
        Complex expectedResult = new Complex(10, 0);
        Complex actualResult = a.conjugate();
        assertEquals("Complex conjugate number is calculated wrong",
                expectedResult.toString(),
                actualResult.toString()
        );
    }

    @Test
    public void testGetLengthSQOperation() {
        //arrange
        Complex a = new Complex(10, 2);
        //act
        double actualResult = a.lengthSQ();
        //assert
        assertEquals("Square length received incorrectly", 104, actualResult, 0);
    }

    @Test
    public void testGetReOperation() {
        Complex a = new Complex(10, 2);
        double actualResult = a.getRe();
        assertEquals("Getter for the real part works wrong", 10, actualResult, 0);
    }

    @Test
    public void testGetImOperation() {
        Complex a = new Complex(10, 2);
        double actualResult = a.getIm();
        assertEquals("Getter for the real part works wrong", actualResult, 2, 0);
    }

    @Test
    public void testToStringOperation() {
        Complex a = new Complex(10, 2);
        String actualResult = a.toString();
        assertEquals("Converting to string works wrong", actualResult, "10.0 + 2.0 * i");
    }
}

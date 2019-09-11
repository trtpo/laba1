package demo.parallel;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArithmeticOperations {

    @Test
    public void ComplexSumEqualsZeroTest()
    {
        Complex a = new Complex(-5.2, -3.8);
        Complex b = new Complex( 5.2, 3.8);
        Complex currentResult = a.plus(b);

        Complex expectedResult = new Complex(0,0);

        assertEquals(currentResult, expectedResult);
    }

    @Test
    public void ComplexSumNegativeTest()
    {
        Complex a = new Complex(-6.5, -2.3);
        Complex b = new Complex(-9.1, -10.5);
        Complex currentResult = a.plus(b);

        Complex expectedResult = new Complex(-15.6, -12.8);

        assertEquals(currentResult, expectedResult);
    }

    @Test
    public void ComplexSumPositiveNegativeTest()
    {
        Complex a = new Complex(11.6, 9.4);
        Complex b = new Complex(-3.8, -2.5);
        Complex currentResult = a.plus(b);

        Complex expectedResult = new Complex(7.8, 6.9);

        assertEquals(currentResult, expectedResult);
    }

    @Test
    public void ComplexSubtractEqualsZeroTest()
    {
        Complex a = new Complex(11.6, 9.4);
        Complex b = new Complex(11.6, 9.4);
        Complex currentResult = a.minus(b);

        Complex expectedResult = new Complex(0,0);

        assertEquals(currentResult, expectedResult);
    }

    @Test
    public void ComplexSubtractionNegativeTest()
    {
        Complex a = new Complex(12.4, 8.9);
        Complex b = new Complex(5.1, 4.6);
        Complex currentResult = a.minus(b);

        Complex expectedResult = new Complex(7.3, 4.3);

        assertEquals(currentResult, expectedResult);
    }

    @Test
    public void ComplexSubtractionPositiveNegativeTest()
    {
        Complex a = new Complex(9.8, 15.4);
        Complex b = new Complex(-4.2, -1.8);
        Complex currentResult = a.minus(b);

        Complex expectedResult = new Complex(14,17.2);

        assertEquals(currentResult, expectedResult);
    }

    @Test
    public void ComplexMultiplicationZeroTest()
    {
        Complex a = new Complex(5.5, 8.9);
        Complex b = new Complex(0,0);
        Complex currentResult = a.times(b);

        Complex expectedResult = new Complex(0,0);

        assertEquals(currentResult, expectedResult);
    }

    @Test
    public void ComplexMultiplicationNegativeTest()
    {
        Complex a = new Complex(-1.23, -0.67);
        Complex b = new Complex(-0.55, -2.54);
        Complex currentResult = a.times(b);

        Complex expectedResult = new Complex(-1.0253, 3.4927);

        assertEquals(currentResult, expectedResult);
    }

    @Test
    public void ComplexMultiplicationPositiveNegativeTest()
    {
        Complex a = new Complex(2.46, 8.12);
        Complex b = new Complex(-3.85, -5.87);
        Complex currentResult = a.times(b);

        Complex expectedResult = new Complex(38.1934, -45.7022);

        assertEquals(currentResult, expectedResult);
    }

    @Test(expected = java.lang.AssertionError.class)
    public void ComplexDivisionZeroTest()
    {
        Complex a = new Complex(2.46, 8.12);
        Complex b = new Complex(0,0);
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Complex currentResutl = a.divideBy(b);
        });
    }
    @Test
    public void ComplexDivisionCustomTest()
    {
        Complex a = new Complex(4.86, -2.98);
        Complex b = new Complex(-5.21, 8.76);
        Complex currentResult = a.divideBy(b);

        Complex expectedResult = new Complex(-0.495, -0.26);

        assertEquals(currentResult, expectedResult);
    }

}

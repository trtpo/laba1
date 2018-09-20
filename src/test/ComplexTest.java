package test;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
    private Complex a;
    private Complex b;
    private static double DELTA = 0.01;

    @Before
    public void initNumbers() {
        a = new Complex(-1, 3);
        b = new Complex(1, 2);
    }

    @Test
    public void divideComplexNumberOnValidAnotherShouldReturnValidComplexNumber() {
        final Complex temp = a.divide(b);
        final String errorMessage = "Expected and result values are different";
        Assert.assertEquals(errorMessage, temp.getReal(), 1, DELTA);
        Assert.assertEquals(errorMessage, temp.getImag(), 1, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideComplexNumberOnZeroShouldThrowIllegalArgumentExceptionTest() {
        a.divide(new Complex(0, 0));
    }

    @Test
    public void subtractComplexNumberShouldReturnValidComplexNumber() {
        final Complex temp = a.subtract(b);
        Assert.assertEquals(temp.getReal(), -2.0, DELTA);
        Assert.assertEquals(temp.getImag(), 1.0, DELTA);
    }

    @Test()
    public void tanComplexNumberShouldReturnValidComplexTest() {
        Complex c = new Complex(1, 1);
        Complex result = c.tan();
        Complex expected = new Complex(0.271, 1.083);
        final String errorMessage = "Expected and result values are different";
        Assert.assertEquals(errorMessage, expected.getReal(), result.getReal(), DELTA);
        Assert.assertEquals(errorMessage, expected.getImag(), result.getImag(), DELTA);
    }
}

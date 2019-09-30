package demo.parallel;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void testSubtraction() {
        Complex a = new Complex(4, 10);
        Complex b = new Complex(3, -7);
        Complex result = a.minus(b);
        assertEquals(new Complex(1, 17), result);
    }

    @Test
    public void testSubtractionOfNegativeNumbers() {
        Complex a = new Complex(-4, -10);
        Complex b = new Complex(-3, -7);
        Complex result = a.minus(b);
        assertEquals(new Complex(-1, -3), result);
    }

    @Test
    public void testSubtractionOfPositiveNumbers() {
        Complex a = new Complex(4, 10);
        Complex b = new Complex(3, 7);
        Complex result = a.minus(b);
        assertEquals(new Complex(1, 3), result);
    }

    @Test (expected = java.lang.ArithmeticException.class)
    public void testDivisionByZero() {
        Complex a = new Complex(10,4);
        Complex b = new Complex(0,0);
        Complex result = a.division(b);
        Assert.fail();
    }

    @Test
    public void testDivision() {
        Complex a = new Complex(20, 50);
        Complex b = new Complex(12, 1);
        Complex result = a.division(b);
        assertEquals(new Complex(2, 4), result);
    }

    @Test
    public void testSinOfZero() {
        Complex a = new Complex(0,0);
        Complex result = a.sin();
        assertEquals(new Complex(0,0), result);
    }

    @Test
    public void testSin() {
        Complex a = new Complex(4,-5);
        Complex result = a.sin();
        double real = Math.sin(4) * Math.cosh(-5);
        double imag = Math.cos(4) * Math.sinh(-5);
        assertEquals(new Complex(real, imag), result);
    }

    @Test
    public void testCos() {
        Complex a = new Complex(4,-5);
        Complex result = a.cos();
        double real = Math.cos(4) * Math.cosh(-5);
        double imag = -Math.sin(4) * Math.sinh(-5);
        assertEquals(new Complex(real, imag), result);
    }
}
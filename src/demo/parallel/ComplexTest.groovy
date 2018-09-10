package demo.parallel

import org.junit.Assert
import org.junit.Test

public class ComplexTest {

    @Test
    public void testMinus() throws Exception {
        Complex a = new Complex(10, 10);
        Complex b = new Complex(7, 5);
        a.minus(b);
        Assert.assertEquals("Real part:", 3.0, a.getRe(), 0.0);
        Assert.assertEquals("Imaginary part:", 5.0, a.getIm(), 0.0);
    }

    @Test
    public void testDivide() throws Exception {
        Complex a = new Complex(4, 5);
        Complex b = new Complex(2, 3);
        double real = (4.0 * 2.0 + 5.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
        double imag = (2.0 * 5.0 - 4.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
        a.divide(b);
        Assert.assertEquals("Real part:", real, a.getRe(), 0.0);
        Assert.assertEquals("Imaginary part:", imag, a.getIm(), 0.0);
    }

    @Test
    public void testDivideByZero() {
        Complex a = new Complex(4, 5);
        Complex b = new Complex(0, 0);
        try {
            a.divide(b);
            Assert.fail("Expected an IndexOutOfBoundsException to be thrown");
        } catch(IllegalArgumentException ex) {
        }
    }

    @Test
    public void testDivideByNull() {
        Complex a = new Complex(4, 5);
        Complex b = null;
        Assert.assertEquals(a.divide(b), a);
    }

}

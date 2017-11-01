package demo.parallel;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    @org.junit.Test
    public void minus() throws Exception {
        Complex a = new Complex(16, 18);
        Complex b = new Complex(3, -3);
        a.minus(b);
        assertEquals((double) 13, a.getRe(), 0.0);
        assertEquals((double) 21, a.getIm(), 0.0);

    }

    @org.junit.Test
    public void divide() throws Exception {
        Complex a = new Complex(4, 5);
        Complex b = new Complex(2, 3);
        double real = (4.0 * 2.0 + 5.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
        double imag = (2.0 * 5.0 - 4.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
        a.divide(b);
        assertEquals(real, a.getRe(), 0.0);
        assertEquals(imag, a.getIm(), 0.0);
    }

}
package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    private static final double DELTA = 0.001;

    @Test
    public void testSin() {
        Complex c = new Complex(2, 2);
        c = c.sin();

        assertEquals(3.421, c.getRe(), DELTA);
        assertEquals(-1.509, c.getIm(), DELTA);

        System.out.println("Unit testSin finished without error.");
    }

    @Test
    public void testCos() {
        Complex c = new Complex(3, 2);
        c = c.cos();

        assertEquals(-3.724, c.getRe(), DELTA);
        assertEquals(-0.512, c.getIm(), DELTA);

        System.out.println("Unit testCos finished without error.");
    }

    @Test
    public void testReciprocal() {
        Complex c = new Complex(3, 1);
        c = c.reciprocal();

        assertEquals(0.3, c.getRe(), DELTA);
        assertEquals(-0.1, c.getIm(), DELTA);

        System.out.println("Unit testReciprocal finished without error.");
    }

    @Test
    public void testDivides() {
        Complex divider = new Complex(3, 1);
        Complex divident = new Complex(1, 2);

        assertEquals(0.5, divident.divides(divider).getRe(), DELTA);
        assertEquals(0.5, divident.getIm(), DELTA);

        System.out.println("Unit testDivides finished without error.");
    }
}
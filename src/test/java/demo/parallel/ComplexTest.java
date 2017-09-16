package demo.parallel;

import org.junit.rules.ExpectedException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        c1 = new Complex(10, 15);
        c2 = new Complex(3, 4);

        c3 = new Complex(-5, -8);
        c4 = new Complex(-1, -9);

        c5 = new Complex(-5.55, -6.66);
        c6 = new Complex(-5.55, -6.66);

        c7 = new Complex(5, 7);
        c8 = new Complex(0, 0);

        c9 = new Complex(7, -4);
        c10 = new Complex(3, 2);
    }

    @Test
    public void testSubtracting() throws Exception {
        Complex temp = c1.minus(c2);
        assertEquals("Error in subtracting positive complex numbers (real part)", 7, temp.getReal(), 0.0);
        assertEquals("Error in subtracting positive complex numbers (imagine part)", 11, temp.getImagine(), 0.0);

        temp = c3.minus(c4);
        assertEquals("Error in subtracting negative complex numbers (real part)", -4, temp.getReal(), 0.0);
        assertEquals("Error in subtracting negative complex numbers (imagine part)", 1, temp.getImagine(), 0.0);

        temp = c5.minus(c6);
        assertEquals("Error in subtracting equal negative complex numbers (real part)", 0.0, temp.getReal(), 0.0);
        assertEquals("Error in subtracting equal negative complex numbers (imagine part)", 0.0, temp.getImagine(), 0.0);

    }

    @Test
    public void testDividing() throws Exception {
        Complex temp = c1.divide(c2);
        double re = (10.0 * 3.0 + 15.0 * 4.0) / (3.0 * 3.0 + 4.0 * 4.0);
        assertEquals("Error in dividing positive numbers (real part)", re, temp.getReal(), 0.0);
        double im = (3.0 * 15.0 - 4.0 * 10.0) / (3.0 * 3.0 + 4.0 * 4.0);
        assertEquals("Error in dividing positive numbers (imagine part)", im, temp.getImagine(), 0.0);

        thrown.expect(ArithmeticException.class);
        c7.divide(c8);

        temp = c9.divide(c10);
        re = 1;
        assertEquals("Error in dividing positive numbers (real part)", re, temp.getReal(), 0.0);
        im = -2;
        assertEquals("Error in dividing positive numbers (imagine part)", im, temp.getImagine(), 0.0);

    }

}
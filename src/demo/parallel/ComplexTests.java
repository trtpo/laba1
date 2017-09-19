package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

public class ComplexTests extends Assert {

    /*
     * Testing new subtraction method
     */

    @Test
     public void subtractionPass() {
        Complex a = new Complex(3, 2);
        Complex b = new Complex(1,1);

        a.minus(b);

        assertEquals(2, a.getReal(), 0);
        assertEquals(1, a.getImag(), 0);
    }

    public void subtractionPassNegative() {
        Complex a = new Complex(3, 7);
        Complex b = new Complex(4,9);

        a.minus(b);

        assertEquals(-1, a.getReal(), 0);
        assertEquals(-2, a.getImag(), 0);
    }

    public void subtractionFail() {
        Complex a = new Complex(3, 7);
        Complex b = new Complex(2,3);

        a.minus(b);

        assertEquals(2, a.getReal(), 0);
        assertEquals(1, a.getImag(), 0);
    }

    /*
     * Test for division method
     */

    public void divisionPass() {
        Complex a = new Complex(2, 6);
        Complex b = new Complex(1,2);

        a.division(b);

        assertEquals(2,8, a.getReal(), 0);
        assertEquals(0,4, a.getImag(), 0);
    }

    public void divisionFail() {
        Complex a = new Complex(4, 6);
        Complex b = new Complex(2,4);

        a.division(b);

        assertEquals(1.6, a.getReal(), 0);
        assertEquals(-0.1, a.getImag(), 0);
    }

    public void divisionFailZero() {
        Complex a = new Complex(5, 7);
        Complex b = new Complex(0,0);

        a.division(b);

        assertEquals("Illegal operation.", 0, a.getReal(), 0);
        assertEquals("Illegal operation.", 0, a.getImag(), 0);
    }
}

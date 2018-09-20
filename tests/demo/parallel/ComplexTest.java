package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit tests for new complex number operations
 */
public class ComplexTest extends  Assert{

    /**
     * Tests for subtraction operation
     */
    @Test
    public void minusTestPositive() {
        Complex a = new Complex(4, 3);
        Complex b = new Complex(2, 2);
        a.minus(b);
        assertEquals(2, a.getReal(), 0);
        assertEquals(1, a.getImag(), 0);
    }

    @Test
    public void minusTestNegative() {
        Complex a = new Complex(2, 6);
        Complex b = new Complex(3, 8);
        a.minus(b);
        assertEquals(-1, a.getReal(), 0);
        assertEquals(-2, a.getImag(), 0);
    }

    /**
     * Tests for divisions operations
     */
    @Test
    public void divideTest() {
        Complex a = new Complex(2, 6);
        Complex b = new Complex(1, 2);
        a.divide(b);
        assertEquals(2.8, a.getReal(), 0);
        assertEquals(0.4, a.getImag(), 0);
    }

    @Test(expected = AssertionError.class)
    public void divideTestZero() {
        Complex a = new Complex(5, 6);
        Complex b = new Complex(0, 0);
        a.divide(b);
        assertEquals("Illegal operation in method divide(Complex) of Complex file. Argument: Complex(0,0).", 0, a.getReal(), 0);
        assertEquals("Illegal operation in method divide(Complex) of Complex file. Argument: Complex(0,0).", 0, a.getImag(), 0);
    }

}


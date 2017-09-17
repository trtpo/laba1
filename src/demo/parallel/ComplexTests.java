package demo.parallel;
import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit tests for new complex number operations
 */
public class ComplexTests extends  Assert{

    /**
     * Tests for subtraction operation
     */
    @Test
     public void minusTestOK() {
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

    @Test
    public void minusTestWrong() {
        Complex a = new Complex(2, 6);
        Complex b = new Complex(1, 2);
        a.minus(b);
        assertEquals(2, a.getReal(), 0);
        assertEquals(1, a.getImag(), 0);
    }

    /**
     * Tests for division operations
     */
    @Test
    public void divisionTestCorrect() {
        Complex a = new Complex(2, 6);
        Complex b = new Complex(1, 2);
        a.division(b);
        assertEquals(2.8, a.getReal(), 0);
        assertEquals(0.4, a.getImag(), 0);
    }

    @Test
    public void divisionTestWrong() {
        Complex a = new Complex(4, 6);
        Complex b = new Complex(2, 4);
        a.division(b);
        assertEquals(1.6, a.getReal(), 0);
        assertEquals(-0.1, a.getImag(), 0);
    }

    @Test
    public void divisionTestZero() {
        Complex a = new Complex(4, 6);
        Complex b = new Complex(0, 0);
        a.division(b);
        assertEquals("Illegal operation.", 0, a.getReal(), 0);
        assertEquals("Illegal operation.", 0, a.getImag(), 0);
    }

}


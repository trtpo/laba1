package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void substractionPositiveNumbers() {
        Complex a = new Complex(18, 6);
        Complex b = new Complex(3, 8);
        Complex result = a.minus(b);
        assertEquals(new Complex(15, -2), result);
    }

    @Test
    public void substractionNegativeNumbers() {
        Complex a = new Complex(-18, -6);
        Complex b = new Complex(-3, -8);
        Complex result = a.minus(b);
        assertEquals(new Complex(-15, -2), result);
    }

    @Test
    public void substractionPositiveAndNegativeNumbers() {
        Complex a = new Complex(18, -6);
        Complex b = new Complex(-3, 8);
        Complex result = a.minus(b);
        assertEquals(new Complex(21, -14), result);
    }

    @Test
    public void divisionPositiveNumbers() {
        Complex a = new Complex(5, 10);
        Complex b = new Complex(1, 2);
        Complex result = a.division(b);
        assertEquals(new Complex(5, 0), result);
    }

    @Test
    public void divisionNegativeNumbers() {
        Complex a = new Complex(-2, -4);
        Complex b = new Complex(-1, -2);
        Complex result = a.division(b);
        assertEquals(new Complex(2, 0), result);
    }

    @Test
    public void divisionPositiveAndNegativeNumbers() {
        Complex a = new Complex(13, 1);
        Complex b = new Complex(7, -6);
        Complex result = a.division(b);
        assertEquals(new Complex(1, 1), result);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivisionByZero()
    {
        Complex a = new Complex(1,2);
        Complex b = new Complex(0,0);
        Complex result =a.division(b);
        Assert.fail();
    }
}

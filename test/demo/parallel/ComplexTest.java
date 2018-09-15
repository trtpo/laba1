package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    private static final double DELTA = 1e-15;

    @Before
    public void setup() {}

    @After
    public void destroy() {}

    @Test
    public void getReTestZero() {

        Complex a = new Complex(0, 0);

        assertEquals(a.getRe(), 0, DELTA);
    }

    @Test
    public void getReTestPositive() {

        Complex b = new Complex(10,0);

        assertEquals(b.getRe(), 10, DELTA);
    }

    @Test
    public void getReTestNegative() {

        Complex c = new Complex(-10, 0);

        assertEquals(c.getRe(), -10, DELTA);
    }

    @Test
    public void getImTestZero() {

        Complex a = new Complex(0,0);

        assertEquals(a.getIm(), 0, DELTA);
    }

    @Test
    public void getImPositive() {

        Complex b = new Complex(10, 10);

        assertEquals(b.getIm(), 10);
    }

    @Test
    public void getImNegative() {

        Complex c = new Complex(10, -10);

        assertEquals(c.getIm(), -10);
    }

    @Test
    public void isNaNTest() {

        Complex a = new Complex(0,0);

        assertFalse(a.isNaN());
    }

    @Test
    public void divideByZeroTest() {

        Complex a = new Complex(12, 5);
        Complex zero = new Complex(0, 0);

        a.divide(zero);

        assertTrue(a.isNaN());
    }

    @Test
    public void divideTest() {

        Complex a = new Complex(12, -3);
        Complex b = new Complex(3, 3);

        a.divide(b);

        assertTrue(a.equal(new Complex(1.5, -2.5)));
    }

    @Test
    public void minusTestPositive() {

        Complex a = new Complex(12, 9);
        Complex subtrahend = new Complex(12, -7);

        a.minus(subtrahend);

        assertTrue(a.equal(new Complex(0, 16)));
    }

    @Test
    public void minusTestNegative() {

        Complex b = new Complex(-18, -1);
        Complex subtrahend = new Complex(12, -7);

        b.minus(subtrahend);

        assertTrue(b.equal(new Complex(-30, 6)));
    }

    @Test
    public void minusTestZero() {

        Complex c = new Complex(12, -3);
        Complex subtrahend = new Complex(12, -3);

        c.minus(subtrahend);

        assertTrue(c.equal(new Complex(0, 0)));
    }
}
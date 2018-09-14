package Test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void minusTest() {
        Complex a = new Complex(10, -32);
        Complex b = new Complex(-11, 34);
        Complex c = a.minus(b);
        assertEquals(c.getRe(), 21);
        assertEquals(c.getIm(), -66);
    }

    @Test
    void divideTest() {
        Complex a = new Complex(4, -1);
        Complex b = new Complex(-1, 2);
        Complex c = a.divide(b);
        assertEquals(c.getRe(), -1.2);
        assertEquals(c.getIm(), -1.4);
    }

    @Test
    public void divideByZeroTest() {
        Complex a = new Complex(4, 5);
        Complex b = new Complex(0, 0);
        assertEquals(a.divide(b), null);
    }
}
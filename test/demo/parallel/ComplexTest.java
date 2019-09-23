package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void minus() {
        Complex a = new Complex(1, 0);
        Complex b = new Complex(2,5);
        Complex c = new Complex(-2, -5);

        assertEquals(new Complex(1,5), b.minus(a));
        assertEquals(new Complex(3,10), b.minus(c));
        assertEquals(new Complex(-3, -5), c.minus(a));
    }

    @Test
    void divide() {
        Complex a = new Complex(5,5);
        Complex b = new Complex(1,1);
        Complex c = new Complex(0,0);
        Complex d = new Complex( 10, 10);

        assertEquals(new Complex(5,0), a.divide(b));
        assertEquals(new Complex(0.1,0), b.divide(d));

        assertTrue(Double.isNaN(a.divide(c).getIm()));
        assertTrue(Double.isNaN(a.divide(c).getRe()));

        assertTrue(Double.isNaN(b.divide(c).getIm()));
        assertTrue(Double.isNaN(b.divide(c).getRe()));
    }
}
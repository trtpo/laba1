package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void minus() {
        Complex a = new Complex(123, -9);
        Complex b = new Complex(-65, 78);
        Complex c = new Complex(-63, -89);

        assertEquals(new Complex(188, -87),a.minus(b));
        assertEquals(new Complex(-2, 167),b.minus(c));
    }

    @Test
    void divide() {
        Complex a = new Complex(7, -4);
        Complex b = new Complex(3, 2);
        Complex c = new Complex(2, -1);

        assertEquals(new Complex(1, -2),a.divide(b));
        assertEquals(new Complex(0.8, 1.4),b.divide(c));
    }
}
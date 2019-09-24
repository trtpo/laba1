import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    private final Complex ZERO = new Complex(0, 0);

    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(10, 15);
        Complex b = new Complex(2, 3);

        a.minus(b);

        Complex expected = new Complex(8, 12);
        assertEquals(a, expected);
    }

    @org.junit.jupiter.api.Test
    void minusSelf() {
        Complex a = new Complex(3, 5);

        a.minus(a);

        assertEquals(a, ZERO);
    }

    @org.junit.jupiter.api.Test
    void minusZero() {
        Complex orig = new Complex(5, 3);
        Complex a = new Complex(orig);

        a.minus(ZERO);

        assertEquals(a, orig);
    }

    @org.junit.jupiter.api.Test
    void div() {
        Complex a = new Complex(-2, 1);
        Complex b = new Complex(1, -1);

        a.div(b);

        Complex expected = new Complex(-1.5, -0.5);
        assertEquals(a, expected);
    }

    @org.junit.jupiter.api.Test
    void divByOne() {
        Complex a = new Complex(10, 7);
        Complex orig = new Complex(a);
        Complex one = new Complex(1, 0);

        a.div(one);

        assertEquals(a, orig);
    }

    @org.junit.jupiter.api.Test
    void divByZero() {
        Complex a = new Complex(5, 1);

        assertThrows(ArithmeticException.class, () -> a.div(ZERO));
    }
}
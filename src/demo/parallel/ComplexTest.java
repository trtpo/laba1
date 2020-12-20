package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void minus() {
        Complex actual = new Complex(0, 1);
        Complex expected = new Complex(-1, 0);

        actual.minus(new Complex(1, 1));

        assertEquals(actual, expected);
    }

    @Test
    void divide() {
        Complex actual = new Complex(0, 1);
        Complex expected = new Complex(-1, 0);

        actual.divide(new Complex(0,-1));

        assertEquals(expected, actual);
    }

    @Test
    void pow() {
        Complex actual = new Complex(0, 1);
        Complex expected = new Complex(-1, 0);

        actual.pow(2);

        assertEquals(expected, actual);
    }
}
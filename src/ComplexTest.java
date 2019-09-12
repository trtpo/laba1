import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import demo.parallel.Complex;

class ComplexTest {
    static private Complex a = null;
    static private Complex b = null;

    @BeforeAll
    static void setUp() {
        a = new Complex(1, 1);
        b = new Complex(2, 2);
    }

    @Test
    void equals() {
        assertFalse(a.equals(b));
    }

    @Test
    void conjugate() {
        Complex temp = a.conjugate();
        assertTrue(temp.getRe() == 1 && temp.getIm() == -1);
    }

    @Test
    void reciprocal() {
        Complex temp = a.reciprocal();
        assertTrue(temp.getRe() == 0.5 && temp.getIm() == -0.5);
    }

}
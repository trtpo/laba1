package tests;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class FractalTest {
    @Test
    void divide() {
        Complex n1 = new Complex(4, 7);
        Complex n2 = new Complex(1, 1);
        assertNotEquals("The division was failed", 0, n1.divide(n2).lengthSQ());
    }
    @Test
    void minus() {
        Complex n1 = new Complex(4, 7);
        Complex n2 = new Complex(2, 1);
        assertEquals(40, n1.minus(n2).lengthSQ(),0);
    }
}

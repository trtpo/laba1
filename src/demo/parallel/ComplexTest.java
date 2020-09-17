package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void minus() {
        Complex a = new Complex(5,4);
        Complex b = new Complex(2, 2);
        a.minus(b);
        assertEquals(new Complex(3, 2), a);
    }

    @Test
    void div() {
        Complex a = new Complex(3,4);
        Complex b = new Complex(2, 2);
        a.div(b);
        assertEquals(new Complex(1.75, 0.25), a);
    }
}

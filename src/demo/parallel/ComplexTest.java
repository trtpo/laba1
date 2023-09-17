package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;
public class ComplexTest {
    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(5.0, 3.0);
        Complex b = new Complex(2.0, 1.0);
        a.minus(b);
        assertEquals(3.0, a.getRe());
        assertEquals(2.0, a.getIm());
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        Complex a = new Complex(5.0, 3.0);
        Complex b = new Complex(2.0, 1.0);
        a.multiplication(b);
        assertEquals(10.0, a.getRe());
        assertEquals(3.0, a.getIm());
    }

}

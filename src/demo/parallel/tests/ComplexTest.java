package demo.parallel.tests;

import demo.parallel.Complex;
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
    void divide() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(1.0, 1.0);
        a.division(b);
        assertEquals(5 / 2.0, a.getRe(), 0.0001);
        assertEquals( 1 / 2.0, a.getIm(), 0.0001);
    }
}

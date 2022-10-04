package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionsTest {
    @Test
    public void testMinus() {
        Complex a = new Complex(10, 20);
        Complex b = new Complex(30, 40);
        a.minus(b);
        assertEquals(-20, a.getRe());
        assertEquals(-20, a.getIm());
    }

    @Test
    public void testPlus() {
        Complex a = new Complex(10, 20);
        Complex b = new Complex(30, 40);
        a.plus(b);
        assertEquals(40, a.getRe());
        assertEquals(60, a.getIm());
    }
}
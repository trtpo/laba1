package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    public void testMinus() throws Exception{
        Complex a = new Complex(18, 39);
        Complex b = new Complex(47,20);
        a.minus(b);
        assertEquals(-29, a.getRe());
        assertEquals(19, a.getIm());
    }

    @Test
    public void testPlus() throws Exception{
        Complex a = new Complex(18, 39);
        Complex b = new Complex(47,20);
        a.plus(b);
        assertEquals(65, a.getRe());
        assertEquals(59, a.getIm());
    }
}
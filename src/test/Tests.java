package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void testComplexPlus() throws Exception{
        Complex a = new Complex(30, -17);
        Complex b = new Complex(45,23);
        a.plus(b);
        assertEquals(75, a.getRe());
        assertEquals(6, a.getIm());
    }

    @Test
    public void testComplexTimes() throws Exception{
        Complex a = new Complex(5, -7);
        Complex b = new Complex(6,9);
        a.times(b);
        assertEquals(93, a.getRe());
        assertEquals(3, a.getIm());
    }

    @Test
    public void testComplexSub() throws Exception {
        Complex a = new Complex(1, 3);
        Complex b = new Complex(2,2);
        a.sub(b);
        assertEquals(-1, a.getRe());
        assertEquals(1, a.getIm());
    }

    @Test
    public void testComplexDivide() throws Exception {
        Complex a = new Complex(3, 3);
        Complex b = new Complex(2,4);
        a.divide(b);
        assertEquals(0.75, a.getRe());
        assertEquals(2.25, a.getIm());
    }
}

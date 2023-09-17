package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Tests {
    @Test
    public void multiplyByNumber() throws Exception{
        Complex a = new Complex(6, 24);
        int b = 4;
        a.multiplyByNumber(b);
        assertEquals(24, a.getRe());
        assertEquals(96, a.getIm());

    }

    @Test
    public void subtraction() throws Exception{
        Complex a = new Complex(6, 24);
        Complex b = new Complex(15, 22);
        a.subtraction(b);
        assertEquals(-9, a.getRe());
        assertEquals(2, a.getIm());

    }
}

package tests;

import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @org.junit.Test
    public void testMinus() throws Exception{
        Complex a = new Complex(1234, 45);
        Complex b = new Complex(500,8);
        a.minus(b);
        assertEquals(734, a.getParamRe());
        assertEquals(37, a.getParamIm());
    }

    @org.junit.Test
    public void testPlus() throws Exception{
        Complex a = new Complex(123, 34);
        Complex b = new Complex(10,56);
        a.plus(b);
        assertEquals(133, a.getParamRe());
        assertEquals(90, a.getParamIm());
    }
}
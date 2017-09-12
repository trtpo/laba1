package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void plus() throws Exception {
        Complex a = new Complex(50,-20);
        assertEquals("error in method minus()", a.plus(20), new Complex(70,-20));
    }

    @Test
    public void minus() throws Exception {
        Complex a = new Complex(50,-20);
        Complex b = new Complex(10,5);
        assertEquals("error in method minus()", a.minus(b), new Complex(40,-25));
    }

    @Test
    public void times() throws Exception {
        Complex a = new Complex(50,-20);
        assertEquals("error in method times()", a.times(5), new Complex(250,-100));
    }

    @Test
    public void div() throws Exception {
        Complex a = new Complex(50,-20);
        Complex b = new Complex(10,5);
        assertEquals("error in method div()", a.div(b), new Complex(3.2,-3.6));
    }

}
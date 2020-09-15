package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void div() {
        Complex a = new Complex(10, 10);
        Complex b = new Complex(10, 10);
        Complex expected = new Complex(1,0);
        Complex result = a.div(b);
        assertEquals(expected.re,result.re, 0);
        assertEquals(expected.im,result.im, 0);
    }

    @Test
    public void minus() {
        Complex a = new Complex(10,10);
        Complex b = new Complex(5,7);
        Complex result = a.minus(b);

        Complex expected = new Complex(5,3);
        assertEquals(expected.re,result.re, 0);
        assertEquals(expected.im,result.im, 0);
    }

    @Test
    public void abs() {
        Complex a = new Complex(10,10);
        double expected = Math.sqrt(200);
        double result = a.abs(a);
        assertEquals(expected,result, 0);
    }

}
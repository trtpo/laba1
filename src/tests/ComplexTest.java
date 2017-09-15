package tests;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void TestingPlusFunction() throws Exception {
        Complex a = new Complex(50,-20);
        assertEquals("error in method plus()", a.plus(20), new Complex(70,-20));
    }

    @Test
    public void TestingMinusFunction() throws Exception {
        Complex a = new Complex(50,-20);
        Complex b = new Complex(10,5);
        assertEquals("error in method minus()", a.minus(b), new Complex(40,-25));
    }

    @Test
    public void TestingsTimesFunction() throws Exception {
        Complex a = new Complex(50,-20);
        assertEquals("error in method times()", a.times(5), new Complex(250,-100));
    }

    @Test
    public void TestingDivideFunction() throws Exception {
        Complex a = new Complex(50,-20);
        Complex b = new Complex(10,5);
        assertEquals("error in method divide()", a.divide(b), new Complex(3.2,-3.6));
    }
}
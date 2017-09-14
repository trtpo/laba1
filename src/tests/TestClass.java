package tests;

import static org.junit.Assert.*;
import demo.parallel.Complex;

public class TestClass {

    @org.junit.Test
    public void testMinus1() throws Exception {
        Complex a = new Complex(11,10);
        Complex b = new Complex(7,5);
        assertTrue(a.minus(b).equalTo(new Complex(4,5)));
    }

    @org.junit.Test
    public void testMinus2() throws Exception {
        Complex a = new Complex(13,-5);
        Complex b = new Complex(12,7);
        assertTrue(a.minus(b).equalTo(new Complex(1,-12)));
    }

    @org.junit.Test
    public void testMinus3() throws Exception {
        Complex a = new Complex(-2,13);
        Complex b = new Complex(1,2);
        assertTrue(a.minus(b).equalTo(new Complex(-3,11)));
    }

    @org.junit.Test
    public void testDivide1() throws Exception {
        Complex a = new Complex(11,10);
        Complex b = new Complex(7,5);
        assertTrue(a.divide(b).equalTo(new Complex(127d/74d, 15d/74d)));
    }

    @org.junit.Test
    public void testDivide2() throws Exception {
        Complex a = new Complex(13,-5);
        Complex b = new Complex(12,7);
        assertTrue(a.divide(b).equalTo(new Complex(121d/193d, -151d/193d)));
    }

    @org.junit.Test
    public void testDivide3() throws Exception {
        Complex a = new Complex(-2,13);
        Complex b = new Complex(1,2);
        assertTrue(a.divide(b).equalTo(new Complex(24d/5d, 17d/5d)));
    }
}

package demo.parallel;

import static org.junit.Assert.*;

public class Test {

    private Complex complex;

    @org.junit.Before
    public void setUp() {
        complex = new Complex(0,0);
    }

    @org.junit.Test
    public void testMinus() throws Exception {
        assertEquals(-1,complex.minus(new Complex(1,1)).getRe(), 0);
        assertEquals(-11,complex.minus(new Complex(10,2)).getIm(), 0);
    }

    @org.junit.Test
    public void testFailMinus() throws Exception {
        assertEquals(-13,complex.minus(new Complex(10,2)).getIm(), 0);
    }

}
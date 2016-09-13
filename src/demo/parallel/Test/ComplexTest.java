package demo.parallel.Test;

import demo.parallel.Complex;

import static org.junit.Assert.*;

/**
 * Created by Vlad Osipov on 13.09.2016.
 */
public class ComplexTest {
    private Complex _complexTest;
    @org.junit.Before
    public void setUp() throws Exception {
        _complexTest = new Complex(1,2);
    }


    @org.junit.Test
    public void subtraction() throws Exception {
        _complexTest.minus(new Complex(1,-1));
        assertEquals("Fail subtraction", 0,_complexTest.getRe(), 0.0001);
        assertEquals("Fail subtraction", 3,_complexTest.getIm(), 0.0001);
    }


    @org.junit.Test
    public void division() throws Exception {
        _complexTest.divide(new Complex(2,-1));
        assertEquals("Fail division", 0,_complexTest.getRe(),0.0001);
        assertEquals("Fail division", 1,_complexTest.getIm(),0.0001);
    }
}
package test;

import demo.parallel.Complex;

import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by Michail Yuncevich  on 10.09.2016.
 */
public class ComplexTest {
    Complex testObj;

    @Before
    public void setUp(){
        testObj = new Complex(20,20);
    }
    @org.junit.Test
    public void divides() throws Exception{
        testObj.divides(new Complex(5,5));
        assertEquals(4,testObj.getIm(),0.01);
        assertEquals(4,testObj.getRe(),0.01);
    }

    @org.junit.Test
    public void testReciprocal(){
        testObj.reciprocal();
        assertEquals((double)1/20,testObj.getRe(),0.001);
        assertEquals((double)1/20,testObj.getIm(),0.001);
    }

}



package test;

import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTest {
    private Complex testNum;

    @Before
    public void init() throws Exception {
        testNum = new Complex(15,12);
    }

    @Test
    public void getRe() throws Exception {
        assertEquals(testNum.getRe(), 15, 0);
    }

    @Test
    public void getIm() throws Exception {
        assertEquals(testNum.getIm(), 12, 0);
    }

    @Test
    public void plus() throws Exception {
        testNum.plus(new Complex(5,8));
        assertEquals(testNum.getRe(),20,0);
        assertEquals(testNum.getIm(),20,0);
    }

    @Test
    public void times() throws Exception {
        testNum.times(new Complex(2,2));
        assertEquals(testNum.getRe(),6,0);
        assertEquals(testNum.getIm(),54,0);
    }

    @Test
    public void minus() throws Exception {
        testNum.minus(new Complex(10,10));
        assertEquals(testNum.getRe(),5,0);
        assertEquals(testNum.getIm(),2,0);
    }

    @Test
    public void divide() throws Exception {
        testNum.div(new Complex(2,2));
        assertEquals(testNum.getRe(),6.75,0.01);
        assertEquals(testNum.getIm(),-0.75,0.01);
    }
}

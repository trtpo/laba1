package demo.parallel;

import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {

    private Complex testNum;

    @Before
    public void init() throws Exception {
        testNum = new Complex(10, 20);
    }

    @Test
    public void plus() throws Exception {
        testNum.plus(new Complex(10, 5));
        assertEquals(testNum.getRe(), 20, 0);
        assertEquals(testNum.getIm(), 25, 0);
    }

    @Test
    public void times() throws Exception {
        testNum.times(new Complex(4, 5));
        assertEquals(testNum.getRe(), -60, 0);
        assertEquals(testNum.getIm(), 130, 0);
    }

    @Test
    public void sub() throws Exception {
        testNum.sub(new Complex(5, 5));
        assertEquals(testNum.getRe(), 5, 0);
        assertEquals(testNum.getIm(), 15, 0);
    }
}
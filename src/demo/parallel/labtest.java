package demo.parallel;

/**
 * Created by Никита on 19.09.2017.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class labtest {
    private Complex a;
    private Complex b;

    @Before
    public void testSetup() throws Exception {
        a = new Complex(9, 5);
        b = new Complex(4, 6);
    }

    @Test
    public void minusTest() throws Exception {
        a.minus(b);
        assertEquals("Wrong complex number after minus operation", 5, a.getRe(), 0.001);
        assertEquals("Wrong complex number after minus operation", -1, a.getIm(), 0.001);
    }

    @Test
    public void plusTest() throws Exception {
        a.plus(b);
        assertEquals("Wrong complex number after plus operation", 13, a.getRe(), 0.001);
        assertEquals("Wrong complex number after plus operation", 11, a.getIm(), 0.001);
    }

    @Test
    public void timesTest() throws Exception {
        a.times(b);
        assertEquals("Wrong complex number after times operation", 6, a.getRe(), 0.001);
        assertEquals("Wrong complex number after times operation", 74, a.getIm(), 0.001);
    }

    @Test
    public void squareTest() throws Exception {
        a.square();
        assertEquals("Wrong complex number after square operation", 56, a.getRe(), 0.001);
        assertEquals("Wrong complex number after square operation", 90, a.getIm(), 0.001);
    }
}
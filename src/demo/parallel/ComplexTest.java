package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void testPlus() throws Exception {
        Complex c1 = new Complex (2.1,4);
        Complex c2 = new Complex (4.8, -4);
        assertTrue(c1.plus(c2).im == 0);
        assertTrue(c1.plus(c2).re == 11.7);

    }

    @Test
    public void testSub() throws Exception {
        Complex c1 = new Complex (7.7,-3.2);
        Complex c2 = new Complex (2.7,-9.1);
        assertTrue(c1.sub(c2).re==5);
        assertTrue(c1.sub(c2).im==15);
    }

    @Test
    public void testTimes() throws Exception {
        Complex c1 = new Complex (2,-3);
        Complex c2 = new Complex (3,1);
        assertTrue(c1.times(c2).im == -7);
        assertTrue(c1.times(c2).re == 34);
    }
}
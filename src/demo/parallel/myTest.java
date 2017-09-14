package demo.parallel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class myTest {
    private Complex a;
    private Complex b;

    @Before
    public void setup() throws Exception {
        a = new Complex(3, 8);
        b = new Complex(7, 5);
    }

    @Test
    public void testingPlus() throws Exception {
        a.plus(b);
        assertEquals("Complex number after plus isn't correct", 10, a.getRe(), 0.001);
        assertEquals("Complex number after plus isn't correct", 13, a.getIm(), 0.001);
    }

    @Test
    public void testingTimes() throws Exception {
        a.times(b);
        assertEquals("Complex number after times isn't correct", -19, a.getRe(), 0.001);
        assertEquals("Complex number after times isn't correct", 71, a.getIm(), 0.001);
    }

    @Test
    public void testingMinus() throws Exception {
        a.minus(b);
        assertEquals("Complex number after minus isn't correct", -4, a.getRe(), 0.001);
        assertEquals("Complex number after minus isn't correct", 3, a.getIm(), 0.001);
    }

    @Test
    public void testingDivide() throws Exception {
        a.divide(b);
        assertEquals("Complex number after divide isn't correct", 0.8243243243243243, a.getRe(), 0.001);
        assertEquals("Complex number after divide isn't correct", 0.5540540540540541, a.getIm(), 0.001);
    }

}

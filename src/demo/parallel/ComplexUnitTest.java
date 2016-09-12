package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexUnitTest {
    private Complex a;
    private Complex b;
    private Complex c;
    private Complex d;

    @Before
    public void setUp() throws Exception {
        a = new Complex(1,0);
        b = new Complex(0,1);
        c = new Complex(1,1);
        d = new Complex(0,0);
    }

    @Test
    public void plusTest() throws Exception{
        assertTrue("Not equals", c.equals(a.plus(b)));
    }

    @Test
    public void minusTest() throws Exception {
        assertTrue("Not equals", d.equals(c.minus(a).minus(b)));
    }

    @Test
    public void timesTest() throws Exception {
        assertTrue("Not equals", b.equals(a.times(b)));
    }

    @Test
    public void divisionTest() throws Exception {
        assertTrue("Not equals", a.equals(b.divide(b)));
    }

    @Test
    public void notNullRe() throws Exception {
        assertNotEquals(0.0, a.getReal());
    }

    @Test
    public void notNullIm() throws Exception {
        assertNotEquals("Not equals", 0.0, a.getImaginary());
    }
}

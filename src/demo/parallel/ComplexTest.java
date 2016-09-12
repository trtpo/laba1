package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex a;
    private Complex b
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
        assertTrue("Not Equals", c.equals(a.plus(b)));
    }

    @Test
    public void timesTest() throws Exception {
        assertTrue("Not Equals", b.equals(a.times(b)));
    }

    @Test
    public void divisionTest() throws Exception {
        assertTrue("Not Equals", a.equals(b.divide(b)));
    }

}


package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex x;

    @Before
    public void testSetup() throws Exception {
        x = new Complex(5, 3);
    }

    @Test
    public void minus1() throws Exception {
        x.minus(new Complex(4,2));
        assertEquals(1, x.getRe(), 0.01);
        assertEquals(1, x.getIm(), 0.01);
    }

    @Test
    public void minus2() throws Exception {
        x.minus(new Complex(1,1));
        assertEquals(4, x.getRe(), 0.01);
        assertEquals(1, x.getIm(), 0.01);
    }

}
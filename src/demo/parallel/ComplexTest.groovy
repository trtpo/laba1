package demo.parallel

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex number;
    @Before
    public void setUp() throws Exception {
        number = new Complex(4,-2);
    }

    @Test
    public void testMinus() throws Exception {
        assertEquals(new Complex(1,1).getRe(),number.minus(new Complex(3,-3)).getRe(),0.00001);
        assertEquals(new Complex(1,4).getIm(),number.minus(new Complex(3,-3)).getIm(),0.00001);
    }
}
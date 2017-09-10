package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex complex;

    @Before
    public void setUp() throws Exception {
        complex = new Complex(4,6);
    }

    @Test
    public void minus() throws Exception {
        complex.minus(new Complex(3,4));
        assertEquals(1,complex.getRe(), 0.01);
        assertEquals(2,complex.getIm(),0.01);
    }

    @Test
    public void divide() throws Exception {
        complex.divide(new Complex(2,3));
        assertEquals(2,complex.getRe(), 0.01);
        assertEquals(0,complex.getIm(),0.01);
    }
}
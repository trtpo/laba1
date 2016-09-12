package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pixxx on 12.09.2016.
 */
public class ComplexTest {
    private Complex comp;

    @org.junit.Before
    public void setUp() throws Exception {
        comp = new Complex(3, -1);
    }

    @Test
    public void cos() throws Exception {
        comp = comp.cos();
        org.junit.Assert.assertEquals("Complex Class Error: cos(), real part", -1.52, comp.getRe(), 0.01);
        org.junit.Assert.assertEquals("Complex Class Error: cos(), imaginary part", 0.16, comp.getIm(), 0.01);
    }

    @Test
    public void minus() throws Exception {
        comp = comp.minus(comp);
        org.junit.Assert.assertEquals("Complex Class Error: minus(), real part", 0, comp.getRe(), 0.01);
        org.junit.Assert.assertEquals("Complex Class Error: minus(), imaginary part", 0, comp.getIm(), 0.01);
    }

}
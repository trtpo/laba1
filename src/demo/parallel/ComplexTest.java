package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;


public class ComplexTest {

    private Complex comp;
    
    @org.junit.Before
    public void setUp() throws Exception {
        comp = new Complex(4, -3);
    }

    @Test
    public void sin() throws Exception {
        comp = comp.sin();

        org.junit.Assert.assertEquals("Complex Class Error: sin(), real part", -7.62, comp.getRe(), 0.01);
        org.junit.Assert.assertEquals("Complex Class Error: sin(), imaginary part", 6.54, comp.getIm(), 0.01);
    }

    @Test
    public void minus() throws Exception {
        comp = comp.minus(new Complex(3, 2));

        org.junit.Assert.assertEquals("Complex Class Error: minus(), real part", 1, comp.getRe(), 0.01);
        org.junit.Assert.assertEquals("Complex Class Error: minus(), imaginary part", -5, comp.getIm(), 0.01);
    }

}
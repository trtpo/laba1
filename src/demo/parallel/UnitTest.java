package demo.parallel;

/**
 * Created by P on 16.09.16.
 */


import static junit.framework.TestCase.assertEquals;

public class UnitTest {

    private Complex complex;

    @org.junit.Before
    public void setUp() {
    complex = new Complex(1,1);
    }

    @org.junit.Test
    public void sin() throws Exception {
    complex = complex.sin(complex);
    assertEquals("Wrong real in sin",1.2985,complex.getRe(),0.0001);
    assertEquals("Wrong image in sin",0.6350,complex.getIm(),0.0001);
    }



}
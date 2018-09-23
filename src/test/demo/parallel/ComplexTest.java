package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {
    Complex complex;
    Complex complexTest;
    double delta = 0;

    @org.junit.Before
    public void setUp() throws Exception {
        complex = new Complex(10,2);
        complexTest = new Complex(4, 3);
    }

    @org.junit.Test
    public void getRe() {
        assertEquals(10, complex.getRe(), delta);
    }

    @org.junit.Test
    public void getIm() {
        assertEquals(2, complex.getIm(), delta);
    }

    @org.junit.Test
    public void minus() {
        complex.minus(complexTest);
        assertEquals(6, complex.getRe(), delta);
        assertEquals(-1, complex.getIm(), delta);
    }

    @org.junit.Test
    public void scale() {
        complex.scale(2);
        assertEquals(20, complex.getRe(), delta);
        assertEquals(4, complex.getIm(), delta);
    }
}
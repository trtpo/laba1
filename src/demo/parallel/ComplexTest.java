
package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {
    Complex complex;
    Complex complexTest;
    double deltaValue = 0;

    @org.junit.Test
    public void sub() {
        complex.sub(complexTest);
        assertEquals(16, complex.getRe(), deltaValue);
        assertEquals(1, complex.getIm(), deltaValue);
    }

    @org.junit.Test
    public void increase() {
        complex.increase(2);
        assertEquals(40, complex.getRe(), deltaValue);
        assertEquals(8, complex.getIm(), deltaValue);
    }

    @org.junit.Before
    public void setUp() throws Exception {
        complex = new Complex(20, 4);
        complexTest = new Complex(4, 3);
    }

    @org.junit.Test
    public void getRe() {
        assertEquals(20, complex.getRe(), deltaValue);
    }

    @org.junit.Test
    public void getIm() {
        assertEquals(4, complex.getIm(), deltaValue);
    }
}
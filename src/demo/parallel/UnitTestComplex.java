package demo.parallel;

import static junit.framework.TestCase.assertEquals;

public class UnitTestComplex {
    Complex complex;
    Complex complexTest;
    double deltaValue = 0;

    @org.junit.Test
    public void plus() {
        complex.plus(complexTest);
        assertEquals(24, complex.getReal(), deltaValue);
        assertEquals(7, complex.getImaginary(), deltaValue);
    }

    @org.junit.Test
    public void increase() {
        complex.minus(complexTest);
        assertEquals(40, complex.getReal(), deltaValue);
        assertEquals(8, complex.getImaginary(), deltaValue);
    }

    @org.junit.Before
    public void setUp() throws Exception {
        complex = new Complex(20, 4);
        complexTest = new Complex(4, 3);
    }

    @org.junit.Test
    public void getReal() {
        assertEquals(20, complex.getReal(), deltaValue);
    }

    @org.junit.Test
    public void getImaginary() {
        assertEquals(4, complex.getImaginary(), deltaValue);
    }
}

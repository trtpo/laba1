package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by nikit on 08.09.2016.
 */
public class ComplexTest {

    private Complex _complex;

    @org.junit.Before
    public void setUp() throws Exception {
       _complex = new Complex(1,2);
    }

    @org.junit.Test
    public void minus() throws Exception {
        _complex.minus(new Complex(3,4));
        assertEquals(-2,_complex.getRe(), 0.0001);
        assertEquals(-2,_complex.getIm(), 0.0001);
    }

    @org.junit.Test
    public void division() throws Exception {
       _complex.division(new Complex(3,4));
        assertEquals(0.44,_complex.getRe(),0.0001);
        assertEquals(0.08,_complex.getIm(),0.0001);
    }

}
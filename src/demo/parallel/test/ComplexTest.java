package demo.parallel.test;

import demo.parallel.Complex;

import static org.junit.Assert.*;

/**
 * Created by Anton Tsarikovich on 07.09.2015.
 */
public class ComplexTest {
    private final double delta = 1E-7;


    @org.junit.Test
    public void testDiv() throws Exception {
        Complex complex = new Complex(1,123);
        Complex copyComplex = new Complex(1,123);
        Complex someComplex = new Complex(2,4);

        complex.times(someComplex).div(someComplex);

        assertEquals(complex.getRe(), copyComplex.getRe(), delta);
        assertEquals(complex.getIm(), copyComplex.getIm(), delta);

    }

    @org.junit.Test
    public void testSub() throws Exception {
        Complex complex = new Complex(1,1);
        Complex someComplex = new Complex(1,1);
        Complex copyComplex = new Complex(1,7);

        complex.sub(copyComplex).plus(copyComplex);
        assertEquals(complex.getRe(), someComplex.getRe(), delta);
        assertEquals(complex.getIm(),someComplex.getIm(),delta);
    }


}
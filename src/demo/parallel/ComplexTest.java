package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by StasGordynets on 11.09.16.
 */


public class ComplexTest {

    private Complex complex;

    @Before
    public void init() {
        complex = new Complex(5, 10);
    }

    @After
    public void delete() {
        complex = null;
    }


    @Test
    public void plus() throws Exception {
        Complex result = complex.plus(new Complex(10, 5));
        assertEquals(15, complex.getRe(), 0.000001);
        assertEquals(15, complex.getIm(), 0.000001);
    }

    @Test
    public void cosTest () throws Exception{
        Complex testValue = new Complex(3,0);
        assertEquals(Complex.cos(testValue).getIm(),0, Double.MIN_VALUE);
    }
}





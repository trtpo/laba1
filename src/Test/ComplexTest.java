package Test;

import demo.parallel.Complex;

import static org.junit.Assert.assertEquals;

/**
 * Created by George on 07.09.2016.
 */
public class ComplexTest {

    @org.junit.Test
    public void division() throws Exception {
        Complex a = new Complex(7.0, -4.0);
        Complex b = new Complex(2.0, 2.0);
        Complex expected = new Complex(0.75, -2.75);
        Complex res = a.division(b);
        assertEquals(expected.getRe(), res.getRe(), 0);
        assertEquals(expected.getIm(), res.getIm(), 0);
    }

}
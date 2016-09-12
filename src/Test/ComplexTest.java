package Test;

import demo.parallel.Complex;

import static org.junit.Assert.*;

/**
 * Created by Thandor-Laptop on 13.09.2016.
 */
public class ComplexTest {

    @org.junit.Test
    public void divideTest() throws Exception {
        Complex a = new Complex(4, 4);
        Complex b = new Complex(8, 6);

        b = b.divide(a);

        Complex expected = new Complex(1.75, -0.25);

        assertEquals(b.getRe(), expected.getRe(), 0);
        assertEquals(b.getIm(), expected.getIm(), 0);
    }
}
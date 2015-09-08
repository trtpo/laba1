package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MACBOOK on 08.09.15.
 */
public class ComplexTest {

    @Test
    public void testDivision() throws Exception {
        Complex c = new Complex(1, 1);
        c.division(new Complex(2, 2));
        assertEquals(c.getRe(), 0.5, 1e-12);
        assertEquals(c.getIm(), 0, 1e-12);

        c = new Complex(0, 0);
        c.division(new Complex(0, 0));
        assertEquals(c.getRe(), Double.NaN, 1e-12 );
        assertEquals(c.getIm(), Double.NaN, 1e-12);
    }
}
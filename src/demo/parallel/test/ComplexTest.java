import demo.parallel.Complex;

import static org.junit.Assert.*;

/**
 * Created by Anton Tsarikovich on 07.09.2015.
 */
public class ComplexTest {

    @org.junit.Test
    public void testPlus() throws Exception {
        Complex complex = new Complex(1,1);
        Complex a = complex.plus(complex);

        assertEquals(complex,a);
    }

    @org.junit.Test
    public void testDiv() throws Exception {
        Complex complex = new Complex(1,123);
        Complex a = complex.div(complex);

        assertEquals(complex,a);


    }

    @org.junit.Test
    public void testSub() throws Exception {
        Complex complex = new Complex(1,1);
        Complex a = complex.sub(complex);

        assertEquals(complex,a);
    }

    @org.junit.Test
    public void testTimes() throws Exception {
        Complex complex = new Complex(1,4);
        Complex a = complex.times(complex);

        assertEquals(complex,a);
    }
}
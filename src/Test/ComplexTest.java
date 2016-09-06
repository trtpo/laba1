package Test;

import demo.parallel.Complex;

import static org.junit.Assert.*;

/**
 * Created by Victoria on 06.09.2016.
 */
public class ComplexTest {
    @org.junit.Test
    public void minus() throws Exception {
        Complex a = new Complex(2,2);
        Complex b = new Complex(3,4);

        Complex exp = new Complex(1,2);
        b = b.minus(a);


        assertEquals(exp.getImag(), b.getImag(), 0);
        assertEquals(exp.getReal(), b.getReal(), 0);
    }

    @org.junit.Test
    public void division() throws Exception {
        Complex a = new Complex(2,2);
        Complex b = new Complex(12,10);

        Complex exp = new Complex(5.5,-0.5);
        b = b.division(a);


        assertEquals(exp.getImag(), b.getImag(), 0);
        assertEquals(exp.getReal(), b.getReal(), 0);
    }

}
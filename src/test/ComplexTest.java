package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ComplexTest  {
    @Test
    public void minusTest(){
        Complex a = new Complex(6.7, 6.6);
        Complex b = new Complex(-11.4, 4.4);

        Complex result = a.minus(b);

        assertEquals(6.7 - (-11.4), result.getReal(), 0.0001);
        assertEquals(6.6 - 4.4, result.getImaginary(), 0.0001);
    }

    @Test
    public void specialTest(){
        Complex a = new Complex(5.2, 3.4);
        Complex b = new Complex(-14.3, 1.1);
        assertNotNull(a.special(b));
    }

}
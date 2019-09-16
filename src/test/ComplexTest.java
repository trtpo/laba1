package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {


    @Test
    public void minus() {
        Complex result = new Complex(4,6).minus(new Complex(3,2));
        assertEquals(result.getRe(), 1, 0.001);
        assertEquals(result.getIm(), 4, 0.001);
    }

    @Test
    public void divide() {
        Complex result = new Complex(2,8).divide(new Complex(2,1));
        assertEquals(result.getRe(), 2.4, 0.1);
        assertEquals(result.getIm(), 2.8, 0.1);
    }
}

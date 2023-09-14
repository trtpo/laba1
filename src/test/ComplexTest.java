package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @Test
    public void minusTest(){
        Complex a = new Complex(6.7, 6.6);
        Complex b = new Complex(-11.4, 4.4);

        Complex result = a.minus(b);

        assertEquals(6.7 - (-11.4), result.getRe(), 0.0001);
        assertEquals(6.6 - 4.4, result.getIm(), 0.0001);
    }

}

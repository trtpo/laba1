package demo.parallel;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void divide() {
        Complex result = new Complex(2,8).divide(new Complex(2,1));
        assertEquals(result.getRe(), 2.4, 0.1);
        assertEquals(result.getIm(), 2.8, 0.1);
    }
}
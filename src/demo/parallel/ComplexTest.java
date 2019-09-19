package demo.parallel;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {


    @Test
    public void sub() {
        Complex result = new Complex(4,6).sub(new Complex(3,2));
        assertEquals(result.getRe(), 1, 0.001);
        assertEquals(result.getIm(), 4, 0.001);
    }

    @Test
    public void Tangent() {
        Complex result = new Complex(2,8).times(new Complex(2,1));
       Assert.assertEquals(result.getRe(), 2.4, 0.1);
        Assert.assertEquals(result.getIm(), 2.8, 0.1);
    }
}
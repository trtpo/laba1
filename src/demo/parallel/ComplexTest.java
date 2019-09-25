package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void division() {
        Complex a = new Complex(3,5);
        Complex b = new Complex(2,2);

        Complex res = a.division(b);

        Complex check = new Complex(2,0.75);

        Assert.assertEquals(res.getRe(), check.getRe(), 0);
        Assert.assertEquals(res.getIm(), check.getIm(), 0);

    }


    @Test
    public void minus() {
        Complex a = new Complex(3, 7);
        Complex b = new Complex(4, -2);

        Complex res = a.minus(b);

        Complex check = new Complex(-1,9);

        Assert.assertEquals(res.getRe(), check.getRe(), 0);
        Assert.assertEquals(res.getIm(), check.getIm(), 0);
    }
}
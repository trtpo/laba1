package demo.parallel;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void minus() {
        Complex a = new Complex(8, -1);
        Complex b = new Complex(-2, -4);

        Complex result = a.minus(b);

        Complex check = new Complex(10,3);

        Assert.assertEquals(result.getRe(), check.getRe(), 0);
        Assert.assertEquals(result.getIm(), check.getIm(), 0);
    }

    @Test
    public void division() {
        Complex a = new Complex(9,-6);
        Complex b = new Complex(3,1);

        Complex result = a.division(b);

        Complex check = new Complex(2.1,-2.7);

        Assert.assertEquals(result.getRe(), check.getRe(), 0);
        Assert.assertEquals(result.getIm(), check.getIm(), 0);
    }
}
package demo.parallel;

import org.junit.Assert;

public class ComplexTest {

    @org.junit.Test
    public void division() {
        Complex x = new Complex(4,6);
        Complex y = new Complex(2,2);

        Complex res = x.division(y);

        Complex check = new Complex(2.5,0.5);

        Assert.assertEquals(res.getRe(), check.getRe(), 0);
        Assert.assertEquals(res.getIm(), check.getIm(), 0);
    }

    @org.junit.Test
    public void divisionZero() {
        Complex x = new Complex(0,0);
        Complex y = new Complex(2,2);

        Complex res = x.division(y);

        Assert.assertEquals(res.getRe(), 0, 0);
        Assert.assertEquals(res.getIm(), 0, 0);
    }

    @org.junit.Test
    public void divisionSame() {
        Complex x = new Complex(2,2);
        Complex y = new Complex(2,2);

        Complex res1 = x.division(x);

        Complex res2 = y.division(y);

        Assert.assertEquals(res1.getRe(), res2.getRe(), 0);
        Assert.assertEquals(res1.getIm(), res2.getIm(), 0);
    }
}
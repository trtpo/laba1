import org.junit.Assert;

public class ComplexTest {

    @org.junit.Test
    public void division() {
        demo.parallel.Complex x = new demo.parallel.Complex(4,6);
        demo.parallel.Complex y = new demo.parallel.Complex(2,2);

        demo.parallel.Complex res = x.division(y);

        demo.parallel.Complex check = new demo.parallel.Complex(2.5,0.5);

        Assert.assertEquals(res.getRe(), check.getRe(), 0);
        Assert.assertEquals(res.getIm(), check.getIm(), 0);
    }

    @org.junit.Test
    public void divisionZero() {
        demo.parallel.Complex x = new demo.parallel.Complex(0,0);
        demo.parallel.Complex y = new demo.parallel.Complex(2,2);

        demo.parallel.Complex res = x.division(y);

        Assert.assertEquals(res.getRe(), 0, 0);
        Assert.assertEquals(res.getIm(), 0, 0);
    }

    @org.junit.Test
    public void divisionSame() {
        demo.parallel.Complex x = new demo.parallel.Complex(2,2);
        demo.parallel.Complex y = new demo.parallel.Complex(2,2);

        demo.parallel.Complex res1 = x.division(x);

        demo.parallel.Complex res2 = y.division(y);

        Assert.assertEquals(res1.getRe(), res2.getRe(), 0);
        Assert.assertEquals(res1.getIm(), res2.getIm(), 0);
    }
} 
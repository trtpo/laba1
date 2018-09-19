import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;


public class ComplexTest {

    @Test
    public void testSubtract() {
        Complex a = new Complex(10, 52);
        Complex b = new Complex(4, 40);
        a.subtract(b);
        Assert.assertEquals(a.getRe(), 6,0);
        Assert.assertEquals(a.getIm(), 12, 0);
    }

    @Test
    public void testDivideOnNumber() {
        Complex a = new Complex(2, 9);
        Complex b = new Complex(8, 6);
        a.divide(b);
        Assert.assertEquals(a.getRe(), 0.7, 0);
        Assert.assertEquals(a.getIm(), 0.6, 0);
    }

    @Test
    public void testDivideWhenDividerIsZero() {
        Complex a = new Complex(10, 10);
        Complex b = new Complex(0, 0);
        boolean isError = false;
        try {
            a.divide(b);
            isError = true;
        }
        catch (ArithmeticException e) {
        }
        Assert.assertFalse(isError);
    }
}

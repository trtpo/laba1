import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
    private Complex a, b;

    @Before
    public void setUp() {
        a = new Complex(2,5);
    }

    @Test
    public void testPlus() {
        b = new Complex(1, 3);
        Complex result = a.plus(b);
        Assert.assertEquals(new Complex(3,8), result);
    }

    @Test
    public void testMinus() {
        b = new Complex(1, 3);
        Complex result = a.minus(b);
        Assert.assertEquals(new Complex(1, 2), result);
    }

    @Test
    public void testSine() {
        double real = Math.sin(a.getReal()) * Math.cosh(a.getImaginary());
        double imag = Math.cos(a.getReal()) * Math.sinh(a.getImaginary());
        Complex result = a.sin();
        Assert.assertEquals(real, result.getReal(), 0);
        Assert.assertEquals(imag, result.getImaginary(), 0);
    }

    @Test
    public void testCosine() {
        double real = Math.cos(a.getReal()) * Math.cosh(a.getImaginary());
        double imag = -Math.sin(a.getReal()) * Math.sinh(a.getImaginary());
        Complex result = a.cos();
        Assert.assertEquals(real, result.getReal(), 0);
        Assert.assertEquals(imag, result.getImaginary(), 0);
    }

    @Test
    public void testDivision() {
        a = new Complex(2,4);
        b = new Complex(1,2);
        Complex result = a.divide(b);
        Assert.assertEquals(new Complex(2,0), result);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivisionByZero() {
        a = new Complex(2,4);
        b = new Complex(0,0);
        Complex result = a.divide(b);
        Assert.fail();
    }
}

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
    private Complex a, b;

    @Before
    public void setUp() {
        b = new Complex(3, 4);
    }

    @Test
    public void shouldPlusComplexNumber() {
        a = new Complex(1,2);
        Complex result = a.plus(b);
        Assert.assertEquals(new Complex(4,6), result);
    }

    @Test(expected = NullPointerException.class)
    public void shouldNotProceedNull() {
        a.conjugate();
    }

    @Test
    public void shouldConjugate() {
        a = new Complex(3,-4);
        Assert.assertEquals(a, b.conjugate());
    }

    @Test
    public void shouldNotCalculateLargeLength() {
        a = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        Assert.assertEquals(Double.POSITIVE_INFINITY, a.lengthSQ(), 0.1);
    }
}
import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NewOperationsTest {
    private Complex a;
    private Complex b;
    @Before
    public void setup() throws Exception{
        a = new Complex(4, 10);
        b = new Complex(2, 1);
    }
    @Test
    public void testDivide() throws Exception{
        a.division(b);
        Assert.assertEquals("Divide operation isn't correct. You made mistake in real part", 3.6,
                a.getRe(),0.01);
        Assert.assertEquals("Divide operation isn't correct. You made mistake in imaginary part", 3.2,
                a.getIm(), 0.01);
    }
    @Test
    public void testSubtract() throws Exception{
        a.minus(b);
        Assert.assertEquals("Subtract operation isn't correct. You made mistake in real part", 2,
                a.getRe(), 0.01 );
        Assert.assertEquals("Subtract operation isn't correct. You made mistake in imaginary part", 9,
                a.getIm(), 0.01);
    }
}



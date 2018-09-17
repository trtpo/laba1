import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {
    @Test
    public void testDivideWhenSecondOperandIsZero() {
        Complex a = new Complex(2, 9);
        Complex b = new Complex(0, 0);
        boolean error = false;
        try {
            a.divide(b);
            error = true;
        } catch(ArithmeticException e) {}
        Assert.assertFalse(error);
    }
    @Test
    public void testDivideOnRandomNumber() {
        Complex a = new Complex(2, 9);
        Complex b = new Complex(8, 6);

        a.divide(b);

        Assert.assertEquals(a.getReal(), 0.7, 0);
        Assert.assertEquals(a.getImagine(), 0.6, 0);
    }
    @Test
    public void testSubtractOnRandomNumber() {
        Complex a = new Complex(5, 9);
        Complex b = new Complex(4, 48);
        a.subtract(b);
        Assert.assertEquals(a.getReal(), 1,0);
        Assert.assertEquals(a.getImagine(), -39, 0);
    }
}

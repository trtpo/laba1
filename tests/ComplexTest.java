import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void usualSubtraction() {
        Complex complex = new Complex(5, 5);
        Assert.assertEquals("Error in subtraction!", complex.subtract(new Complex(3, 2)),
                new Complex(2, 3));
    }

    @Test
    public void usualDivide() {
        Complex complex = new Complex(-1, 3);
        Assert.assertEquals("Error in divide!", complex.divide(new Complex(1, 2)),
                new Complex(1, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero() {
        Complex complex = new Complex(10, 10);
        complex.divide(new Complex(0, 0));
    }
}
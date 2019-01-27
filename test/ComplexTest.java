
import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;


public class ComplexTest {


    @Test
    public void defaultSubstraction() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(1, 1);
        Complex actual = a.substraction(b);
        Complex expected = new Complex(-1, -1);
        Assert.assertEquals("Substruction dosen`t work", actual, expected);
    }

    @Test
    public void defaultDivision() {
        Complex a = new Complex(10, -10);
        Complex b = new Complex(1, 1);
        Complex actual = a.division(b);
        Complex expected = new Complex(0, -10);
        Assert.assertEquals("Division doesn`t work", actual, expected);
    }

    @Test(expected = ArithmeticException.class)
    public void DivisionByZero() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(0, 0);
        a.division(b);
    }


}
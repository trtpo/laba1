package test.parallel;

import org.junit.Assert;
import org.junit.Test;
import demo.parallel.Complex;

public class ComplexNumbersOperationsTest {
    @Test
    public void testDivide() {
        Complex x = new Complex(2, 1);
        Complex y = new Complex(1, 2);
        Assert.assertTrue("Expected true, but got false", new Complex(0.8, -0.6).equals(x.divide(y), 0.001));
        x = new Complex(1, 2);
        y = new Complex(2, 1);
        Assert.assertTrue("Expected true, but got false", new Complex(0.8, 0.6).equals(x.divide(y), 0.001));
        x = new Complex(0, 0);
        y = new Complex(2, 2);
        Assert.assertTrue("Expected true, but got false", new Complex(0.0, 0.0).equals(x.divide(y), 0.001));
    }

    @Test
    public void testSubtract() {
        Complex x = new Complex(2, 1);
        Complex y = new Complex(1, 2);
        Assert.assertTrue("Expected true, but got false", new Complex(1, -1).equals(x.subtract(y), 0.0));
        x = new Complex(1, 2);
        y = new Complex(2, 1);
        Assert.assertTrue("Expected true, but got false", new Complex(-1, 1).equals(x.subtract(y), 0.0));
        x = new Complex(0, 0);
        y = new Complex(2, 2);
        Assert.assertTrue("Expected true, but got false", new Complex(-2, -2).equals(x.subtract(y), 0.0));
    }
}

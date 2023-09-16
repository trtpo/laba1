package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTests {

    @Test
    public void testMinus() {
        Complex a = new Complex(3, 4);
        Complex b = new Complex(1, 2);

        Complex expected_result = new Complex(2, 2);
        Complex actual_result = a.minus(b);

        Assert.assertEquals("(3,4)-(1,2) must be equal to (2,2)", expected_result, actual_result);
    }

    @Test
    public void testPow() {
        Complex a = new Complex(3, 4);
        int n = 2;

        Complex expected_result = new Complex(-7, 24);
        Complex actual_result = a.pow(n);

        Assert.assertEquals("(3,4)^2 must be equal to (-7,24)", expected_result, actual_result);
    }
}

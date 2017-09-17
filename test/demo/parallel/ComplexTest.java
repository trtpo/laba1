package demo.parallel;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by люба on 10.09.2017.
 */
public class ComplexTest extends TestCase {

    public void testEquals_NotEqual() throws Exception {
        Complex start = new Complex(1,1);
        Complex right = new Complex(1,-1);
        Assert.assertFalse(right.equals(start));
    }

    public void testEquals_NotEqualZero() throws Exception {
        Complex start = new Complex(0,0);
        Complex right = new Complex(1,-1);
        Assert.assertFalse(right.equals(start));
    }

    public void testEquals_Equal() throws Exception {
        Complex start = new Complex(1,1);
        Complex right = new Complex(1,1);
        Assert.assertTrue(right.equals(start));
    }

    public void testEquals_EqualZero() throws Exception {
        Complex start = new Complex(0,0);
        Complex right = new Complex(0,0);
        Assert.assertTrue(right.equals(start));
    }

    public void testInversion_bothHigherThanZero() throws Exception {
        Complex start = new Complex(1,1);
        Complex right = new Complex(-1,-1);
        Assert.assertTrue(right.equals(start.inversion()));
    }

    public void testInversion_bothLowerThanZero() throws Exception {
        Complex start = new Complex(-1,-1);
        Complex right = new Complex(1,1);
        Assert.assertTrue(right.equals(start.inversion()));
    }

    public void testInversion_oneHigherThanZero() throws Exception {
        Complex start = new Complex(1,-1);
        Complex right = new Complex(-1,1);
        Assert.assertTrue(right.equals(start.inversion()));
    }

    public void testInversion_zero() throws Exception {
        Complex start = new Complex(0,0);
        Complex right = new Complex(0,0);
        Assert.assertTrue(right.equals(start.inversion()));
    }

    public void testInversion_bothHigherThanZeroWrong() throws Exception {
        Complex start = new Complex(1,1);
        Complex right = new Complex(1,-1);
        Assert.assertFalse(right.equals(start.inversion()));
    }

    public void testDivide() throws Exception {
        Complex first = new Complex(1,1);
        Complex second = new Complex(1,1);
        Complex right = new Complex(1,0);
        Assert.assertTrue(right.equals(first.divide(second)));
    }

    public void testAdjunction_bothHigherThanZero() throws Exception {
        Complex start = new Complex(1,1);
        Complex right = new Complex(1,-1);
        Assert.assertTrue(right.equals(start.adjunction()));
    }

    public void testAdjunction_zero() throws Exception {
        Complex start = new Complex(0,0);
        Complex right = new Complex(0,0);
        Assert.assertTrue(right.equals(start.adjunction()));
    }

    public void testAdjunction_bothLessThanZero() throws Exception {
        Complex start = new Complex(-1,-1);
        Complex right = new Complex(-1,1);
        Assert.assertTrue(right.equals(start.adjunction()));
    }

    public void testAdjunction_bothLessThanZeroWrong() throws Exception {
        Complex start = new Complex(-1,1);
        Complex right = new Complex(-1,1);
        Assert.assertFalse(right.equals(start.adjunction()));
    }

}
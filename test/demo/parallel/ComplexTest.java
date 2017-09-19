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
        Assert.assertFalse("Method Complex.equal works wrong with re:1 im:1 and re:1 im:-1", right.equals(start));
    }

    public void testEquals_NotEqualZero() throws Exception {
        Complex start = new Complex(0,0);
        Complex right = new Complex(1,-1);
        Assert.assertFalse("Method Complex.equal works wrong with re:0 im:0 and re:1 im:-1", right.equals(start));
    }

    public void testEquals_Equal() throws Exception {
        Complex start = new Complex(1,1);
        Complex right = new Complex(1,1);
        Assert.assertTrue("Method Complex.equal works wrong with re:1 im:1 and re:1 im:1", right.equals(start));
    }

    public void testEquals_EqualZero() throws Exception {
        Complex start = new Complex(0,0);
        Complex right = new Complex(0,0);
        Assert.assertTrue("Method Complex.equal works wrong with re:0 im:0 and re:0 im:0", right.equals(start));
    }

    public void testInversion_bothHigherThanZero() throws Exception {
        Complex start = new Complex(1,1);
        Complex right = new Complex(-1,-1);
        Assert.assertTrue("Method Complex.inversion works wrong with re:1 im:1 and re:-1 im:-1", right.equals(start.inversion()));
    }

    public void testInversion_bothLowerThanZero() throws Exception {
        Complex start = new Complex(-1,-1);
        Complex right = new Complex(1,1);
        Assert.assertTrue("Method Complex.inversion works wrong with re:-1 im:-1 and re:1 im:1", right.equals(start.inversion()));
    }

    public void testInversion_oneHigherThanZero() throws Exception {
        Complex start = new Complex(1,-1);
        Complex right = new Complex(-1,1);
        Assert.assertTrue("Method Complex.inversion works wrong with re:-1 im:1 and re:1 im:-1", right.equals(start.inversion()));
    }

    public void testInversion_zero() throws Exception {
        Complex start = new Complex(0,0);
        Complex right = new Complex(0,0);
        Assert.assertTrue("Method Complex.inversion works wrong with re:0 im:0 and re:0 im:0", right.equals(start.inversion()));
    }

    public void testInversion_bothHigherThanZeroWrong() throws Exception {
        Complex start = new Complex(1,1);
        Complex right = new Complex(1,-1);
        Assert.assertFalse("Method Complex.inversion works wrong with re:1 im:1 and re:1 im:-1", right.equals(start.inversion()));
    }

    public void testDivide_bothHigherThanZero() throws Exception {
        Complex first = new Complex(1,1);
        Complex second = new Complex(1,1);
        Complex right = new Complex(1,0);
        Assert.assertTrue("Method Complex.divide works wrong with re:1 im:1 and re:1 im:1", right.equals(first.divide(second)));
    }

    public void testDivide_bothLowerThanZero() throws Exception {
        Complex first = new Complex(-1,-1);
        Complex second = new Complex(-1,-1);
        Complex right = new Complex(1,0);
        Assert.assertTrue("Method Complex.divide works wrong with re:-1 im:-1 and re:-1 im:-1", right.equals(first.divide(second)));
    }

    public void testDivide_divideToZero() throws Exception {
        Complex first = new Complex(1,1);
        Complex second = new Complex(0,0);
        Complex right = new Complex(0,0);
        boolean result = false;
        try
        {
            right.equals(first.divide(second));
            fail("Method Complex.divide works wrong with re:1 im:1 and re:0 im:0");
        }
        catch (IllegalArgumentException e)
        {
            result = true;
        }
        Assert.assertTrue(result);
    }

    public void testDivide_divideZeroToHigherThanZero() throws Exception {
        Complex first = new Complex(0,0);
        Complex second = new Complex(1,1);
        Complex right = new Complex(1,0);
        Assert.assertTrue("Method Complex.divide works wrong with re:0 im:0 and re:1 im:1", right.equals(first.divide(second)));
    }

    public void testDivide_a21Tob11() throws Exception {
        Complex first = new Complex(-2,1);
        Complex second = new Complex(1,-1);
        Complex right = new Complex(-1.5,-0.5);
        Assert.assertTrue("Method Complex.equal works wrong with re:-2 im:1 and re:1 im:-1", right.equals(first.divide(second)));
    }

    public void testDivide_a25Tob52() throws Exception {
        Complex first = new Complex(2,5);
        Complex second = new Complex(-5,2);
        Complex right = new Complex(0,-1);
        Assert.assertTrue("Method Complex.equal works wrong with re:2 im:5 and re:-5 im:2", right.equals(first.divide(second)));
    }

    public void testAdjunction_bothHigherThanZero() throws Exception {
        Complex start = new Complex(1,1);
        Complex right = new Complex(1,-1);
        Assert.assertTrue("Method Complex.adjunction works wrong with re:1 im:1 and re:1 im:-1", right.equals(start.adjunction()));
    }

    public void testAdjunction_zero() throws Exception {
        Complex start = new Complex(0,0);
        Complex right = new Complex(0,0);
        Assert.assertTrue("Method Complex.adjunction works wrong with re:0 im:0 and re:0 im:0", right.equals(start.adjunction()));
    }

    public void testAdjunction_bothLessThanZero() throws Exception {
        Complex start = new Complex(-1,-1);
        Complex right = new Complex(-1,1);
        Assert.assertTrue("Method Complex.adjunction works wrong with re:-1 im:-1 and re:-1 im:1", right.equals(start.adjunction()));
    }

    public void testAdjunction_bothLessThanZeroWrong() throws Exception {
        Complex start = new Complex(-1,-1);
        Complex right = new Complex(-1,-1);
        Assert.assertFalse("Method Complex.adjunction works wrong with re:-1 im:-1 and re:-1 im:-1", right.equals(start.adjunction()));
    }

}
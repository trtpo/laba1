package demo.parallel;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by люба on 10.09.2017.
 */
public class ComplexTest extends TestCase {
    public void testAdjunction_bothHigherThenZero1() throws Exception {
        Complex start = new Complex(1,1);
        Complex right = new Complex(1,-1);
        Assert.assertTrue(right.equals(start.adjunction()));
    }

    public void testAdjunction_bothHigherThenZero2() throws Exception {
        Complex start = new Complex(2,1);
        Complex right = new Complex(2,-1);
        Assert.assertTrue(right.equals(start.adjunction()));
    }

    public void testAdjunction_bothHigherThenZero3() throws Exception {
        Complex start = new Complex(1,3);
        Complex right = new Complex(1,-3);
        Assert.assertTrue(right.equals(start.adjunction()));
    }

    public void testAdjunction_bothHigherThenZero4() throws Exception {
        Complex start = new Complex(4,4);
        Complex right = new Complex(4,-4);
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

}
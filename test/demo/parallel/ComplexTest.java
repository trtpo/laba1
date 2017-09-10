package demo.parallel;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by люба on 10.09.2017.
 */
public class ComplexTest extends TestCase {
    public void testAdjunction() throws Exception {
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

}
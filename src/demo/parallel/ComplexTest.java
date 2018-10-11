package demo.parallel;

import org.junit.Assert;
import org.junit.Test;



public class ComplexTest {

    @Test
    public void testSubNegative(){
        Complex a = new Complex(-6.0,8.0);
        Complex b = new Complex(-3.0,-2.0);
        a.sub(b);
        Assert.assertEquals(-3.0,a.getRealPart(),0.0);
        Assert.assertEquals(10.0,a.getImagePart(),0.0);
    }

    @Test
    public void testDivPositive(){
        Complex a = new Complex(10.0,10.0);
        Complex b = new Complex(5.0,5.0);
        a.div(b);
        Assert.assertEquals(a.getRealPart(),2.0,0.0);
        Assert.assertEquals(a.getImagePart(),0.0,0.0);
    }

    @Test
    public void testDivNegative(){
        Complex a = new Complex(-10.0,-10.0);
        Complex b = new Complex(-5.0,-5.0);
        a.div(b);
        Assert.assertEquals(a.getRealPart(),2.0,0.0);
        Assert.assertEquals(a.getImagePart(),0.0,0.0);
    }

    @Test
    public void testDivOnZero(){
        Complex a = new Complex(-10.0,-10.0);
        Complex b = new Complex(0.0,0.0);
        a.div(b);
        Assert.fail("Can't use with operation to zero complex number");
    }
}
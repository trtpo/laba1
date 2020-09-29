package demo.parallel;

import org.junit.Test;
import org.junit.Assert;



public  class ComplexTest {

    @Test
    public void division() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 2);
        a.division(b);
        Complex c = new Complex(0.6, -0.2);
        Assert.assertEquals(a,c);
    }

    @Test
    public void difference() {
        Complex a = new Complex(5, 4);
        Complex b = new Complex(-2, 3);
        a.difference(b);
        Complex c = new Complex(7, 1);
        Assert.assertEquals(a,c);
    }

    @Test
    public void cube() {
        Complex a = new Complex(2, 5);
        Complex b = new Complex(-142, -65);
        a.cube();
        Assert.assertEquals(a,b);
    }
}
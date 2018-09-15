package demo.parallel;

import org.junit.Assert;

public class ComplexTest {
    @org.junit.Test
    public void minus() {
        Complex complex_first = new Complex(10,9);
        Complex complex_second = new Complex(5,5);
        Assert.assertEquals(new Complex(5,4), complex_first.minus(complex_second));
    }

    @org.junit.Test
    public void divide() {
        Complex complex_first=new Complex(10,9);
        Complex complex_second=new Complex(5,5);
        Assert.assertEquals(new Complex(1.9,-0.1),complex_first.divide(complex_second));
        Assert.assertEquals(new Complex(0,0),complex_first.divide(new Complex(0,0)));
    }
}

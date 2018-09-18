package demo.parallel;

import org.junit.Assert;

public class SampleTest {
    @org.junit.Test
    public void minus() {
        int a = (int)(Math.random() * 51);
        int b = (int)(Math.random() * 51);
        int c = (int)(Math.random() * 51);
        int d = (int)(Math.random() * 51);
        Complex complex_first = new Complex(a,b);
        Complex complex_second = new Complex(c,d);
        Assert.assertEquals(new Complex(a - c,b - d), complex_first.minus(complex_second));
    }

    @org.junit.Test
    public void division() {
        Complex complex_first=new Complex(2,4);
        Complex complex_second=new Complex(6,8);
        Assert.assertEquals(new Complex(0,0),complex_first.division(new Complex(0,0)));
        Assert.assertEquals(new Complex(0.44,0.08),complex_first.division(complex_second));
    }
}

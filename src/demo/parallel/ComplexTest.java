package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void plus() {
        Complex v = new Complex(10,5);
        Complex v1 = new Complex(3,3);
        Complex sum = new Complex(13,8);
        v =v.plus(v1);
        Assert.assertEquals(v.getIm(),sum.getIm(),0);
        Assert.assertEquals(v.getRe(),sum.getRe(),0);


    }

    @Test
    public void times() {
        Complex v = new Complex(3,3);
        Complex v1 = new Complex(4,4);
         v = v.times(v1);
        Complex mul = new Complex(0,24);
        Assert.assertEquals(v.getRe(),mul.getRe(),0);
        Assert.assertEquals(v.getIm(),mul.getIm(),0);
    }


    @Test
    public void lengthSQ() {

        Complex v = new Complex(3,3);
        double lenght = 18;
        double ln = v.lengthSQ();
        Assert.assertEquals(ln ,lenght,0);
    }
}
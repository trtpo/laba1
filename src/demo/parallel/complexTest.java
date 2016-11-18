package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by root on 11/16/16.
 */
public class complexTest {
    @Test
    public void minus() throws Exception {
        //arrange
        Complex a = new Complex(1,1);
        Complex b = new Complex(1,1);

        //act
        Complex res = a.minus(b);

        //assert
        Assert.assertEquals(res.getReal(),0,0.1);
        Assert.assertEquals(res.getImagine(),0,0.1);
    }

    @Test
    public void divide() throws Exception {
        //arrange
        Complex a = new Complex(1,1);
        Complex b = new Complex(1,1);

        //act
        Complex res = a.divide(b);

        //assert
        Assert.assertEquals(1,res.getReal(),0.1);
        Assert.assertEquals(0,res.getImagine(),0.1);
    }

   
    @Test
    public void conjugation() throws Exception {
        //arrange
        Complex a = new Complex(1,1);
        Complex b = new Complex(1,-1);

        //act
        boolean res;
        if (a.conjugation(b)) res = true;
        else res = false;

        //assert
        Assert.assertTrue(res);
    }
}

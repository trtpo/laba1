package test;

import org.junit.Assert;
import org.junit.Test;

import demo.parallel.Complex;


public class OperationsTest {
    
    @Test 
    public void devTest(){
        Complex complexNum = new Complex(33, 33).div(new Complex(3, 3));
        Complex result = new Complex(11,11);
        Assert.assertTrue(complexNum.equals(result));
    }

    @Test
    public void subTest(){
        Complex complexNum = new Complex(7,2).substract(new Complex(5,1));
        Complex result = new Complex(2,1);
        Assert.assertTrue(complexNum.equals(result));
    }
}

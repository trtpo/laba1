package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void Test_minus(){
        Complex tested=new Complex(5,2);
        Complex arg =new Complex(3,2);
        tested=tested.minus(arg);

        Assert.assertEquals(tested.getIm(),0,0.1);
        Assert.assertEquals(tested.getRe(),2,0.1);
    }

    @Test
    public void Test_tg(){
        Complex tested=new Complex(1,2);

        tested=tested.tg();

        Assert.assertEquals(tested.getIm(),1.015,0.1);
        Assert.assertEquals(tested.getRe(),0.034,0.1);



    }
}

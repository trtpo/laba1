package demo.parallel;
import org.junit.Assert;
import org.junit.Test;


public class Tests {
    @Test
    public void test_minus()
    {
        Complex testing = new Complex(6,3);
        Complex arg  = new Complex(1,3);
        testing = testing.minus(arg);
        Assert.assertEquals(testing.getIM(),0,0.1);
        Assert.assertEquals(testing.getRE(),5,0.1);
    }
}

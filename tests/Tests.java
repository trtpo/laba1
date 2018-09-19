import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public  void testMinus(){
        Complex a = new Complex(5,0);
        Complex b = new Complex(3,5);
        Assert.assertEquals(new Complex(2,-5),a.minus(b));
    }

    @Test
    public void testDevide_0(){
        Complex a = new Complex(5,0);
        Complex b = new Complex(0,0);
        Assert.assertEquals(new Complex(0,0), a.devide(b));
    }

    @Test
    public void testDevide_1(){
        Complex a = new Complex(5,4);
        Complex b = new Complex(2,0);
        Assert.assertEquals(new Complex(2.5,2), a.devide(b));
    }
}

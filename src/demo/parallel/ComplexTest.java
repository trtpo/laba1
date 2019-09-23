package demo.parallel;

import org.junit.Assert;
import org.junit.Test;
import sun.plugin.com.event.COMEventHandler;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void division() {
        Complex a=new Complex(2, 3);
        Complex b= new Complex(9, 7);
        Complex result = new Complex(3, -1);

        Assert.assertEquals(result, b.division(a));
    }

    @Test
    public void minus() {
        Complex a = new Complex(3, 7);
        Complex b = new Complex(4, -2);
        Complex result = new Complex(-1, 9);

        Assert.assertEquals(result, a.minus(b));
    }
}
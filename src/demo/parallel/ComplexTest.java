package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void division() {
        Complex a=new Complex(3, -2);
        Complex b= new Complex(4, 3);
        Complex result = new Complex(0.24, -0.68);

        Assert.assertEquals(result, b.division(a));
    }

    @Test
    public void minus() {
        Complex a = new Complex(4, 12);
        Complex b = new Complex(5, -3);
        Complex result = new Complex(-1, 15);

        Assert.assertEquals(result, a.minus(b));
    }
}
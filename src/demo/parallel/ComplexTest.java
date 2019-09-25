package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void minus() {
        Complex result = new Complex(3, 4).minus(new Complex(-2, 9));
        Assert.assertEquals((int) result.getRe(), 5);
        Assert.assertEquals((int) result.getIm(), -5);
        if (result.getRe() == 5 && result.getIm() == -5) {
            System.out.println("success");
        }
    }

    @Test
    public void division() {
        Complex result = new Complex(-1, 5).division(new Complex(2, 6));
        Assert.assertEquals((int) result.getRe(), 0);
        Assert.assertEquals((int) result.getIm(), 0);
        if (result.getRe() == 0.7 && result.getIm() == 0.4) {
            System.out.println("success");
        } else {
            System.out.println("wrong");
        }
    }

}
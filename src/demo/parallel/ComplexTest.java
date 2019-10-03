package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

public class ComplexTest {

    @Test
    public void minus() {
        Complex a = new Complex(2, 8);
        Complex b = new Complex(2, 6);
        Complex result = new Complex(0, 2);

        Assert.assertEquals(result, a.subtraction(b));
    }

    @Test
    public void div() {
        Complex a = new Complex(1, 4);
        Complex b = new Complex(-22, 14);
        Complex result = new Complex(2, 6);

        Assert.assertEquals(result, b.div(a));
    }
}
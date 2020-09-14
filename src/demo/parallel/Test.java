package demo.parallel;

import org.junit.Assert;

public class Test
{
    @org.junit.Test
    public void minus()
    {
        Complex x = new Complex(78, -5);
        Complex y = new Complex(-6, 13);

        Complex actual = x.minus(y);
        Complex expected = new Complex(78+6, -5-13);

        Assert.assertEquals(expected, actual);
    }
}
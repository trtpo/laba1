package demo.parallel;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class test {
    Complex a;
    Complex b;
    @Before
    public void Set()
    {
        a=new Complex(7,3);
        b=new Complex(4,-1);
    }
    @Test
    public void Test_minus()
    {
        Complex c=a.minus(b);
        assertEquals(c.getRe(),3.0);
        assertEquals(c.getIm(),4.0);
    }
}

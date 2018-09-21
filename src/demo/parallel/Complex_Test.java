package demo.parallel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class Complex_Test {
    Complex a,b;
    @Before
    public  void set()
    {
        b=new Complex(2,3);
        a=new Complex(1,9);
    }
    @Test
    public void tests()
    {
        Complex c=b.minus(a);
        assertEquals(c.getIm(),-6.0);
        assertEquals(c.getRe(),1.0);
    }


}

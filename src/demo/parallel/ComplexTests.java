package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ComplexTests {
    Complex a;
    Complex b;

    @Before
    public void SetUp()
    {
        a=new Complex(5,3);
        b=new Complex(2,-1);
    }
    @Test
    public void Tests_minus()
    {
        Complex c;
        c=a.minus(b);
        assertEquals(c.getRe(),3.0);
        assertEquals(c.getIm(),4.0);
    }

}

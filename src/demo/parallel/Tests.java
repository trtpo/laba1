package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
    Complex a;
    Complex b;
    @Before
    public void setMinus()
    {
        a=new Complex(-1,3);
        b=new Complex(1,2);
    }
    @Test
    public void Test_Minus()
    {
        Complex c;
        c=a.minus(b);
        assertEquals(c.getIm(),1.0);
        assertEquals(c.getRe(),-2.0);
    }
    @Test
    public void Test_Delete()
    {
        Complex c;
        c=a.div(b);
        assertEquals(c.getIm(),0.2);
        assertEquals(c.getRe(), -1.4);
    }


}

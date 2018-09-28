package demo.parallel;

import org.junit.Before;
import org.junit.Test;

public class test {
    Complex a,b;
    @Before
    public void set()
    {
        a=new Complex(5.0,5.0);
        b=new Complex(2.0,4)

    }
    @Test
    public void testing()
    {
        Complex c=a.minus(b);
        AssertEquals(3.0,c.getRe());
        AssertEquals(1.0,c.getIm());

    }
}

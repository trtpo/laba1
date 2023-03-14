package demo.parallel.tests;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
public class UnitTests {



    Complex a = new Complex(1,1);
    Complex b = new Complex(2,3);

    @Test
    void testIncrement()
    {
        Complex c = a.plus(b);
        assert c.getIm()==4 && c.getRe()==3;
    }

    @Test
    void testDecrement()
    {
        Complex c = a.minus(b);
        assert c.getIm()==-2 && c.getRe()==-1;
    }

    @Test
    void testMultiply()
    {
        Complex c = a.times(b);
        assert c.getIm()==5 && c.getRe()==-1;
    }

    @Test
    void testDiversity()
    {
        Complex a = new Complex(2,3);
        Complex b = new Complex(1,1);
        Complex c = a.dividedBy(b);
        assert c.getIm()==0.5 && c.getRe()==2.5;
    }

}

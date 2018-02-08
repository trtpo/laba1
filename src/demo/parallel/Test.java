package demo.parallel;
import junit.framework.TestCase;

public class Test extends TestCase {

    public void testPlus()
    {
        Complex a = new Complex(1,2);
        Complex b = new Complex(2,2);
        a.plus(b);

        assertEquals((double)3, a.get_real());
        assertEquals((double)4, a.get_imag());
    }

    public void testTimes()
    {
        Complex a = new Complex(1,2);
        Complex b = new Complex(2,2);
        a.times(b);

        assertEquals((double)-2, a.get_real());
        assertEquals((double)6, a.get_imag());
    }

    public void testMinus()
    {
        Complex a = new Complex(3,4);
        Complex b = new Complex(2,2);
        a.minus(b);

        assertEquals((double)1, a.get_real());
        assertEquals((double)2, a.get_imag());
    }

    public void testdivision()
    {
        Complex a = new Complex(7,-4);
        Complex b = new Complex(3,2);
        a.division(b);

        assertEquals((double)1, a.get_real());
        assertEquals((double)-2, a.get_imag());
    }
}

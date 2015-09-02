package demo.parallel;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Egor on 02.09.2015.
 */
public class ComplexTest {

    @Test
    public void testPlus() throws Exception {
        Complex a=new Complex(1,1);
        Complex b=new Complex(2,2);
        assertTrue(a.plus(a).compare(b)== true);
    }

    @Test
    public void testDiv() throws Exception {
        Complex a=new Complex(1,1);
        Complex b=new Complex(2,2);
        Complex c=new Complex(0.5,0);
        assertTrue(a.div(b).compare(c)== true);
    }

    @Test
    public void testTimes() throws Exception {
        Complex a=new Complex(1,1);
        Complex b=new Complex(2,2);
        Complex c=new Complex(0,4);
        assertTrue(a.times(b).compare(c)== true);
    }

}
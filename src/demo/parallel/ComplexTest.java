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
        a.plus(a);
        assertTrue(a.getRe()== b.getRe());
        assertTrue(a.getIm() == b.getIm());
        a.plus(b);
        assertFalse(a.getRe()== b.getRe());
        assertFalse(a.getIm() == b.getIm());
    }

    @Test
    public void testDiv() throws Exception {
        Complex a=new Complex(1,1);
        Complex b=new Complex(2,2);
        Complex c=new Complex(0.5,0);
        Complex d=new Complex(0.125,-0.125);
        a.div(b);
        assertEquals(a.getRe(), c.getRe(), 0.05);
        assertEquals(a.getIm(), c.getIm(), 0.05);
        a.div(b);
        assertEquals(a.getRe(), d.getRe(), 0.05);
        assertEquals(a.getIm(), d.getIm(), 0.05);
    }

    @Test
    public void testTimes() throws Exception {
        Complex a=new Complex(1,1);
        Complex b=new Complex(2,2);
        Complex c=new Complex(0,4);
        Complex d=new Complex(-8,8);
        a.times(b);
        assertEquals(a.getRe(), c.getRe(), 0.05);
        assertEquals(a.getIm(), c.getIm(), 0.05);
        a.times(b);
        assertEquals(a.getRe(), d.getRe(), 0.05);
        assertEquals(a.getIm(), d.getIm(), 0.05);
    }

}

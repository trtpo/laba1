package demo;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AJIOB on 12.09.2017.
 *
 * @author AJIOB
 */
public class ComplexTest extends Assert {
    @Test
    public void testEqualsAndClone() {
        final double startedReal = 1.3;
        final double startedImagine = 2.7;
        Complex c1 = new Complex(startedReal, startedImagine);
        Complex c2 = new Complex(startedReal, startedImagine);
        Complex c3 = c1.clone();
        Complex c4 = new Complex(startedImagine, startedReal);

        assertTrue("Object must be equal with itself", c1.equals(c1));
        assertTrue("Objects with equal constructor parameters are equal", c1.equals(c2));
        assertTrue("Cloned object is equals to original", c1.equals(c3));
        assertFalse("Objects with different constructor parameters are not equal", c1.equals(c4));
        assertTrue("If c1 equals c2 => c2 equals c1", c2.equals(c1));
        assertFalse("Must be different link after clone", c3.equals((Object) c1));
    }

    @Test
    public void testDivide() {
        final double startedReal = 1.3;
        final double startedImagine = 2.7;
        Complex c1 = new Complex(startedReal, startedImagine);

        assertEquals(c1, c1.divide(new Complex(2, 0)));                             //Object must return itself
        c1 = new Complex(startedReal, startedImagine);
        assertEquals(true, c1.clone().divide(new Complex(2, 0))
                .equals(new Complex(startedReal / 2, startedImagine / 2)));         //Dividing check
        assertEquals(true, c1.clone().divide(new Complex(1, 0))
                .equals(c1));                                                                  //Dividing to one
        assertEquals(true, c1.clone().divide(new Complex(0, -1))
                .equals(new Complex(- startedImagine, startedReal)));                          //Dividing not to real part only
    }

    @Test
    public void checkSin() {
        assertEquals(true, (new Complex(0, 0)).sin().equals(new Complex(0, 0)));     //checking sine (0, 0)
        assertEquals(true, (new Complex(Math.PI / 2, 0)).sin().equals(new Complex(1, 0)));     //checking sine (PI/2, 1)
        assertEquals(true, (new Complex(Math.PI * 3 / 2, 0)).sin().equals(new Complex(-1, 0)));     //checking sine (3 * PI /2, -1)
    }

    @Test
    public void checkCos() {
        assertEquals(true, (new Complex(0, 0)).cos().equals(new Complex(1, 0)));     //checking cosine (0, 1)
        assertEquals(true, (new Complex(Math.PI, 0)).cos().equals(new Complex(-1, 0)));     //checking cosine (PI, -1)
        assertEquals(true, (new Complex(Math.PI * 2, 0)).cos().equals(new Complex(1, 0)));     //checking cosine (2 * PI, 1)
    }

    @Test
    public void checkTan() {
        assertEquals(true, (new Complex(0, 0)).tan().equals(new Complex(0, 0)));     //checking tan (0, 0)
    }

    @Test
    public void checkExp() {
        assertEquals(true, (new Complex(0, 0)).exp().equals(new Complex(1, 0)));           //checking exp (0, 1)
        assertEquals(true, (new Complex(1, 0)).exp().equals(new Complex(Math.exp(1), 0)));      //checking exp (1, e)
    }
}

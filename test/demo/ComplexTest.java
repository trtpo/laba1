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

        assertEquals(true, c1.equals(c1));                      //Object must be equal with itself
        assertEquals(true, c1.equals(c2));                      //objects with equal constructor parameters are equal
        assertEquals(true, c1.equals(c3));                      //cloned object is equals to original
        assertEquals(false, c1.equals(c4));                     //objects with different constructor parameters are not equal
        assertEquals(true, c2.equals(c1));                      //if c1 equals c2 => c2 equals c1
        assertEquals(false, c3.equals((Object) c1));            //not one link after clone
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
}

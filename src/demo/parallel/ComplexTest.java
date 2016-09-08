package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Владислав on 07.09.2016.
 */
public class ComplexTest {
    private Complex complex;
    @Before
    public void setUp() throws Exception {
        complex = new Complex(1,2);
    }
    @Test
     public void minus() throws Exception {
        complex.minus(new Complex(2,3));
        assertEquals(-1,complex.getRe(),0.0001);
        assertEquals(-1,complex.getIm(),0.0001);
     }
     @Test
     public void sin() throws Exception {
        complex.cos(complex);
        assertEquals(2.03272300633654,complex.getRe(),0.0001);
        assertEquals(-3.05189779921328,complex.getIm(),0.0001);
     }


}

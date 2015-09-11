package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 11.09.2015.
 */
public class ComplexTest {
    Complex a= new Complex(5,4);
    Complex b= new Complex(7,10);

    @Test
    public void testMinus() throws Exception {
        a.minus(b);
        assertEquals(a.get_real(), -2,0);
        assertEquals(a.get_imagine(), -6,0);
    }

    @Test
    public void testDivision() throws Exception {
        a.division(b);
        assertEquals(a.get_real(), 0,5);
        assertEquals(a.get_imagine(), -0,1);
    }
}
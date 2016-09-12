package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hudov on 12.09.2016.
 */
public class Test {
    private Complex number;

    @Before
    public void setUp() throws Exception {
        number = new Complex(2,5);
    }

    @Test
    public void minus() throws Exception {
        number.minus(new Complex(5,6));
        assertEquals(-3,number.getRe(),0.00001);
        assertEquals(-1,number.getIm(),0.00001);

    }

    @Test
    public void times() throws Exception {
        number.times(new Complex(5,6));
        assertEquals(-20,number.getRe(),0.00001);
        assertEquals(37,number.getIm(),0.00001);
    }

}
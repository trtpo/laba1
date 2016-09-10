package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Никита Близнюк on 10.09.2016.
 */
public class ComplexTest {
    private Complex number;
    @Before
    public void setUp() throws Exception {
        number = new Complex(1,5);
    }

    @Test
    public void minus() throws Exception {
        number.minus(new Complex(3,5));
        assertEquals(-2,number.getRe(),0.00001);
        assertEquals(0,number.getIm(),0.00001);
    }

    @Test
    public void divide() throws Exception {
        number.divide(new Complex(4,9));
        assertEquals((double) 49/97, number.getRe(), 0.00001);
        assertEquals((double) 11/97, number.getIm(), 0.00001);
    }

}
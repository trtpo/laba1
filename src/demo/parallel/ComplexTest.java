package demo.parallel;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by admin on 16.09.2016.
 */
public class ComplexTest {
    private Complex number;
    @Before
    public  void setUp() throws Exception {
        number = new Complex(3,4);
    }

    @Test
    public void plus() throws Exception {
        assertEquals(7, number.plus(new Complex(4,2)).getRe(), 0.00001);
        assertEquals(3, number.plus(new Complex(4,-3)).getIm(), 0.00001);
    }

}
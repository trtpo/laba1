package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 06.09.2016.
 */
public class ComplexTest {
    private Complex number;
    @Before
    public void setUp() throws Exception {
        number = new Complex(9,-4);
    }

    @Test
    public void minus() throws Exception {
        number.minus(new Complex(4,3));
        assertEquals(5, number.getRe(), 0.00001);
        assertEquals(-7, number.getIm(), 0.00001);
    }

}
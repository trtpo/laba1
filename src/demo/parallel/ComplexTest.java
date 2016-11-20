package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Deeo on 17.11.2016.
 */
public class ComplexTest {
    private Complex number;

    @Before
    public void before() throws Exception {
        number = new Complex(5, 5);
    }

    @Test
    public void plusTest() throws Exception {
        number.plus(new Complex(1, 1));
        assertEquals("Plus fail",6, number.getRe(), 1e-15);
        assertEquals("Plus fail",6, number.getIm(), 1e-15);
    }
    @Test
    public void subtractionTest() throws Exception {
        number.minus(new Complex(1, 1));
        assertEquals("Minus fail",4, number.getRe(), 1e-15);
        assertEquals("Minus fail",4, number.getIm(), 1e-15);
    }
    @Test
    public void timesTest() throws Exception {
        number.times(new Complex(1,1));
        assertEquals("Times fail",0, number.getRe(), 1e-15);
        assertEquals("Times fail",10, number.getIm(), 1e-15);
    }
    @Test
    public void divideTest() throws Exception {
        number.divide(new Complex(1, 1));
        assertEquals("Divide fail",5, number.getRe(), 1e-15);
        assertEquals("Divide fail",0, number.getIm(), 1e-15);
    }
}

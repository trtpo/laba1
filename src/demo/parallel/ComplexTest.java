package demo.parallel;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.*;

/**
 * Created by LoveIsStuff on 04-Sep-16.
 */
public class ComplexTest {
    private Complex number;
    @Before
    public void setUp() throws Exception {
        number = new Complex(1,2);
    }

    @Test
    public void minus() throws Exception {
        number.minus(new Complex(2,3));
        assertEquals(-1,number.getRe(),0.0001);
        assertEquals(-1,number.getIm(),0.0001);
    }

    @Test
    public void divide() throws Exception {
        number.divide(new Complex(2,3));
        assertEquals((double)8/13,number.getRe(),0.00001);
        assertEquals((double)1/13,number.getIm(),0.00001);
    }

}
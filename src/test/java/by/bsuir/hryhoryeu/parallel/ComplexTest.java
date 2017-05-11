package by.bsuir.hryhoryeu.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author  by maxim on 11.05.17.
 */
public class ComplexTest {

    private Complex complex1 = new Complex(40.0d, 25.0d);
    private Complex complex2 = new Complex(20.0d, 10.0d);

    @Test
    public void testPlus() {
        Complex actual = complex1.plus(complex2);
        Complex expected = new Complex(60.0d, 35.0d);
        assertEquals("commlex not equal", expected, actual);
    }

    @Test
    public void minus() throws Exception {
        Complex actual = complex1.minus(complex2);
        Complex expected = new Complex(20.0d, 15.0d);
        assertEquals("commlex not equal", expected, actual);
    }

}
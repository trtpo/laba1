package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by ilyam on 08.09.2016.
 */
public class ComplexTest {

    Complex number = new Complex(4, 4);

    @org.junit.Test
    public void checkSubstr() {
        number.substr(new Complex(2, 6));
        assertEquals(2, number.getRe(), 0.1);
        assertEquals(-2, number.getIm(), 0.1);
    }

    @org.junit.Test
    public void checkDivision() {
        number.division(new Complex(2, 6));
        assertEquals(0.8, number.getRe(), 0.1);
        assertEquals(-0.4, number.getIm(), 0.1);
    }
}
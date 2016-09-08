package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by evgenii on 9/9/16.
 */
public class ComplexTest {

    Complex textObj = new Complex(2, 2);

    @org.junit.Test
    public void division() throws Exception {
        textObj.division(new Complex(2, 4));
        assertEquals(-0.2, textObj.getIm(), 0.1);
        assertEquals(0.6, textObj.getRe(), 0.1);
    }

    @org.junit.Test
    public void substract() throws Exception {
        textObj.substract(new Complex(1, 1));
        assertEquals(1, textObj.getIm(), 0.1);
        assertEquals(1, textObj.getRe(), 0.1);
    }

}
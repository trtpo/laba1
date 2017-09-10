package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Tests {

    private Complex x;
    private Complex y;

    @Before
    public void testSetup() throws Exception {
        x = new Complex(5, 3);
        y = new Complex(6, 9);
    }

    @Test
    public void minusTest1() throws Exception {
        x.minus(y);
        assertEquals("Wrong real part of result after subtraction",-1.0, x.getRe(), 0.001);
        assertEquals("Wrong imaginary part of result after subtracion", -6.0, x.getIm(), 0.001);
    }

    @Test
    public void minusTest2() throws Exception {
        y.minus(x);
        assertEquals("Wrong real part of result after subtraction",1.0, y.getRe(), 0.001);
        assertEquals("Wrong imaginary part of result after subtracion", 6.0, y.getIm(), 0.001);
    }

    @Test
    public void conjugateTest1() throws Exception {
        x.conjugate();
        assertEquals("Wrong real part of result after conjugation", 5.0, x.getRe(), 0.001);
        assertEquals("Wrong imaginary part of result after conjugation", -3.0, x.getIm(), 0.001);
    }

    @Test
    public void conjugateTest2() throws Exception {
        y.conjugate();
        assertEquals("Wrong real part of result after conjugation", 6.0, y.getRe(), 0.001);
        assertEquals("Wrong imaginary part of result after conjugation", -9.0, y.getIm(), 0.001);
    }

}

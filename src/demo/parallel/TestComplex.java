package demo.parallel;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TestComplex {
    private Complex complexNumber;

    @Before
    public void setUp(){

        complexNumber = new Complex(3,5);
    }

    @Test public void plus() throws Exception{

        complexNumber.plus(new Complex(2,3));
        assertEquals(5,complexNumber.getRe(),0.0001);
        assertEquals(8,complexNumber.getIm(),0.0001);
    }

    @Test
    public void minus() throws Exception{

        complexNumber.minus(new Complex(2,3));
        assertEquals(1,complexNumber.getRe(),0.0001);
        assertEquals(2,complexNumber.getIm(),0.0001);
    }

    @Test
    public void divide() throws Exception{

        complexNumber.divide(new Complex(2,3));
        assertEquals(1.61,complexNumber.getRe(),0.1);
        assertEquals(0.07,complexNumber.getIm(),0.01);
    }
}

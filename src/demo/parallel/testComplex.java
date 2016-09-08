package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by sanyasky on 6.9.16.
 */
public class testComplex {

    private Complex num;

    @Before
    public void setUp() throws Exception {
     num = new Complex(1, 2);
    }


    @Test
    public void testSin(){
        assertEquals(3.051898,num.sin(num).getRe(),0.00001);
        assertEquals(0.94538,num.sin(num).getIm(),0.00001);
    }

    @Test
    public void testMinus(){
        assertEquals(-2,num.minus(new Complex(3,4)).getRe(),0.00001);
        assertEquals(-6,num.minus(new Complex(3,4)).getIm(),0.00001);
    }

}

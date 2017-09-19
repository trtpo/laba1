package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by alexey on 07.09.17.
 */
public class ComplexTest {

    @org.junit.Test
    public void minus_positive() throws Exception {
        Complex num = new Complex(23,18).minus(new Complex(20,2));
        assertEquals("Wrong real part in method minus(object: Complex(23, 18), argument: Complex(20, 2)) of class Complex(file: demo.parallel.Complex.java)", 3, num.getRe(),0);
        assertEquals("Wrong imagine part in method minus(object: Complex(23, 18), argument: Complex(20, 2)) of class Complex(file: demo.parallel.Complex.java)", 16, num.getIm(),0);
    }

    @org.junit.Test
    public void minus_negative() throws Exception {
        Complex num = new Complex(3,8).minus(new Complex(8,15));
        assertEquals("Wrong real part in method minus(object: Complex(3, 8), argument: Complex(8, 15)) of class Complex(file: demo.parallel.Complex.java)", -5, num.getRe(),0);
        assertEquals("Wrong imagine part in method minus(object: Complex(3, 8), argument: Complex(8, 15)) of class Complex(file: demo.parallel.Complex.java)", -7, num.getIm(),0);
        
    }

}
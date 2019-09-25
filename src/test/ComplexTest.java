package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void divide() {
        //Test1
        Complex result = new Complex(2,8).divide(new Complex(2,1));
        assertEquals(result.getRe(), 2.4, 0.1);
        assertEquals(result.getIm(), 2.8, 0.1);

        //Test2
        result = new Complex(2,8).divide(new Complex(1,0));
        assertEquals(result.getRe(), 2, 0.1);
        assertEquals(result.getIm(), 8, 0.1);
    }
}
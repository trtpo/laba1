package test.demo.parallel;
import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void defaultMinus() {
        Complex a = new Complex(10,20);
        Complex b = new Complex( 5,10);
        a.minus(b);
        assertEquals(a.getRe(),5,0);
        assertEquals(a.getIm(),10,0);
    }

    @Test
    public void defaultDivision() {
        Complex a = new Complex(10, 10);
        Complex b = new Complex(5, 5);
        a.division(b);
        assertEquals(a.getRe(),2,0);
        assertEquals(a.getIm(),0,0);
    }

}
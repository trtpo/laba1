package test.demo.parallel;
import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void defaultMinusPos() {
        Complex a = new Complex(10,20);
        Complex b = new Complex( 5,10);
        a.minus(b);
        assertEquals("Error value with Re in defaultMinusPos() function",a.getRe(),5,0);
        assertEquals("Error value with Im in defaultMinusPos() function",a.getIm(),10,0);
    }

    @Test
    public void defaultMinusNegative() {
        Complex a = new Complex(-10,2);
        Complex b = new Complex( -5,-3);
        a.minus(b);
        assertEquals("Error value with Re in defaultMinusNegative function",a.getRe(),-5,0);
        assertEquals("Error value with Im in defaultMinusNegative function",a.getIm(),5,0);
    }

    @Test
    public void defaultDivisionPos() {
        Complex a = new Complex(10, 10);
        Complex b = new Complex(5, 5);
        a.division(b);
        assertEquals("Error value with Re in defaultDivisionPos() function", a.getRe(),2,0);
        assertEquals("Error value with Im in defaultDivisionPos() function", a.getIm(),0,0);
    }

    @Test
    public void defaultDivisionNegative() {
        Complex a = new Complex(-10, -10);
        Complex b = new Complex(-5, -5);
        a.division(b);
        assertEquals("Error value with Re in defaultDivisionNegative() function", a.getRe(),2,0);
        assertEquals("Error value with Im in defaultDivisionNegative() function", a.getIm(),0,0);
    }

    @Test
    public void defaultDivisionWithZero() {
        Complex a = new Complex(0, 8);
        Complex b = new Complex(-5, 0);
        a.division(b);
        assertEquals("Error value with Re in defaultDivisionWithZero() function", a.getRe(),0,0);
        assertEquals("Error value with Im in defaultDivisionWithZero() function", a.getIm(),-1.6,0);
    }
}
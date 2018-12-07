package Tests;

import demo.parallel.Complex;
import org.junit.Test;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.Assert.*;

public class ComplexTests {
    @Test
    public void MinusOperationWithPositiveNumber(){
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 2);
        a.sub(b);
        assertEquals("Invalid value of the real part in MinusOperationWithPositiveNumber()", a.getRe(), -2, 0.00001);
        assertEquals("Invalid value of the imaginary part in MinusOperationWithPositiveNumber()", a.getIm(), 1, 0.00001);
    }
    @Test
    public void MinusOperationWithNegativeNumber(){
        Complex a = new Complex(2, 3);
        Complex b = new Complex(-4, -2);
        a.sub(b);
        assertEquals("Invalid value of the real part in MinusOperationWithNegativeNumber()", a.getRe(), 6, 0.00001);
        assertEquals("Invalid value of the imaginary part in MinusOperationWithNegativeNumber()", a.getIm(), 5, 0.00001);
    }
    @Test
    public void MinusOperationWithZero(){
        Complex a = new Complex(2, 3);
        Complex b = new Complex(0, 0);
        a.sub(b);
        assertEquals("Invalid value of the real part in MinusOperationWithZero()", a.getRe(), 2, 0.00001);
        assertEquals("Invalid value of the imaginary part in MinusOperationWithZero()", a.getIm(), 4, 0.00001);
    }
    @Test
    public void MinusOperationWithSelf(){
        Complex a = new Complex(2, 3);
        a.sub(a);
        assertEquals("Invalid value of the real part in MinusOperationWithSelf()", a.getRe(), 0, 0.00001);
        assertEquals("Invalid value of the imaginary part in MinusOperationWithSelf()", a.getIm(), 0, 0.00001);
    }
    @Test
    public void DivideOperationWithPositiveNumber(){
        Complex a = new Complex(100, 450);
        Complex b = new Complex(20, 5);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithPositiveNumber()", a.getRe(), 10, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithPositiveNumber()", a.getIm(), 20, 0.00001);
    }
    @Test
    public void DivideOperationWithNegativeNumber(){
        Complex a = new Complex(100, 450);
        Complex b = new Complex(-20, -5);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithNegativeNumber()", a.getRe(), -10, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithNegativeNumber()", a.getIm(), -20, 0.00001);
    }
    @Test
    public void DivideOperationWithZero(){
        Complex a = new Complex(100, 0);
        Complex b = new Complex(0, 5);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithZero()", a.getRe(), 0, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithZero()", a.getIm(), -20, 0.00001);
    }
    @Test
    public void DivideOperationWithOne(){
        Complex a = new Complex(100, 450);
        Complex b = new Complex(1, 0);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithOne()", a.getRe(), 100, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithOne()", a.getIm(), 450, 0.00001);
    }
    @Test
    public void DivideOperationWithNegativeOne(){
        Complex a = new Complex(100, 450);
        Complex b = new Complex(-1, 0);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithNegativeOne()", a.getRe(), -100, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithNegativeOne()", a.getIm(), -450, 0.00001);
    }
    @Test
    public void DivideOperationWithSelf(){
        Complex a = new Complex(100, 450);
        a.div(a);
        assertEquals("Invalid value of the real part in DivideOperationWithSelf()", a.getRe(), 1, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithSelf()", a.getIm(), 0, 0.00001);
    }
    @Test
    public void DivideOperationWithInfinity(){
        Complex a = new Complex(100, 450);
        Complex b = new Complex(POSITIVE_INFINITY, NEGATIVE_INFINITY);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithInfinity()", a.getRe(), Double.NaN, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithInfinity()", a.getIm(), Double.NaN, 0.00001);
    }
}


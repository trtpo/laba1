package demo.parallel;

import org.junit.Test;
import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.POSITIVE_INFINITY;
import demo.parallel.Complex;

import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void MinusOperationWithPositiveNumber(){
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 2);
        a.minus(b);
        assertEquals("Invalid value of the real part in MinusOperationWithPositiveNumber()", a.getReal(), -2, 0.00001);
        assertEquals("Invalid value of the imaginary part in MinusOperationWithPositiveNumber()", a.getImaginary(), 1, 0.00001);
    }
    @Test
    public void MinusOperationWithNegativeNumber(){
        Complex a = new Complex(2, 3);
        Complex b = new Complex(-4, -2);
        a.minus(b);
        assertEquals("Invalid value of the real part in MinusOperationWithNegativeNumber()", a.getReal(), 6, 0.00001);
        assertEquals("Invalid value of the imaginary part in MinusOperationWithNegativeNumber()", a.getImaginary(), 5, 0.00001);
    }
    @Test
    public void MinusOperationWithZero(){
        Complex a = new Complex(2, 3);
        Complex b = new Complex(0, 0);
        a.minus(b);
        assertEquals("Invalid value of the real part in MinusOperationWithZero()", a.getReal(), 2, 0.00001);
        assertEquals("Invalid value of the imaginary part in MinusOperationWithZero()", a.getImaginary(), 3, 0.00001);
    }
    @Test
    public void MinusOperationWithSelf(){
        Complex a = new Complex(2, 3);
        a.minus(a);
        assertEquals("Invalid value of the real part in MinusOperationWithSelf()", a.getReal(), 0, 0.00001);
        assertEquals("Invalid value of the imaginary part in MinusOperationWithSelf()", a.getImaginary(), 0, 0.00001);
    }
    @Test
    public void DivideOperationWithPositiveNumber(){
        Complex a = new Complex(100, 450);
        Complex b = new Complex(20, 5);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithPositiveNumber()", a.getReal(), 10, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithPositiveNumber()", a.getImaginary(), 20, 0.00001);
    }
    @Test
    public void DivideOperationWithNegativeNumber(){
        Complex a = new Complex(100, 450);
        Complex b = new Complex(-20, -5);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithNegativeNumber()", a.getReal(), -10, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithNegativeNumber()", a.getImaginary(), -20, 0.00001);
    }
    @Test
    public void DivideOperationWithZero(){
        Complex a = new Complex(100, 0);
        Complex b = new Complex(0, 5);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithZero()", a.getReal(), 0, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithZero()", a.getImaginary(), -20, 0.00001);
    }
    @Test
    public void DivideOperationWithOne(){
        Complex a = new Complex(100, 450);
        Complex b = new Complex(1, 0);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithOne()", a.getReal(), 100, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithOne()", a.getImaginary(), 450, 0.00001);
    }
    @Test
    public void DivideOperationWithNegativeOne(){
        Complex a = new Complex(100, 450);
        Complex b = new Complex(-1, 0);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithNegativeOne()", a.getReal(), -100, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithNegativeOne()", a.getImaginary(), -450, 0.00001);
    }
    @Test
    public void DivideOperationWithSelf(){
        Complex a = new Complex(100, 450);
        a.div(a);
        assertEquals("Invalid value of the real part in DivideOperationWithSelf()", a.getReal(), 1, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithSelf()", a.getImaginary(), 0, 0.00001);
    }
    @Test
    public void DivideOperationWithInfinity(){
        Complex a = new Complex(100, 450);
        Complex b = new Complex(POSITIVE_INFINITY, NEGATIVE_INFINITY);
        a.div(b);
        assertEquals("Invalid value of the real part in DivideOperationWithInfinity()", a.getReal(), Double.NaN, 0.00001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithInfinity()", a.getImaginary(), Double.NaN, 0.00001);
    }

    @Test
    public void SinOfZero(){
        Complex a = new Complex(0, 0);
        a.sin();
        assertEquals("Invalid value of the real part in DivideOperationWithInfinity()", a.getReal(), 0, 0.000000000000001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithInfinity()", a.getImaginary(), 0, 0.000000000000001);
    }

    @Test
    public void SinOfRandom(){
        Complex a = new Complex(2.4568486, 9.54555548);
        a.sin();
        assertEquals("Invalid value of the real part in DivideOperationWithInfinity()", a.getReal(), 4421.761271765428, 0.000000000000001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithInfinity()", a.getImaginary(), -5415.254684662877, 0.000000000000001);
    }

    @Test
    public void SinOfNegativeReal(){
        Complex a = new Complex(-7.564856, 5.5645984);
        a.sin();
        assertEquals("Invalid value of the real part in DivideOperationWithInfinity()", a.getReal(), -125.09499848191258, 0.000000000000001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithInfinity()", a.getImaginary(), 37.209766797438526, 0.000000000000001);
    }

    @Test
    public void SinOfNegativeIm(){
        Complex a = new Complex(2.6545454, -18.4545415);
        a.sin();
        assertEquals("Invalid value of the real part in DivideOperationWithInfinity()", a.getReal(), 2.4206867711965363E7, 0.000000000000001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithInfinity()", a.getImaginary(), 4.5707720584694386E7, 0.000000000000001);
    }

    public void SinOfNegative(){
        Complex a = new Complex(-1, -1);
        a.sin();
        assertEquals("Invalid value of the real part in DivideOperationWithInfinity()", a.getReal(), -1.2984575814159773, 0.000000000000001);
        assertEquals("Invalid value of the imaginary part in DivideOperationWithInfinity()", a.getImaginary(), -0.6349639147847361, 0.000000000000001);
    }


}
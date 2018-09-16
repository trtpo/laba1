package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.Test;
import org.junit.Assert;

public class ComplexTest {

    @Test
    public void testTimesWhenTwoOperandsAreZero() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(0, 0);
        a.times(b);
        Assert.assertEquals(a.getReal(), 0, 0);
        Assert.assertEquals(a.getImagine(), 0, 0);
    }

    @Test
    public void testTimesOnRandomDigit() {
        Complex a = new Complex(2, 9);
        Complex b = new Complex(7, 6);
        a.times(b);
        Assert.assertEquals(a.getReal(), -40,0);
        Assert.assertEquals(a.getImagine(), 75,0);
    }

    @Test
    public void testDivisionWhenSecondOperandAreZero() {
        Complex a = new Complex(2, 9);
        Complex b = new Complex(0, 0);
        boolean error = false;
        try {
            a.division(b);
            error = true;
        } catch(ArithmeticException e) {}
        Assert.assertFalse(error);
    }

    @Test
    public void testDivisionOnRandomDigit() {
        Complex a = new Complex(2, 9);
        Complex b = new Complex(8, 6);
        a.division(b);
        Assert.assertEquals(a.getReal(), 0.7, 0);
        Assert.assertEquals(a.getImagine(), 0.6, 0);
    }

    @Test
    public void testMinusOnRandomDigit() {
        Complex a = new Complex(5, 9);
        Complex b = new Complex(4, 48);
        a.minus(b);
        Assert.assertEquals(a.getReal(), 1,0);
        Assert.assertEquals(a.getImagine(), -39, 0);
    }

    @Test
    public void testMinusWhenTwoOperandsAreZero() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(0, 0);
        a.minus(b);
        Assert.assertEquals(a.getReal(), 0, 0);
        Assert.assertEquals(a.getImagine(), 0, 0);
    }

    @Test
    public void testPlusOnRandomDigit() {
        Complex a = new Complex(8, -5);
        Complex b = new Complex(-7, 8);
        a.plus(b);
        Assert.assertEquals(a.getReal(), 1,0);
        Assert.assertEquals(a.getImagine(), 3, 0);
    }

    @Test
    public void testPlusWhenTwoOperandsAreZero() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(0, 0);
        a.plus(b);
        Assert.assertEquals(a.getReal(), 0, 0);
        Assert.assertEquals(a.getImagine(), 0, 0);
    }
}


package demo.parallel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex complex1;
    private Complex complex2;

    @Before
    public void setUp() throws Exception {
        complex1 = new Complex(1, -3);
        complex2 = new Complex(2, 4);
    }

    @Test
    public void minus1() throws Exception {
        Complex newComplex = complex2.minus(complex1);
        assertEquals("Real part of subtracting", 1, newComplex.getRealPart(), 0.0);
        assertEquals("Imaginary part of subtracting", 7, newComplex.getImagePart(), 0.0);
    }

    @Test
    public void minus2() throws Exception {
        Complex newComplex = complex1.minus(complex2);
        assertEquals("Error in Real part during subtraction  operation", -1, newComplex.getRealPart(), 0.0);
        assertEquals("Error in Imaginary part during subtraction operation", -7, newComplex.getImagePart(), 0.0);
    }

    @Test
    public void customOperation1() throws Exception {
        Complex newComplex = complex2.customOperation(complex1);
        assertEquals("Error in Real part during custom operation", -1, newComplex.getRealPart(), 0.0);
        assertEquals("Error in Imaginary part during custom operation", 3, newComplex.getImagePart(), 0.0);
    }

    @Test
    public void customOperation2() throws Exception {
        Complex newComplex = complex1.customOperation(complex2);
        assertEquals("Error in Real part during custom operation", 5, newComplex.getRealPart(), 0.0);
        assertEquals("Error in Imaginary part during custom operation", -5, newComplex.getImagePart(), 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void zeroDivision() {
        Complex temp = complex1.div(new Complex(0, 0));
    }

    @Test
    public void normalDivision1() {
        Complex temp = complex1.div(complex2);
        assertEquals("Error in Real part during dividing operation", temp.getRealPart(), -0.5, 0.0);
        assertEquals("Error in Imaginary part during dividing operation", temp.getImagePart(), -0.5, 0.0);
    }

    @Test
    public void normalDivision2() {
        Complex temp = complex2.div(complex1);
        assertEquals("Error in Real part during dividing operation", temp.getRealPart(), -1.0, 0.0);
        assertEquals("Error in Imaginary part during dividing operation", temp.getImagePart(), 1.0, 0.0);
    }
}
package demo.parallel;

import org.junit.Before;
import org.junit.Test;

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
        assertEquals( "Real part of subtracting",1, newComplex.getRealPart(),0.0);
        assertEquals( "Imaginary part of subtracting",7, newComplex.getImagePart(), 0.0);
    }

    @Test
    public void minus2() throws Exception {
        Complex newComplex = complex1.minus(complex2);
        assertEquals( "Real part of subtracting",-1, newComplex.getRealPart(),0.0);
        assertEquals( "Imaginary part of subtracting",-7, newComplex.getImagePart(), 0.0);
    }

    @Test
    public void customOperation1() throws Exception {
        Complex newComplex = complex2.customOperation(complex1);
        assertEquals( "Real part of custom operation",-1, newComplex.getRealPart(),0.0);
        assertEquals( "Imaginary part of custom operation",3, newComplex.getImagePart(), 0.0);
    }

    @Test
    public void customOperation2() throws Exception {
        Complex newComplex = complex1.customOperation(complex2);
        assertEquals( "Real part of custom operation",5, newComplex.getRealPart(),0.0);
        assertEquals( "Imaginary part of custom operation",-5, newComplex.getImagePart(), 0.0);
    }

}
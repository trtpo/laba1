package test;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void div() {

        Complex[] args1 = {
                new Complex(1.9, 1.5),
                new Complex(-1.0, 2.2),
                new Complex(0, 0)
        };

        Complex[] args2 = {
                new Complex(1.7, 13.4),
                new Complex(-1.4, -2.8),
                new Complex(5.5,4.3)
        };

      
        Complex[] expected= new Complex[args1.length];

        for (int i=0;i<expected.length;i++)
            expected[i]= new Complex(0,0);

        int count=0;
        for (int i = 0; i < args1.length; i++) {
                expected[count]=args1[i].div(args2[i]);
                count++;
            }


        Complex[] actual = {
                new Complex(0.12787064949301 ,-0.12556864894492),
                new Complex(-0.48571428571429 ,-0.6),
                new Complex(0  ,0),

        };
        double[] realExpected= new double[expected.length];
        double[]  realActuals = new double[actual.length];

        double[] imagExpected = new double[expected.length];
        double[] imagActuals = new double[actual.length];
        for(int i=0;i<actual.length;i++){
            realExpected[i]=expected[i].getRe();
            realActuals[i]=actual[i].getRe();
            imagActuals[i]=actual[i].getIm();
            imagExpected[i]=expected[i].getIm();
        }
        assertArrayEquals(realExpected,realActuals,0.1);
        assertArrayEquals(imagExpected,imagActuals,0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void divOnZero(){
        Complex complex0= new Complex(1,2);
        Complex complex1= new Complex(0,0);

        complex0.div(complex1);

    }

    @Test
    public void testPower(){
        Complex complex= new Complex(1.3,2.6);
        complex.powComplex(2);

        assertEquals(-5.07,complex.getRe(),0.001);
        assertEquals(6.76,complex.getIm(),0.001);

        complex.setRe(-1.5);
        complex.setIm(4.7);

        complex.powComplex(3);

        assertEquals(96.03,complex.getRe(),0.0000001);
        assertEquals(-72.098,complex.getIm(),0.001);

        complex.setRe(-1.5);
        complex.setIm(4.7);

        complex.powComplex(-3);

        assertEquals(0.0066595549563848 ,complex.getRe(),0.0000001);
        assertEquals(0.0049999020435846,complex.getIm(),0.001);

        complex.setRe(-1.5);
        complex.setIm(4.7);

        complex.powComplex(-2);

        assertEquals(-0.033488872039425  ,complex.getRe(),0.0000001);
        assertEquals(0.023800055229632,complex.getIm(),0.001);
        complex.setRe(-1.5);
        complex.setIm(4.7);

        complex.powComplex(5);

        assertEquals(-2921.817   ,complex.getRe(),0.0001);
        assertEquals(76.401320000001,complex.getIm(),0.001);


    }

}
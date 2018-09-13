package demo.parallel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest extends Assert {

    @Test
    public void reciprocalNullComplex() {
        Complex complex = new Complex(0, 0);
        double difOfSq = complex.getRe()*complex.getRe() + complex.getIm()*complex.getIm();
        double re =  complex.getRe() / difOfSq;
        double im = - complex.getIm() / difOfSq;

        assertEquals(re, complex.reciprocal().getRe(), 0.00001);
        assertEquals(im, complex.reciprocal().getIm(),0.00001);
    }

    @Test
    public void reciprocalNegRealComplex() {
        Complex complex = new Complex(-10, 5);
        double difOfSq = complex.getRe()*complex.getRe() + complex.getIm()*complex.getIm();
        double re =  complex.getRe() / difOfSq;
        double im = - complex.getIm() / difOfSq;

        assertEquals(re, complex.reciprocal().getRe(), 0.00001);
        assertEquals(im, complex.reciprocal().getIm(),0.00001);
    }

    @Test
    public void reciprocalNegImComplex() {
        Complex complex = new Complex(4, -7);
        double difOfSq = complex.getRe()*complex.getRe() + complex.getIm()*complex.getIm();
        double re =  complex.getRe() / difOfSq;
        double im = - complex.getIm() / difOfSq;

        assertEquals(re, complex.reciprocal().getRe(), 0.00001);
        assertEquals(im, complex.reciprocal().getIm(),0.00001);
    }

    @Test
    public void divides() {
        Complex complexA = new Complex(4, -7);
        Complex complexB = new Complex(-18, 6);
        double difOfSq = complexB.getRe()*complexB.getRe() + complexB.getIm()*complexB.getIm();
        Complex complexAnB = complexA.times(complexB.conjugate());
        double re = complexAnB.getRe() / difOfSq;
        double im = complexAnB.getIm() / difOfSq;

        Complex complexResA = new Complex(4, -7);
        Complex complexResB = new Complex(-18, 6);
        Complex result = complexResA.divides(complexResB);
        assertEquals(re, result.getRe(), 0.00001);
        assertEquals(im,  result.getIm(),0.00001);
    }

    @Test
    public void sinPositiveRealNegativeImaginary() {
        Complex complex = new Complex(4, -17);
        double re = Math.sin(complex.getRe()) * Math.cosh(complex.getIm());
        double im =  Math.cos(complex.getRe()) * Math.sinh(complex.getIm());

        assertEquals(re, complex.sin().getRe(), 0.00001);
        assertEquals(im,  complex.sin().getIm(),0.00001);
    }

    @Test
    public void sinNegativeRealPositiveImaginary() {
        Complex complex = new Complex(-38, 62);
        double re = Math.sin(complex.getRe()) * Math.cosh(complex.getIm());
        double im =  Math.cos(complex.getRe()) * Math.sinh(complex.getIm());

        assertEquals(re, complex.sin().getRe(), 0.00001);
        assertEquals(im,  complex.sin().getIm(),0.00001);
    }

    @Test
    public void cos() {
        Complex complex = new Complex(4, -17);
        double re = Math.cos(complex.getRe()) * Math.cosh(complex.getIm());
        double im =  -Math.sin(complex.getRe()) * Math.sinh(complex.getIm());

        assertEquals(re, complex.cos().getRe(), 0.00001);
        assertEquals(im,  complex.cos().getIm(),0.00001);
    }

    @Test
    public void tan() {
        Complex complex = new Complex(Math.PI/2, 0);
        Complex result = complex.sin().divides(complex.cos());

        assertEquals(result.getRe(), complex.tan().getRe(), 0.00001);
        assertEquals(result.getIm(), complex.tan().getIm(), 0.00001);

    }
}
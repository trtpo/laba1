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

        assertEquals("Error in reciprocal null complex object in the real part.",
                re, complex.reciprocal().getRe(), 0.00001);
        assertEquals("Error in reciprocal null complex object in the imaginary part.",
                im, complex.reciprocal().getIm(),0.00001);
    }

    @Test
    public void reciprocalNegRealComplex() {
        Complex complex = new Complex(-10, 5);
        double difOfSq = complex.getRe()*complex.getRe() + complex.getIm()*complex.getIm();
        double re =  complex.getRe() / difOfSq;
        double im = - complex.getIm() / difOfSq;

        assertEquals("Error in reciprocal(negative real, positive imaginary) complex object in the real part.",
                re, complex.reciprocal().getRe(), 0.00001);
        assertEquals("Error in reciprocal(negative real, positive imaginary) complex object in the imaginary part.",
                im, complex.reciprocal().getIm(),0.00001);
    }

    @Test
    public void reciprocalNegImComplex() {
        Complex complex = new Complex(4, -7);
        double difOfSq = complex.getRe()*complex.getRe() + complex.getIm()*complex.getIm();
        double re =  complex.getRe() / difOfSq;
        double im = - complex.getIm() / difOfSq;

        assertEquals("Error in reciprocal(positive real, negative imaginary) complex object in the real part.",
                re, complex.reciprocal().getRe(), 0.00001);
        assertEquals("Error in reciprocal(positive real, negative imaginary) complex object in the imaginary part.",
                im, complex.reciprocal().getIm(),0.00001);
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
        Complex complexResB = new Complex(-1, 1);
        Complex result = complexResA.divides(complexResB);
        assertEquals("Error in the real part of Complex object during divides.",
                re, result.getRe(), 0.00001);
        assertEquals("Error in the imaginary part of Complex object during divides.",
                im,  result.getIm(),0.00001);
    }

    @Test
    public void sinPositiveRealNegativeImaginary() {
        Complex complex = new Complex(4, -17);
        double re = Math.sin(complex.getRe()) * Math.cosh(complex.getIm());
        double im =  Math.cos(complex.getRe()) * Math.sinh(complex.getIm());

        assertEquals("Error in the real part of Complex object during sine (positive real, negative imaginary).",
                re, complex.sin().getRe(), 0.00001);
        assertEquals("Error in the imaginary part of Complex object during sine (positive real, negative imaginary).",
                im,  complex.sin().getIm(),0.00001);
    }

    @Test
    public void sinNegativeRealPositiveImaginary() {
        Complex complex = new Complex(-38, 62);
        double re = Math.sin(complex.getRe()) * Math.cosh(complex.getIm());
        double im =  Math.cos(complex.getRe()) * Math.sinh(complex.getIm());

        assertEquals("Error in the real part of Complex object during sine (negative real, positive imaginary).",
                re, complex.sin().getRe(), 0.00001);
        assertEquals("Error in the imaginary part of Complex object during sine (negative real, positive imaginary).",
                im,  complex.sin().getIm(),0.00001);
    }

    @Test
    public void cos() {
        Complex complex = new Complex(4, -17);
        double re = Math.cos(complex.getRe()) * Math.cosh(complex.getIm());
        double im =  -Math.sin(complex.getRe()) * Math.sinh(complex.getIm());

        assertEquals("Error in the real part of Complex object during cosine.",
                re, complex.cos().getRe(), 0.00001);
        assertEquals("Error in the imaginary part of Complex object during cosine.",
                im,  complex.cos().getIm(),0.00001);
    }

    @Test
    public void tan() {
        Complex complex = new Complex(Math.PI/2, 0);
        Complex result = complex.sin().divides(complex.cos());

        assertEquals("Error in the real part of Complex object during tangent.",
                result.getRe(), complex.tan().getRe(), 0.00001);
        assertEquals("Error in the imaginary part of Complex object during tangent.",
                result.getIm(), complex.tan().getIm(), 0.00001);

    }
}
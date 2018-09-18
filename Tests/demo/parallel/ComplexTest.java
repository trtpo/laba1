package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void minus() {
        Complex a = new Complex(45,60);
        Complex b = new Complex(3,13);

        Complex result = a.minus(b);

        assertEquals(42.0, result.getReal(), 0.1);
        assertEquals(47.0, result.getImage(), 0.1);
    }

    @org.junit.Test
    public void minus_zero() {
        Complex a = new Complex(45,60);
        Complex b = new Complex(0,0);

        Complex result = a.minus(b);

        assertEquals(45.0, result.getReal(), 0.1);
        assertEquals(60.0, result.getImage(), 0.1);
    }

    @org.junit.Test
    public void minus_negativ() {
        Complex a = new Complex(45,60);
        Complex b = new Complex(-3,-13);

        Complex result = a.minus(b);

        assertEquals(48.0, result.getReal(), 0.1);
        assertEquals(73.0, result.getImage(), 0.1);
    }

    @org.junit.Test
    public void divide() {
        Complex a = new Complex(45,13);
        Complex b = new Complex(45,13);

        Complex result = a.divide(b);

        assertEquals(1.0, result.getReal(), 0.1);
        assertEquals(0.0, result.getImage(), 0.1);
    }
    @org.junit.Test
    public void divide_zero() {
        Complex a = new Complex(0,13);
        Complex b = new Complex(45,0);

        Complex result = a.divide(b);

        assertEquals(0.0, result.getReal(), 0.1);
        assertEquals(0.3, result.getImage(), 0.1);
    }

    @org.junit.Test
    public void divide_negativ() {
        Complex a = new Complex(45,13);
        Complex b = new Complex(-60,-2);

        Complex result = a.divide(b);

        assertEquals(-0.8, result.getReal(), 0.1);
        assertEquals(-0.2, result.getImage(), 0.1);
    }

    @org.junit.Test
    public void divide_infinity() {
        Complex a = new Complex(Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY);
        Complex b = new Complex(Double.NEGATIVE_INFINITY,13);

        Complex result = a.divide(b);

        assertEquals(Double.NaN, result.getReal(), 0.1);
        assertEquals(Double.NaN, result.getImage(), 0.1);
    }
}
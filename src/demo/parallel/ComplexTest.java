package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void divide() {
        Complex a = new Complex(12, -3);
        Complex b = new Complex(3, 3);
        a.divide(b);
        assertTrue("Check divide real part",1.5 == a.getReal());
        assertTrue("Check divide image part",-2.5 == a.getImage());
    }

    @org.junit.Test
    public void sin() {
        Complex a = new Complex(3, -5);
        double realExpected = Math.sin(a.getReal()) * Math.cosh(a.getImage());
        double imagExpected = Math.cos(a.getReal()) * Math.sinh(a.getImage());
        Complex sinus = a.sin();

        assertEquals("Check sinus real part", realExpected, sinus.getReal(), 0);
        assertEquals("Check sinus image part", imagExpected, sinus.getImage(), 0);
    }

    @org.junit.Test
    public void cos() {
        Complex a = new Complex(3, -5);
        double realExpected = Math.cos(a.getReal()) * Math.cosh(a.getImage());
        double imagExpected = -Math.sin(a.getReal()) * Math.sinh(a.getImage());
        Complex cosinus = a.cos();

        assertEquals("Check cosinus real part", realExpected, cosinus.getReal(), 0);
        assertEquals("Check cosinus image part", imagExpected, cosinus.getImage(), 0);
    }
}
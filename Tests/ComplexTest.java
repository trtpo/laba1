package Tests;

import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    static private Complex a = null;
    static private Complex b = null;
    static private final double epsilon = 0.01;

    @org.junit.Before
    public void setUp() {
        a = new Complex(1, 1);
        b = new Complex(2, 2);
    }

    @org.junit.Test
    public void modATest() {
        double modA = a.mod();
        assertEquals(1.4142136, modA, epsilon);
    }

    @org.junit.Test
    public void conjugateATest() {
        Complex conjugateAResult = a.conjugate();
        assertEquals(conjugateAResult.getIm(), -1.0, epsilon);
        assertEquals(conjugateAResult.getRe(), 1.0, epsilon);
    }

    @org.junit.Test
    public void divideAByB() {
        Complex resultADividedByB = Complex.divide(a, b);
        assertEquals(resultADividedByB.getIm(), 0.0, epsilon);
        assertEquals(resultADividedByB.getRe(), 0.5, epsilon);
    }

    @org.junit.Test
    public void sinOfA() {
        Complex sinA = Complex.sin(a);
        assertEquals(sinA.getIm(), 0.63496391, epsilon);
        assertEquals(sinA.getRe(), 1.29845758, epsilon);

    }

    @org.junit.Test
    public void cosOfA() {
        Complex cosA = Complex.cos(a);
        assertEquals(cosA.getIm(), -0.98889771, epsilon);
        assertEquals(cosA.getRe(), 0.83373003, epsilon);
    }

    @org.junit.Test
    public void tanOfA() {
        Complex tanA = Complex.tan(a);
        assertEquals(tanA.getIm(), 1.08392333, epsilon);
        assertEquals(tanA.getRe(), 0.27175259, epsilon);
    }
}
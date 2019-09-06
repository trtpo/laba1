package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    static private Complex a = null;
    static private Complex b = null;
    static private final double epsilon = 0.01;

    @org.junit.Before
    public void setUp() throws Exception {
        a = new Complex(1,1);
        b = new Complex(2,2);
    }

    @org.junit.Test
    public void modATest() {
        System.out.println(a.mod());
        double modA = a.mod();
        assertTrue(FloatingComparator.checkIfEquals(1.4142136,modA,epsilon));
    }

    @org.junit.Test
    public void conjugateATest() {
        Complex conjugateAResult = a.conjugate();
        assertTrue(FloatingComparator.checkIfEquals(conjugateAResult.getIm(),-1.0,epsilon));
        assertTrue(FloatingComparator.checkIfEquals(conjugateAResult.getRe(),1.0,epsilon));
    }

    @org.junit.Test
    public void divideAByB() {
        Complex resultADividedByB = Complex.divide(a,b);
        assertTrue(FloatingComparator.checkIfEquals(resultADividedByB.getIm(),0.0,epsilon));
        assertTrue(FloatingComparator.checkIfEquals(resultADividedByB.getRe(),0.5,epsilon));
    }

    @org.junit.Test
    public void sinOfA() {
        Complex sinA = Complex.sin(a);
        assertTrue(FloatingComparator.checkIfEquals(sinA.getIm(),0.63496391,epsilon));
        assertTrue(FloatingComparator.checkIfEquals(sinA.getRe(),1.29845758,epsilon));

    }

    @org.junit.Test
    public void cosOfA() {
        Complex cosA = Complex.cos(a);
        assertTrue(FloatingComparator.checkIfEquals(cosA.getIm(),-0.98889771,epsilon));
        assertTrue(FloatingComparator.checkIfEquals(cosA.getRe(),0.83373003,epsilon));
    }

    @org.junit.Test
    public void tanOfA() {
        Complex tanA = Complex.tan(a);
        assertTrue(FloatingComparator.checkIfEquals(tanA.getIm(),1.08392333,epsilon));
        assertTrue(FloatingComparator.checkIfEquals(tanA.getRe(),0.27175259,epsilon));
    }
}
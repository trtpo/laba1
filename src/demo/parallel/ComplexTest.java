package demo.parallel;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    Complex c = new Complex(5, 6);
    Complex c1 = new Complex(6,7);

    @org.junit.Test
    public void sin() {
        Complex actual = c.sin();
        assertEquals(actual.getRe(), -193.430, 0.01);
        assertEquals(actual.getIm(), 57.218, 0.01);
    }

    @org.junit.Test
    public void cos() {
        Complex actual = c.cos();
        assertEquals(actual.getRe(), 57.219, 0.01);
        assertEquals(actual.getIm(), 193.428, 0.01);
    }

    @org.junit.Test
    public void divides() {
        Complex actual = c.divides(c1);
        assertEquals(actual.getRe(),0.847,0.01);
        assertEquals(actual.getIm(),0.018,0.01);
    }

    @org.junit.Test
    public void reciprocal() {
        Complex actual = c.reciprocal();
        assertEquals(actual.getRe(),0.082,0.01);
        assertEquals(actual.getIm(),-0.098,0.01);
    }

    @org.junit.Test
    public void tan() {
        Complex actual = c.tan();
        assertEquals(actual.getRe(),-6.685231390246571E-6,0.01);
        assertEquals(actual.getIm(),1,0.01);
    }
}
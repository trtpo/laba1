package demo.parallel;


import static org.junit.jupiter.api.Assertions.*;
class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex a = new Complex(9,3);
        Complex b = new Complex(2,2);
        Complex sum = new Complex(11,5);
        a =a.plus(b);
        assertEquals(a.getIm(),sum.getIm());
        assertEquals(a.getRe(),sum.getRe());
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(9,3);
        Complex b = new Complex(2,2);
        Complex sum = new Complex(7,1);
        a =a.minus(b);
        assertEquals(a.getIm(),sum.getIm());
        assertEquals(a.getRe(),sum.getRe());
    }

    @org.junit.jupiter.api.Test
    void cos() {
        Complex a = new Complex(2.7, 6);
        Complex b = a.cos();
        assertTrue(b.isEqual(new Complex(Math.cos(a.getRe()) * Math.cosh(a.getIm()), -Math.sin(a.getRe()) * Math.sinh(a.getIm()))));    }




}
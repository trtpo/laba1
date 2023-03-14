package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {
    @org.junit.Test
    public void minus() {
        Complex a = new Complex(200, 44);
        Complex b = new Complex(100,12);
        a.minus(b);
        assertTrue(a.getRe() == 100);
        assertTrue(a.getIm() == 32);
    }

    @org.junit.Test
    public void sin() {
        Complex a = new Complex(4, 4);
        a.sin();
        assertTrue(a.getRe() == -20.66693875274718);
        assertTrue(a.getIm() == -6.661336323490977);
    }
}
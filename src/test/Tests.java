package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void testSub(){
        Complex a = new Complex(2,2);
        Complex b = new Complex(5,4);
        a.sub(b);
        assertEquals(-3,a.getRe());
        assertEquals(-2,a.getIm());
    }

    @Test
    public void testDivide(){
        Complex a = new Complex(-2,1);
        Complex b = new Complex(1,-1);
        a.divide(b);
        assertEquals(-1.5,a.getRe());
        assertEquals(-0.5,a.getIm());
    }
}
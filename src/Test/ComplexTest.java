package Test;

import demo.parallel.Complex;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void CheckSqrtDegreeN() {
        Complex value = new Complex(3,2);

        LinkedList<Complex> list = value.sqrtDegreeN(3);
        Complex degreeFirst = new Complex(1.504,0.298);
        Complex degreeSecond = new Complex(1.492, 0.353);
        Complex degreeThird = new Complex(1.478 ,0.407);

        assertEquals(Math.round(degreeFirst.abs()*1000)/1000,Math.round(list.get(0).abs()*1000)/1000,0);
        assertEquals(Math.round(degreeSecond.abs()*1000)/1000,Math.round(list.get(1).abs()*1000)/1000,0);
        assertEquals(Math.round(degreeThird.abs()*1000)/1000,Math.round(list.get(2).abs()*1000)/1000,0);
    }

    @org.junit.Test
    public void CheckSqrtDegreeNull() {
        Complex value = new Complex(5, 2);
        LinkedList<Complex> list = value.sqrtDegreeN(0);
        assertEquals(0,list.size(),0);
    }
}
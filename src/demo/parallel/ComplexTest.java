package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void minus() {
        Complex a = new Complex(1,1);
        Complex b = new Complex( 5,5);
        double real =1;
        double imag = 1;

        for (double i=0; i< 500; i++);
        assertNotEquals(a.lengthSQ(), Math.sqrt((real*real+imag*imag)));
        a.minus(b);
        real -=5;
        imag -=5;
    }

    @org.junit.Test
    public void devide() {
        Complex a =new Complex(1,0);
        Complex b = new Complex(0,1);
        assertNotEquals(1, a.devide(b).lengthSQ());
    }
}
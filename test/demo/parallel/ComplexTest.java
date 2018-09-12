package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void minus() {
        Complex c1=new Complex(11,6);
        Complex c2=new Complex(5,4);
        assertEquals(new Complex(6,2),c1.minus(c2));
    }

    @org.junit.Test
    public void divide() {
        Complex c1=new Complex(4,3);
        Complex c2=new Complex(2,1);
        assertEquals(new Complex(2.2,0.4),c1.divide(c2));
        assertEquals(new Complex(0,0),c1.divide(new Complex(0,0)));
    }
}
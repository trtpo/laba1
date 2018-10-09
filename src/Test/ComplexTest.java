package Test;

import demo.parallel.Complex;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void minus() throws Exception {
        Complex a = new Complex(2, 5);
        Complex c = new Complex(6, 9);
        assertEquals( "Test minus() is failed", a.minus(new Complex(1, 3)), new Complex(1,2));
        assertEquals( "Test minus() is failed", c.minus(new Complex(3, 3)), new Complex(3,6));
    }

    @org.junit.Test
    public void sin() throws Exception {
        Complex a = new Complex(11, 0);
        Complex b = new Complex(1, 0);
        assertEquals("Test sin() is failed", a.sin(), new Complex(-0.9999902065507035,0));
        assertEquals("Test sin() is failed", b.sin(), new Complex(0.8414709848078965,0));
    }

    @org.junit.Test
    public void cos() throws Exception {
        Complex a = new Complex(2, 1);
        Complex b = new Complex(3,3);
        assertEquals("Test cos() is failed", a.cos(), new Complex(-0.6421481247155201,-1.0686074213827783));
        assertEquals("Test cos() is failed", b.cos(), new Complex(-9.966909834129453,-1.413722590498827));
    }

    @org.junit.Test
    public void divide() throws Exception {
        Complex a = new Complex(3,4);
        Complex b = new Complex(2,1);
        Complex c = new Complex(6,2);
        Complex d = new Complex(4,2);
        assertEquals( "Test divide() is failed", a.divide(b), new Complex(2,1));
        assertEquals( "Test divide() is failed", c.divide(d), new Complex(1.4,-0.2));
    }
}
package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void divides() throws Exception {
        Complex a = new Complex(4,4);
        Complex b = new Complex(2,2);
        assertEquals("Wrong devide result", a.divides(b), new Complex(2,2));

        a = new Complex(4,4);
        b = new Complex(4,4);
        assertEquals("Wrong devide result", a.divides(b), new Complex(1,1));
    }


    @Test
    public void subtract() throws Exception {
        Complex a = new Complex(4,4);
        Complex b = new Complex(2,2);
        assertEquals("Wrong subtract result (1)", a.subtract(b), new Complex(2,2));

        a = new Complex(4,4);
        b = new Complex(3,4);
        assertEquals("Wrong subtract result (2)", a.subtract(b), new Complex(1,0));
    }

    @Test
    public void sin() throws Exception {
        Complex a = new Complex(11, 0);
        assertEquals("Wrong sin result (1)", a.sin(), new Complex(-0.9999902065507035,0));

        a = new Complex(1, 0);
        assertEquals("Wrong sin result (2)", a.sin(), new Complex(0.8414709848078965,0));
    }
}
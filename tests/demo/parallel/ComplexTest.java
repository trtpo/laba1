package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void divides() throws Exception {
        Complex a = new Complex(4,4);
        Complex b = new Complex(2,2);

        assertEquals("Wrong devide result", a.divides(b), new Complex(2,2));
    }

    @Test
    public void subtract() throws Exception {
        Complex a = new Complex(4,4);
        Complex b = new Complex(2,2);

        assertEquals("Wrong subtract result", a.subtract(b), new Complex(2,2));
    }

    @Test
    public void sin() throws Exception {
        Complex a = new Complex(11, 0);

        assertEquals("Wrong subtract result", a.sin(), new Complex(-0.9999902065507035,0));
    }

}
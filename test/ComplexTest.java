import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex b, c, tmp;
    private double p1, p2, d;
    boolean flag;
    @Before
    public void setUp() throws Exception {
        b = new Complex(10, 10);
        c = new Complex(50, 50);
        // b / c
        d = c.getReal() * c.getReal() + c.getImage() * c.getImage();
        p1 = (b.getReal() * c.getReal() + b.getImage() * c.getImage()) / d;
        p2 = (b.getImage() * c.getReal() - b.getReal() * c.getImage()) / d;
    }

    @Test
    public void minus() throws Exception {
        tmp = new Complex(c.getReal() - b.getReal(), c.getImage() - b.getImage());
        c.minus(b);
        assertEquals("Error in minus method, 80'th string in Complex file", c.getReal(), tmp.getReal(), 0);
        assertEquals("Error in minus method, 81'st string in Complex file", c.getImage(), tmp.getImage(), 0);
    }

    @Test
    public void divide() throws Exception {
        tmp = new Complex(p1, p2);
        b.divide(c);
        assertEquals("Error in minus method, 107'th string in Complex file", b.getReal(), tmp.getReal(), 0);
        assertEquals("Error in minus method, 108'th string in Complex file", b.getImage(), tmp.getImage(), 0);
    }
}
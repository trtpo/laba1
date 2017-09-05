import demo.parallel.Complex;

import static org.junit.Assert.*;

public class Tester {

    @org.junit.Test
    public void minus() throws Exception {
        Complex foo = new Complex(17, -35);
        assertTrue(new Complex(2, -40).equals(foo.minus(new Complex(15, 5))));
    }

    @org.junit.Test
    public void divides() throws Exception {
        Complex bar = new Complex(2,0);
        assertTrue(new Complex(0.4, -0.8).equals(bar.divides(new Complex(1,2))));
    }
}

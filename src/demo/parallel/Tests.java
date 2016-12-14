package demo.parallel;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

    @Test
    public void testDiv() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(3, 2);

        a.times(b);

        double c = a.lengthSQ();

        assertTrue("Divide assert Failed! Expected 1.0, Got " + c, c >= 1.0 && c <= 1.000000000000001);
    }

}
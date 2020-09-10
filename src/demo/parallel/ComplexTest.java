package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void testSubtract() {
        assertEquals(new Complex(2,-2).lengthSQ(), new Complex(3,2).subtract(new Complex(1,4)).lengthSQ(), 0.0f);
        assertEquals(new Complex(-13,2).lengthSQ(), new Complex(-8,-8).subtract(new Complex(5,-10)).lengthSQ(), 0.0f);
        assertEquals(new Complex(-9,4).lengthSQ(), new Complex(5,12).subtract(new Complex(14,8)).lengthSQ(), 0.0f);
    }

    @Test
    public void testDivide() {
        assertEquals(new Complex(3.8,-1.8).lengthSQ(), new Complex(5.6,2).divide(new Complex(1,1)).lengthSQ(), 0.0001f);
        assertEquals(new Complex(0.32,-0.96).lengthSQ(), new Complex(-8,-8).divide(new Complex(5,-10)).lengthSQ(), 0.0001f);
        assertEquals(new Complex(2.4,6.2).lengthSQ(), new Complex(1,21).divide(new Complex(3,1)).lengthSQ(), 0.0001f);
    }
}

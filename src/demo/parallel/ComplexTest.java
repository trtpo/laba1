package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by archer on 07.09.16.
 */
public class ComplexTest {
    final double epsilon = 0.0000001;
    @org.junit.Test
    public void plusUnmod() throws Exception {
        //1,1 + 2,2 = 3,3
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);
        Complex c ;
        c = a.plusUnmod(b);

        assertEquals("a.re changed", a.getRe(), 1, epsilon);
        assertEquals("a.im changed", a.getImag(), 1, epsilon);
        assertEquals("b.re changed", b.getRe(), 2, epsilon);
        assertEquals("b.im changed", b.getImag(), 2, epsilon);

        assertEquals("c.re incorrect", c.getRe(), 3, epsilon);
        assertEquals("c.im incorrect", c.getImag(), 3, epsilon);
    }

    @org.junit.Test
    public void sqr() throws Exception {
        //sqr(2+3i) = -5 + 12i
        Complex a = new Complex(2, 3);
        a.sqr();
        assertEquals(a.getRe(), -5, epsilon);
        assertEquals(a.getImag(), 12, epsilon);
    }

}
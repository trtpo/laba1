package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class UnitTest {

    Complex a;

    @Before
    public void setUp() {
        a = new Complex(1, 1);
    }

    @Test
    public void divisionTest() {
        assertTrue(a.divide(a).equals(new Complex(1, 0)));
    }

    @Test
    public void minusTest() {
        assertTrue(a.minus(a).equals(new Complex(0, 0)));
    }

    @Test
    public void conjugateTest() {
        assertTrue(a.conjugate().equals(new Complex(a.getRe(), -a.getIm())));
    }

    @Test
    public void reciprocalTest() {
        assertTrue(a.reciprocal().times(a).equals(new Complex(1, 0)));
    }

}

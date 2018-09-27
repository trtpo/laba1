package demo.parallel;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {

    private static final double DELTA = 1e-15;

    @Test
    public void minusWithPositiveNumbers() {
        Complex a = new Complex(7,1);
        Complex b = new Complex(4,8);
        a.minus(b);
        assertTrue(a.equals(new Complex(3, -7)));
    }

    @Test
    public void minusWithNegativeNumbers() {
        Complex a = new Complex(-1,-6);
        Complex b = new Complex(-2,-3);
        a.minus(b);
        assertTrue(a.equals(new Complex(1, -3)));
    }

    @Test
    public void divisionWithNegativeAndPositiveNumbers() {
        Complex a = new Complex(1,-1);
        Complex b = new Complex(-1,1);
        a.divide(b);
        assertTrue(a.equals(new Complex(-1, 0)));
    }

    @Test
    public void divisionByZero() {
        Complex a = new Complex(1,-1);
        Complex b = new Complex(0,0);
        Complex c = a.divide(b);
        assertTrue(c.equals(new Complex(0, 0)));
    }

    @Test
    public void sinOfZero() {
        Complex a = new Complex(0, 0);
        assertTrue(a.sin().equals(new Complex(0,0)));
    }

    @Test
    public void sinOfComplexNumber() {
        Complex a = new Complex(-1, 1);
        assertEquals(a.cos().Im(), 0.9888977057628651, DELTA);
        assertEquals(a.cos().Re(), 0.8337300251311492, DELTA);
    }

    @Test
    public void cosOfZero() {
        Complex a = new Complex(0, 0);
        assertTrue(a.cos().equals(new Complex(1,0)));
    }

    @Test
    public void cosOfComplexNumber() {
        Complex a = new Complex(1, -1);
        assertEquals(a.cos().Im(), 0.9888977057628651, DELTA);
        assertEquals(a.cos().Re(), 0.8337300251311492, DELTA);
    }

    @Test
    public void getReTest() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(5,5);
        Complex c = new Complex(-5, 0);
        assertEquals(a.Re(), 0, DELTA);
        assertEquals(b.Re(), 5, DELTA);
        assertEquals(c.Re(), -5, DELTA);
    }
    @Test
    public void getImTest() {
        Complex a = new Complex(0,0);
        Complex b = new Complex(5, 5);
        Complex c = new Complex(5, -5);
        assertEquals(a.Im(), 0, DELTA);
        assertEquals(b.Im(), 5, DELTA);
        assertEquals(c.Im(), -5, DELTA);
    }

    @Test
    public void conjugate() {
        Complex a = new Complex(4, 4);
        assertEquals(
                "Conjugate operation test. Wrong conjugate result. Image part is wrong.",
                -4.0, a.conjugate().Im(),
                DELTA
        );
    }

    @Test
    public void reciprocal() {
        Complex a = new Complex(4, 4);
        assertEquals(
                "Reciprocal operation test. Wrong result. Image part is wrong.",
                -0.125, a.reciprocal().Im(),
                DELTA
        );
        assertEquals(
                "Reciprocal operation test. Wrong result. Real part is wrong.",
                0.125, a.reciprocal().Re(),
                DELTA
        );
    }

    @Test
    public void exp() {
        Complex a = new Complex(9, -11);
        assertEquals(
                "Exp operation test. Wrong exp result. Image part is wrong.",
                8103.0045704337945, a.exp().Im(),
                DELTA
        );
        assertEquals(
                "Exp operation test. Wrong exp result. Real part is wrong.",
                35.86180223527703, a.exp().Re(),
                DELTA
        );
    }

    @Test
    public void expOfZero() {
        Complex a = new Complex(0, 0);
        assertEquals(
                "expOfZero operation test. Wrong result. Image part is wrong.",
                0.0, a.exp().Im(),
                DELTA
        );
        assertEquals(
                "expOfZero operation test. Wrong result. Real part is wrong.",
                1.0, a.exp().Re(),
                DELTA
        );
    }

    @Test
    public void scale() {
        Complex a = new Complex(4,-1);
        assertEquals(
                "Scale operation test. Wrong scale result. Image part is wrong.",
                -10.0, a.scale(10).Im(),
                DELTA
        );
        assertEquals(
                "Scale operation test. Wrong scale result. Real part is wrong.",
                40.0, a.scale(10).Re(),
                DELTA
        );
    }

}

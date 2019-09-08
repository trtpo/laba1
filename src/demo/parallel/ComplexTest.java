package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void sin() {
        Complex a = new Complex(7,2);
        Complex resultSin = Complex.sin(a);

        assertEquals(resultSin.getRe(),2.471712,0.01);
        assertEquals(resultSin.getIm(),2.734298,0.01);
    }

    @Test
    public void minus() {
        Complex a = new Complex(5,2);
        Complex b = new Complex(3,1);
        Complex resultMinus = a.minus(b);

        assertEquals(resultMinus.getRe(),2,0.01);
        assertEquals(resultMinus.getIm(),1,0.01);
    }

    @Test
    public void scale() {
        Complex a = new Complex(2,4);
        Double scaleCoefficient = 2.0;
        Complex resultScale = a.scale(scaleCoefficient);

        assertEquals(resultScale.getRe(),4,0.01);
        assertEquals(resultScale.getIm(),8,0.01);
    }
}
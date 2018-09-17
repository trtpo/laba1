package demo.parallel;

import org.junit.Test;

import java.util.Random;
import java.lang.Math;

import static org.junit.Assert.*;

public class ComplexTest {

    Random random = new Random();

    @Test
    public void minus() {
        int maxBorder = 100;

        double realA = random.nextDouble() * maxBorder * 2 - maxBorder;
        double imagA = random.nextDouble() * maxBorder * 2 - maxBorder;

        double realB = random.nextDouble() * maxBorder * 2 - maxBorder;
        double imagB = random.nextDouble() * maxBorder * 2 - maxBorder;

        Complex a = new Complex(realA, imagA);
        Complex b = new Complex(realB, imagB);
        a.minus(b);

        assertEquals(realA - realB, a.getRe(), 0);
        assertEquals(imagA - imagB, a.getIm(), 0);
    }

    @Test
    public void division() {
        int maxBorder = 100;

        double realA = random.nextDouble() * maxBorder * 2 - maxBorder;
        double imagA = random.nextDouble() * maxBorder * 2 - maxBorder;

        double realB = random.nextDouble() * maxBorder * 2 - maxBorder;
        double imagB = random.nextDouble() * maxBorder * 2 - maxBorder;

        double realExcepted = (realA * realB + imagA * imagB) / (Math.pow(realB, 2) + Math.pow(imagB, 2));
        double imagExcepted = (imagA * realB - realA * imagB) / (Math.pow(realB, 2) + Math.pow(imagB, 2));

        Complex a = new Complex(realA, imagA);
        Complex b = new Complex(realB, imagB);
        a.division(b);

        assertEquals(realExcepted, a.getRe(), 0);
        assertEquals(imagExcepted, a.getIm(), 0);
    }

    @Test
    public void divisionByZero() {
        int maxBorder = 100;

        double realA = random.nextDouble() * maxBorder * 2 - maxBorder;
        double imagA = random.nextDouble() * maxBorder * 2 - maxBorder;

        boolean error = false;

        Complex a = new Complex(realA, imagA);
        Complex b = new Complex(0, 0);
        a.division(b);

        if(Double.isNaN(a.getRe()) || Double.isNaN(a.getIm())) {
            error = true;
        }

        assertFalse(error);
    }

    @Test
    public void sin() {
        int maxBorder = 100;

        double realA = random.nextDouble() * maxBorder * 2 - maxBorder;
        double imagA = random.nextDouble() * maxBorder * 2 - maxBorder;

        double realExcepted = Math.sin(realA) * Math.cosh(imagA);
        double imagExcepted = Math.cos(realA) * Math.sinh(imagA);

        Complex a = new Complex(realA, imagA);
        Complex b = a.sin();

        assertEquals(realExcepted, b.getRe(), 0);
        assertEquals(imagExcepted, b.getIm(), 0);
    }

    @Test
    public void cos() {
        int maxBorder = 100;

        double realA = random.nextDouble() * maxBorder * 2 - maxBorder;
        double imagA = random.nextDouble() * maxBorder * 2 - maxBorder;

        double realExcepted = Math.cos(realA) * Math.cosh(imagA);
        double imagExcepted = -Math.sin(realA) * Math.sinh(imagA);

        Complex a = new Complex(realA, imagA);
        Complex b = a.cos();

        assertEquals(realExcepted, b.getRe(), 0);
        assertEquals(imagExcepted, b.getIm(), 0);
    }
}
package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    private static final double DELTA = 1e-15;

    @Test
    public void abs() {
        Complex a = new Complex(5, 6);

        double expected = a.abs();
        double actual = 7.810249675906654;

        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void reciprocal() {
        Complex a = new Complex(5, 6);

        Complex expected = a.reciprocal();
        Complex actual = new Complex(0.08196721311475409,-0.09836065573770492);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sin() {
        Complex a = new Complex(5, 6);

        Complex expected = a.sin();
        Complex actual = new Complex(-193.43002005693958, 57.21839505634109);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cos() {
        Complex a = new Complex(5,6);

        Complex expected = a.cos();
        Complex actual = new Complex(57.21909818460074,193.4276431213065);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tan() {
        Complex a = new Complex(5, 6);

        Complex expected = a.tan();
        Complex actual = new Complex(-6.685231390246571*Math.pow(10, -6), 1.0000103108981198);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divides() {
        Complex a = new Complex(10, -9);
        Complex b = new Complex(4, -3);

        Complex expected = a.divides(b);
        Complex actual = new Complex(2.68, -0.24);

        Assert.assertEquals(expected, actual);
    }
}
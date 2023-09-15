package test.parallel;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexOperationsTest {

    @Test
    void subtract() {
        Complex x = new Complex(2, 1);
        Complex y = new Complex(1, 2);
        assertTrue(new Complex(1, -1).equals(x.subtract(y), 0.0), "Expected true, but got false");
        x = new Complex(1, 2);
        y = new Complex(2, 1);
        assertTrue(new Complex(-1, 1).equals(x.subtract(y), 0.0), "Expected true, but got false");
        x = new Complex(0, 0);
        y = new Complex(2, 2);
        assertTrue(new Complex(-2, -2).equals(x.subtract(y), 0.0), "Expected true, but got false");
    }

    @Test
    void divide() {
        Complex x = new Complex(2, 1);
        Complex y = new Complex(1, 2);
        assertTrue(new Complex(0.8, -0.6).equals(x.divide(y), 0.001), "Expected true, but got false");
        x = new Complex(1, 2);
        y = new Complex(2, 1);
        assertTrue(new Complex(0.8, 0.6).equals(x.divide(y), 0.001), "Expected true, but got false");
        x = new Complex(0, 0);
        y = new Complex(2, 2);
        assertTrue(new Complex(0.0, 0.0).equals(x.divide(y), 0.001), "Expected true, but got false");
    }
}
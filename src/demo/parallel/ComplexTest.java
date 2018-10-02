package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

class ComplexTest extends Assert{

    @Test
    void reciprocal() {
        assertTrue("Reciprocal for (1, 1)", new Complex(1, 1).reciprocal().equals(new Complex(0.5, -0.5)));
        assertTrue("Reciprocal for (-2, 2)", new Complex(-2, 2).reciprocal().equals(new Complex(-0.25, -0.25)));
        assertTrue("Reciprocal for (5, -)", new Complex(5, -5).reciprocal().equals(new Complex(0.1, 0.1)));
    }

    @Test
    void divides() {
        Complex test1 = new Complex(-2, 1);
        assertTrue("Testing divide function. Dividing to (1, -1)", test1.divide(new Complex(1, -1)).equals(new Complex(-1.5, -0.5)));
        test1 = new Complex(-2, 1);
        assertTrue("Testing divide function. Dividing to (3, 1)", test1.divide(new Complex(3, 1)).equals(new Complex(-0.5, 0.5)));
        test1 = new Complex(-2, 1);
        assertTrue("Testing divide function. Dividing to (2, 4)", test1.divide(new Complex(2, 4)).equals(new Complex(0, 0.5)));
    }
}
package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    public void subtractTest() {
        Complex a = new Complex(12.3, 4.4);
        Complex b = new Complex(-10.0, 4.2);
        a.minus(b);
    }

    @Test
    public void specialTest() {
        Complex a = new Complex(12.3, 4.4);
        Complex b = new Complex(-10.0, 4.2);
        a.special(b);
    }

    @Test
    public void cubeTest() {
        Complex a = new Complex(3.5, 3.4);
        a.cube();
    }
}
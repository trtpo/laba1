package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    public void subtractTest() {
        Complex a = new Complex(1.1, 2.2);
        Complex b = new Complex(-1.0, 2.2);
        a.minus(b);
        assertEquals(2.1, a.getRealPart(), 0.01);
        assertEquals(0, a.getImaginaryPart(), 0.01);
    }

    @Test
    public void cubeTest() {
        Complex a = new Complex(1.1, 1.2);
        a.cube();
        assertEquals(-3.42, a.getRealPart(), 0.01);
        assertEquals(2.62, a.getImaginaryPart(), 0.01);
    }


}
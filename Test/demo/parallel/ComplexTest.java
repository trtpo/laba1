package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void plus() {
        String errorMessage = "Error in subtraction";

        Complex a = new Complex(4, 5);
        Complex b = new Complex(1, -6);
        a.plus(b);

        assertEquals(errorMessage, 5, a.getRe(), 0.001 );
        assertEquals(errorMessage, -1, a.getIm(), 0.001 );
    }

    @Test
    void times() {
        String errorMessage = "Error in subtraction";

        Complex a = new Complex(1, -2);
        Complex b = new Complex(-2, 3);
        a.times(b);

        assertEquals(errorMessage, 4, a.getRe(), 0.001 );
        assertEquals(errorMessage, 7, a.getIm(), 0.001 );
    }

    @Test
    void minus() {
        String errorMessage = "Error in subtraction";

        Complex a = new Complex(4, 5);
        Complex b = new Complex(-2, 19);
        a.minus(b);

        assertEquals(errorMessage, 6, a.getRe(), 0.001 );
        assertEquals(errorMessage, -14, a.getIm(), 0.001 );
    }

    @Test
    void abs() {
        String errorMessage = "Error in subtraction";

        Complex a = new Complex(4, 3);
        a.abs(a);
        assertEquals(errorMessage, 5, a.getRe(), 0.001 );
        assertEquals(errorMessage, 0, a.getIm(), 0.001 );
    }
}
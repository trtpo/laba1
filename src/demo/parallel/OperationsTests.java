package demo.parallel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsTests {

    @Test
    public void divisionByZeroTest() {
        Complex a = new Complex(55.5, 1.5);
        Complex b = new Complex(0, 0);
        a.divide(b);

        assertEquals(Double.NaN, a.getRealPart(), 0.01);
        assertEquals(Double.NaN, a.getImaginaryPart(), 0.01);
    }

    @Test
    public void cubeTest() {
        Complex a = new Complex(1.1, 1.2);
        a.cube();
        assertEquals(-3.42, a.getRealPart(), 0.01);
        assertEquals(2.62, a.getImaginaryPart(), 0.01);
    }

} 
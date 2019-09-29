package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {
    private Complex a;
    private Complex b;
    @BeforeEach
    public void setup() throws Exception{
        a = new Complex(5, 11);
        b = new Complex(7, 2);
    }

    @Test
    void testDevide() throws Exception{
        a.divide(b);
        assertEquals(1.08, a.getRe(), 0.01,
                "Divide operation isn't correct. You made mistake in real part");
        assertEquals(1.26, a.getIm(), 0.01,
                "Divide operation isn't correct. You made mistake in imaginary part");
    }

    @Test
    void testMinus() {
        a.minus(b);
        assertEquals(-2, a.getRe(), 0.01,
                "Subtract operation isn't correct. You made mistake in real part");
        assertEquals(9, a.getIm(), 0.01,
                "Subtract operation isn't correct. You made mistake in imaginary part");
    }
}
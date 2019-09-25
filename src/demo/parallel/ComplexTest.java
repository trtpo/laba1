package demo.parallel;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @BeforeEach
    public void setup() {
        System.out.println("Test starting ..");
    }

    @Test
    public void minus() {
        Complex a = new Complex(5, 4);
        Complex b = new Complex(3, 2);
        a.minus(b);
        assertEquals(2, a.getRe(), 0.01, "Minus test failed!");
        assertEquals(2, a.getIm(), 0.01, "Minus test failed!");
    }
}

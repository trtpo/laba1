package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexUnitTest {

    @BeforeEach
    public void setup() throws Exception{
        System.out.println("Test starting ..");
    }

    @Test
    public void testMinus() throws Exception{
        Complex a = new Complex(2, 6);
        Complex b = new Complex(1,  9);
        a.sub(b);
        assertEquals(3, a.getRe(), 0.01, "Minus test failed!");
        assertEquals(15, a.getIm(), 0.01, "Minus test failed!");
    }

    @Test
    public void testCos() throws Exception{
        Complex a = new Complex(4, 4);
        a.cos();
        assertEquals(-17.84, a.getRe(), 0.01, "Cos test failed!");
        assertEquals(20.65, a.getIm(), 0.01, "Cos test failed!");
    }
}

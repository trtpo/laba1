package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {
    
    @BeforeEach
    public void setup() throws Exception{
        System.out.println("Test starting ..");
    }
    
    @Test
    public void minus() throws Exception{
        Complex a = new Complex(5, 4);
        Complex b = new Complex(3, 2);
        a.minus(b);
        assertEquals(2, a.getRe(), 0.01, "Minus test failed!");
        assertEquals(2, a.getIm(), 0.01, "Minus test failed!");
    }
    
    @Test
    public void testSubtract() throws Exception{
        Complex a = new Complex(2, -3);
        a.cos();
        assertEquals(-4.18, a.getRe(), 0.01, "Cos test failed!");
        assertEquals(9.10, a.getIm(), 0.01, "Cos test failed!");
    }
}
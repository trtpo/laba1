package Test;

import demo.parallel.Complex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class OperationsTest {
    private Complex a;
    private Complex b;
    @BeforeEach
    public void setup() throws Exception{
        a = new Complex(7, 12);
        b = new Complex(3, 4);
    }
    @Test
    public void testDivide() throws Exception{
        a.divide(b);
        assertEquals(2.76, a.getRe(), 0.01, "Divide operation isn't correct");
        assertEquals(0.32, a.getIm(), 0.01, "Divide operation isn't correct");
    }
    @Test
    public void testSubtract() throws Exception{
        a.subtract(b);
        assertEquals(4, a.getRe(), 0.01, "Subtract operation isn't correct");
        assertEquals(8, a.getIm(), 0.01, "Subtract operation isn't correct");
    }
}

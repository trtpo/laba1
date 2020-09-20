package Tests;

import demo.parallel.Complex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TestsOperations {
    private Complex first;
    private Complex second;
    @BeforeEach
    public void setup() throws Exception{
        first = new Complex(7, 12);
        second = new Complex(3, 4);
    }
    @Test
    public void testDivide() throws Exception{
        first.divide(second);
        assertEquals(2.76, first.getRe(), 0.01, "Divide operation isn't correct");
        assertEquals(0.32, first.getIm(), 0.01, "Divide operation isn't correct");
    }
    @Test
    public void testMinus() throws Exception{
        first.minus(second);
        assertEquals(4, first.getRe(), 0.01, "Minus operation isn't correct");
        assertEquals(8, first.getIm(), 0.01, "Minus operation isn't correct");
    }
}

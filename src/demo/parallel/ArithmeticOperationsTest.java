package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    private Complex a;
    private Complex b;

    @BeforeEach
    public void setup(){
        a = new Complex(2, 4);
        b = new Complex(3 ,2);
    }

    @Test
    public void divideTest(){
        a.divide(b);
        assertEquals(1.07, a.getRe(), 0.01, "Divide operation isn't correct");
        assertEquals(0.61, a.getIm(), 0.01, "Divide operation isn't correct");
    }

    @Test
    public void minusTest(){
        a.minus(b);
        assertEquals(-1, a.getRe(), 0.01, "Subtract operation isn't correct");
        assertEquals(2, a.getIm(), 0.01, "Subtract operation isn't correct");
    }
}

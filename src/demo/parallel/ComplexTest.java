package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void minus(){
        Complex test = new Complex(4,5);
        Complex test2 = new Complex (1,2);
        Complex currentResult = test.minus(test2);

        Complex expectResult = new Complex(3,3);
        assertEquals(currentResult,expectResult);
    }
}
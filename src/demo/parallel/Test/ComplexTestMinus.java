package demo.parallel.Test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestMinus {

    @Test
    public void minus() {
        Complex test1 = new Complex(5,4);
        Complex test2 = new Complex(2,1);
        Complex currentResult = test1.minus(test2);

        Complex expectResult = new Complex(3,3);
        assertEquals(currentResult,expectResult);
    }
}
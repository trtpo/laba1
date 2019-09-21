package test.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void divide() {
        Complex testNum1 = new Complex(2, 5);
        Complex testNum2 = new Complex(1, 1);
        Complex res = new Complex(0, 0);
        res = testNum1.divide(testNum2);
        res.print();
        Complex expectedResult = new Complex(3.5, 1.5);
        assertEquals(res, expectedResult, "Something get wrong, check method");
    }
}
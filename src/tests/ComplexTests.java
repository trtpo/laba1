import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void divide() {
        Complex testNum1 = new Complex(2, 5);
        Complex testNum2 = new Complex(1, 1);
        Complex res = new Complex(0, 0);
        res = testNum1.divide(testNum2);
        res.print();
        Complex expectedResult = new Complex(3.5, 1.5);
        assertEquals(res, expectedResult);
    }

    @Test
    public void ComplexNoDivZero() {
        Complex testNum1 = new Complex(0, 0);
        Complex testNum2 = new Complex(0, 0);
        double divRe = testNum2.getReal();
        double divImg = testNum2.getImg();
        if (divRe == 0 || divImg == 0) {
            System.out.println("Cannot be divided by zero!");
        } else {
            System.out.println("so good");
        }
    }
}
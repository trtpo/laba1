package demo.parallel.Test;

import demo.parallel.Complex;
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
    @org.junit.Test
    public void ComplexNoDivZero() {
        Complex testNum1 = new Complex(0, 0);
        double divRe=testNum1.getReal();
        double divImg=testNum1.getImg();

        if (divRe==0 || divImg==0)
            System.out.println("Cannot be divided by zero!");
        else
            System.out.println("so good");
    }
}
package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

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

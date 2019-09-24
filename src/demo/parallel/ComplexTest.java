package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ComplexTest {


    @Test
    public void ComplexNoDivZero()
    {
        Complex testNum1 = new Complex(0, 0);
        Complex testNum2 = new Complex(0, 0);
        double divRe=testNum2.getReal();
        double divImg=testNum2.getImg();
        if (divRe==0 || divImg==0)
        {
            System.out.println("Cannot be divided by zero!");
        }
        else {System.out.println("so good");}
    }
    @Test
    public void testMinus() throws Exception{

        Complex a = new Complex(2, 6);
        Complex b = new Complex(1, 9);
        a.minus(b);
        assertEquals(3, a.getReal(), 0.01, "Minus test failed!");
        assertEquals(15, a.getImg(), 0.01, "Minus test failed!");

    }

    private void assertEquals(int i, Double real, double v, String s) {
    }
}


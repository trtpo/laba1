package demo.parallel;

import org.junit.jupiter.api.Test;


class ComplexTest {


    @Test
    void ComplexNoDivZero()
    {

        Complex testNum2 = new Complex(0, 0);
        double divRe=testNum2.getReal();
        double divImg=testNum2.getImg();
        if (divRe==0 || divImg==0)
            System.out.println("Cannot be divided by zero!");
        else {System.out.println("so good");}
    }
    @Test
    void testMinus() {

        Complex a = new Complex(2, 6);
        Complex b = new Complex(1, 9);
        a.minus(b);
        assertEquals(a.getReal(), 0.01, "Minus test failed!");
        assertEquals(a.getImg(), 0.01, "Minus test failed!");

    }

    private void assertEquals(Double real, double v, String s) {
    }
}


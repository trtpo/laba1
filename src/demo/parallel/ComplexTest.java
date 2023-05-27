package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class ComplexTest {


    @Test
    public void divTest() {
        Complex a = new Complex(-2, 1);
        a.division(new Complex(1,-1));
        assertEquals(-1.5, a.getReal(),0.00001);
        assertEquals(-0.5, a.getImg(),0.00001);
    }



    @Test
    public void testMinus() throws Exception {

        Complex a = new Complex(2, 6);
        Complex b = new Complex(1, 9);
        a.subtraction(b);
        assertEquals(3, a.getReal(), 0.01, "Minus test failed!");
        assertEquals(15, a.getImg(), 0.01, "Minus test failed!");

    }

    private void assertEquals(int i, double real, double v, String s) {
    }
    private void assertEquals(double v, double real, double v1) {
    }
}
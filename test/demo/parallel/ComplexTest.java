package demo.parallel;

import org.junit.jupiter.api.Test;

import java.io.Console;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void minus() throws Exception {
        double re1 = 5; double im1 = -6;
        double re2 = -3; double im2 = 2;

        Complex complex1 = new Complex(re1, im1);
        Complex complex2 = new Complex(re2, im2);
        complex1 = complex1.minus(complex2);

        assertTrue(complex1.equals(new Complex(8, -8)), "Numbers are not equals");
    }

    @Test
    void division() {

        double re1 = -2; double im1 = 1;
        double re2 = 1; double im2 = -1;
        double re3 = -2; double im3 = 0;
        double re4 = -4; double im4 = 0;

        Complex complex1 = new Complex(re1, im1);
        Complex complex2 = new Complex(re2, im2);
        Complex complex3 = new Complex(re3, im3);
        Complex complex4 = new Complex(re4, im4);

        int flag = 1;
        try {
            complex3.division(complex4);
        }
        catch (IllegalArgumentException ex) {
            flag = 0;
            assertTrue(true);
        }
        Complex complex5 = complex1.division(complex2);

        assertEquals(flag, 0, "Divide by 0 work incorrect");
        assertTrue(complex5.equals(new Complex(-1.5, -0.5)), "Divide (-2+i)/(1-i) get wrong answer");
    }

    @Test
    void equals() throws Exception {
        double re1 = 5; double im1 = -6;
        double re2 = -3; double im2 = 2;
        Complex complex1 = new Complex(re1, im1);
        Complex complex2 = new Complex(re2, im2);
        Complex complex3 = new Complex(re1, im1);

        assertTrue(complex1.equals(complex3), "Equals numbers are not equal");
        assertFalse(complex1.equals(complex2), "Unequals number are equal");
    }

}
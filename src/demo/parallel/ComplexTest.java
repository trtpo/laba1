package demo.parallel;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        Complex z1 = new Complex(1, 2);
        Complex z2 = new Complex(10, 10);
        Complex minus = new Complex(9, 8);
        double re1=z2.Minus(z1).re();
       // double re2=z2.Minus(z1).im();
        double im1=z2.Minus(z1).re();
      //  double im2=z2.Minus(z1).im();
        Assertions.assertEquals(re1, 9);
        Assertions.assertEquals(im1,8);
    }
}
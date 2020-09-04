package demo.parallel;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
       Complex number1 = new Complex(3,3);
        Complex number2 = new Complex(2,4);
        Complex res1 = new Complex(-1,-1);
        Assertions.assertEquals(res1.im, number1.minus(number2).im);
        Assertions.assertEquals(res1.re, number1.minus(number2).re);
    }
}
package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.jupiter.api.Test
    public void sub() {
        Complex complex1 = new Complex(15, 20);
        Complex complex2 = new Complex(5, 10);
        Complex complex3 = new Complex(10, 10);
        complex1.div(complex2);
        Assertions.assertEquals(complex1.getIm(), complex3.getIm()); 
        Assertions.assertEquals(complex1.getRe(), complex3.getRe());
    }

    @org.junit.jupiter.api.Test
    void div() {
        Complex complex1 = new Complex(3, 5);
        Complex complex2 = new Complex(2, 1);
        Complex complex3 = new Complex(-7, 12);
        complex1.div(complex2);
        Assertions.assertEquals(complex1.getIm(), complex3.getIm());
        Assertions.assertEquals(complex1.getRe(), complex3.getRe());
    }

}
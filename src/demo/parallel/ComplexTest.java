package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
                Complex A = new Complex(10, 5);
                Complex B = new Complex(3, 3);
                Complex S = new Complex(13, 8);
                A = A.times(B);
                Assert.assertEquals(A.getRe(), S.getRe(), 0);
                Assert.assertEquals(A.getIm(), S.getIm(),0);

    }

    @org.junit.jupiter.api.Test
    void times() {
                Complex A = new Complex(3,3);
                Complex B = new Complex(4,4);
                A = A.times(B);
                Complex MUL = new Complex(0,24);

                Assert.assertEquals(A.getRe(),MUL.getRe(),0);
                Assert.assertEquals(A.getIm(),MUL.getIm(),0);

    }

    @org.junit.jupiter.api.Test
    void lengthSQ() {
                Complex A = new Complex(3,3);
                double len = 18;
                double ln = A.lengthSQ();
                Assert.assertEquals(ln,len,0);
    }


}
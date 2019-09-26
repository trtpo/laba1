package demo.parallel;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plusIm() {
        double aRe = 2.4;
        double aIm = 3.4;

        double bRe = 10.4;
        double bIm = 40.4;

        double real = aRe * bRe - aIm * bIm;
        double imag = aRe * bIm + aIm * bRe;

        double expectedIm = 132.32;

        Assert.assertEquals(expectedIm, imag, expectedIm - imag);
    }

    @org.junit.jupiter.api.Test
    void plusRe() {
        double aRe = 3.4;
        double aIm = 4.4;

        double bRe = 11.4;
        double bIm = 41.4;

        double real = aRe * bRe - aIm * bIm;
        double imag = aRe * bIm + aIm * bRe;

        double expectedRe = 132.32;

        Assert.assertEquals(expectedRe, real, expectedRe - imag);
    }

    @org.junit.jupiter.api.Test
    void times() {
    }

    @org.junit.jupiter.api.Test
    void division() {
    }

    @org.junit.jupiter.api.Test
    void lengthSQ() {
    }
}
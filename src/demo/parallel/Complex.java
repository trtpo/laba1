/*
 * Copyright (c) 2013, 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package demo.parallel;


import java.util.Objects;

/**
 * A complex number is a number that can be expressed in the form a + b * i, where
 * a and b are real numbers and i is the imaginary unit, which satisfies the
 * equation i ^ 2 = -1. a is the real part and b is the imaginary part of the
 * complex number.
 * <p><i>
 * This source code is provided to illustrate the usage of a given feature
 * or technique and has been deliberately simplified. Additional steps
 * required for a production-quality application, such as security checks,
 * input validation and proper error handling, might not be present in
 * this sample code.</i>
 *
 * @author Alexander Kouznetsov, Tristan Yan
 */
public class Complex {

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.re, re) == 0 && Double.compare(complex.im, im) == 0;
    }

    private double re;   // the real part
    private double im;   // the imaginary part

    /**
     * create a new object with the given real and imaginary parts
     *
     * @param real a complex number real part
     * @param imag a complex number imaginary part
     */
    public Complex(double real, double imag) {
        re = real;
        im = imag;
    }

    /**
     * Add operation.
     *
     * @param b summand
     * @return this Complex object whose value is (this + b)
     */
    public Complex plus(Complex b) {
        re += b.re;
        im += b.im;
        return this;
    }

    /**
     * Multiply operation.
     *
     * @param b multiplier
     * @return this Complex object whose value is this * b
     */
    public Complex times(Complex b) {
        Complex a = this;
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        re = real;
        im = imag;
        return this;
    }

    /**
     * Square of Complex object's length, we're using square of length to
     * eliminate the computation of square root
     *
     * @return square of length
     */
    public double lengthSQ() {
        return re * re + im * im;
    }

    /**
     * Subtraction operation.
     *
     * @param b subtrahend
     * @return this Complex object whose value is (this - b)
     */
    public Complex minus(Complex b) {
        re -= b.re;
        im -= b.im;
        return this;
    }

    /**
     * Division operation.
     *
     * @param b devider
     * @return this Complex object whose value is (this / b)
     */
    public Complex divide(Complex b) {
        Complex a = this;
        double bLengthSQ = b.lengthSQ();
        double real = (a.re * b.re + a.im * b.im) / bLengthSQ;
        double imag = (a.im * b.re - a.re * b.im) / bLengthSQ;
        re = real;
        im = imag;
        return this;
    }

    /**
     * Exponentiation operation.
     *
     * @param power exponent
     * @return this Complex object whose value is (this ^ power)
     */
    public Complex pow(int power) {
        switch (power) {
            case -1:
                Complex a = new Complex(1, 0).divide(this);
                re = a.re;
                im = a.im;
                return this;
            case 0:
                re = 1;
                im = 0;
                return this;
            case 1:
                return this;
        }
        Complex a = this;
        for (int i = 1; i < Math.abs(power); i++) {
            a.times(a);
        }
        if (power < 0) {
            Complex one = new Complex(1, 0);
            a = one.divide(a);
        }
        re = a.re;
        im = a.im;
        return this;
    }
}
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
     * Get a complex number real part
     *
     * @return a complex number real part
     */
    public double getReal() {
        return re;
    }

    /**
     * Get a complex number imaginary part
     *
     * @return a complex number imaginary part
     */
    public double getImage() {
        return im;
    }

    /**
     * Invert complex number values
     *
     * @return this Complex object with negative real and imaginary parts
     */
    public Complex negative() {
        re = -re;
        im = -im;
        return this;
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
     * Check division operation dividing by zero
     *
     * @param b divider
     * @return this Complex object whose value is this/b
     */
    public Complex divide(Complex b) {
        divideCalculate(b);
        if (Double.isNaN(re) || Double.isNaN(im)) throw new ArithmeticException("Dividing by zero!");
        return this;
    }

    /**
     * Division operation
     *
     * @param b divider
     * @return this Complex object whose value is this/b
     */
    private void divideCalculate(Complex b) {
        Complex a = this;
        double div = b.re * b.re + b.im * b.im;
        double real = (a.re * b.re + a.im * b.im) / div;
        double imag = (b.re * a.im - a.re * b.im) / div;
        re = real;
        im = imag;
    }

    /**
     * Exponent operation
     *
     * @return this Complex object whose value is exp(this)
     */
    public Complex exp() {
        double real = Math.exp(re) * Math.cos(im);
        double imag = Math.exp(re) * Math.sin(im);
        re = real;
        im = imag;
        return this;
    }

    /**
     * Sinus operation
     *
     * @return this Complex object whose value is sin(this)
     */
    public Complex sin() {
        double real = Math.sin(re) * Math.cosh(im);
        double imag = Math.cos(re) * Math.sinh(im);
        re = real;
        im = imag;
        return this;
    }

    /**
     * Cosine operation
     *
     * @return this Complex object whose value is cos(this)
     */
    public Complex cos() {
        double real = Math.cos(re) * Math.cosh(im);
        double imag = -Math.sin(re) * Math.sinh(im);
        re = real;
        im = imag;
        return this;
    }

    /**
     * Tangent operation
     *
     * @return this Complex object whose value is tg(this)
     */
    public Complex tg() {
        double real = Math.sin(2 * re) / (Math.cos(2 * re) + Math.cosh(2 * im));
        double imag = Math.sinh(2 * im) / (Math.cos(2 * re) + Math.cosh(2 * im));
        re = real;
        im = imag;
        return this;
    }

    /**
     * Cotangent operation
     *
     * @return this Complex object whose value is ctg(this)
     */
    public Complex ctg() {
        double real = -Math.sin(2 * re) / (Math.cos(2 * re) - Math.cosh(2 * im));
        double imag = Math.sinh(2 * im) / (Math.cos(2 * re) - Math.cosh(2 * im));
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
}
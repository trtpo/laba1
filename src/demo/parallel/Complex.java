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
     * Add operation.
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
     * @param  b multiplier
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
     * Substraction operation.
     * @param b substractor
     * @return this Complex object whose value is (this - b)
     */
    public Complex minus(Complex b) {
        re -= b.re;
        im -= b.im;
        return this;
    }

    /**
     * Division operation.
     * @param  b divider
     * @return this Complex object whose value is this / b
     */
    public Complex divide(Complex b) {
        // Division by 0
        if (b.re == 0 && b.im == 0)
            throw new ArithmeticException();

        double commonDivider = (b.re * b.re + b.im * b.im);
        double real = (this.re * b.re + this.im * b.im) / commonDivider;
        double imag = (this.im * b.re - this.re * b.im) / commonDivider;
        re = real;
        im = imag;
        return this;
    }

    /**
     * Exponent operation.
     * @return this Complex object whose value is exp(this)
     */
    public Complex exp() {
        double power = Math.exp(this.re);
        re = power * Math.cos(this.im);
        im = power * Math.sin(this.im);
        return this;
    }

    /**
     * Natural log operation.
     * @return this Complex object whose value is log(this)
     */
    public Complex log() {
        // Division by 0
        if (re == 0 && im == 0)
            throw new ArithmeticException();
        double real = Math.log(Math.sqrt(this.lengthSQ()));
        double imag = Math.atan2(this.im, this.re);
        re = real;
        im = imag;
        return this;
    }

    /**
     * Sine operation.
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
     * Cosine operation.
     * @return this Complex object whose value is cos(this)
     */
    public Complex cos() {
        double real = Math.cos(re) * Math.cosh(im);
        double imag = -Math.sin(re) * Math.sinh(im);
        re = real;
        im = imag;
        return this;
    }

    public Complex sqrt()
    {
        double abs = Math.sqrt(this.lengthSQ());
        double real = Math.sqrt((abs + re) / 2);
        double imag = Math.sqrt((abs - re) / 2) * Math.signum(im);
        re = real;
        im = imag;
        return this;
    }

    /**
     * Sine^-1 operation.
     * @return this Complex object whose value is asin(this)
     */
    public Complex asin()
    {
        Complex z = new Complex(re, im);
        z = z.times(z);
        z = new Complex(1, 0).minus(z);
        // Computing iz + sqrt(1 - z^2), where z = this
        Complex result = new Complex(-im, re).plus(z.sqrt());
        result = result.log();
        re = result.im;
        im = -result.re;
        return this;
    }


    /**
     * Cosine^-1 operation.
     * @return this Complex object whose value is acos(this)
     */
    public Complex acos()
    {
        Complex z = new Complex(re, im);
        z = z.times(z);
        z = new Complex(1, 0).minus(z);
        // Computing Ln(z + i * sqrt(1 - z^2)), where z = this
        Complex result = new Complex(re, im).plus(z.sqrt().times(new Complex(0, 1)));
        result = result.log();
        re = result.im;
        im = -result.re;
        return this;
    }



    /**
     * Square of Complex object's length, we're using square of length to 
     * eliminate the computation of square root
     * @return square of length
    */
    public double lengthSQ() {
        return re * re + im * im;
    }
}
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


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

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
@EqualsAndHashCode
@ToString
public class Complex {
    private static final Complex ZERO = new Complex(0, 0);

    public double re;   // the real part
    public double im;   // the imaginary part

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
     * Absolute value.
     * sqrt(<i>x</i><sup>2</sup>&nbsp;+<i>y</i><sup>2</sup>)
     *
     * @return return abs/modulus/magnitude
     */
    public double abs() {
        return Math.hypot(re, im);
    }

    /**
     * Complex angle or angle in polar coordinates.
     *
     * @return angle/phase/argument, normalized to be between -pi and pi
     */
    public double phase() {
        return Math.atan2(im, re);
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
     * Subtract operation.
     *
     * @param b operand
     * @return this Complex object whose value is (this - b)
     */
    public Complex minus(Complex b) {
        re -= b.re;
        im -= b.im;
        return this;
    }

    /**
     * Scale operation.
     *
     * @param alpha scale factor
     * @return this Complex object whose value is (this * alpha)
     */
    public Complex scale(double alpha) {
        re *= alpha;
        im *= alpha;
        return this;
    }

    /**
     * @return this Complex object whose value is the conjugate of this
     */
    public Complex conjugate() {
        im = -im;
        return this;
    }

    /**
     * @return this Complex object whose value is the reciprocal of this
     */
    public Complex reciprocal() {
        double scale = re * re + im * im;
        re /= scale;
        im /= -scale;
        return this;
    }

    /**
     * @return a / b
     */
    public Complex divides(Complex b) {
        if (b.equals(ZERO)) {
            throw new ArithmeticException("Division by zero");
        }
        Complex a = this;
        return a.times(b.reciprocal());
    }

    /**
     * @return this Complex object whose value is the complex exponential of this
     */
    public Complex exp() {
        re = Math.exp(re) * Math.cos(im);
        im = Math.exp(re) * Math.sin(im);
        return this;
    }

    /**
     * @return this Complex object whose value is the complex sine of this
     */
    public Complex sin() {
        re = Math.sin(re) * Math.cosh(im);
        im = Math.cos(re) * Math.sinh(im);
        return this;
    }

    /**
     * @return this Complex object whose value is the complex cosine of this
     */
    public Complex cos() {
        re = Math.cos(re) * Math.cosh(im);
        im = -Math.sin(re) * Math.sinh(im);
        return this;
    }

    /**
     * @return this Complex object whose value is the complex tangent of this
     */
    public Complex tan() {
        return sin().divides(cos());
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
}
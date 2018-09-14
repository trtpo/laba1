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


import java.math.BigDecimal;
import java.text.DecimalFormat;

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
     * @param real a complex number real part
     * @param imag a complex number imaginary part 
     */
    public Complex(double real, double imag) {
        re = real;
        im = imag;
    }

    /**
     * Get real part of this.
     * @return this Complex object whose value is (this + b)
     */
    public double real() {
        return re;
    }

    /**
     * Get imagine part of this.
     * @return this Complex object whose value is (this + b)
     */
    public double imag() {
        return im;
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
     * Mod operation.
     * @return this mod from this value
     */
    public double mod() {
        if (re!=0 || im!=0) {
            return Math.sqrt(re*re+im*im);
        } else {
            return 0d;
        }
    }

    /**
     * Div operation.
     * @param  w divider
     * @return this Complex object whose value is this / w
     */
    public Complex div(Complex w) throws IllegalArgumentException {
        double den=Math.pow(w.mod(),2);
        if(w.mod() == 0) throw new IllegalArgumentException("Argument 'divisor' is 0");
        return new Complex((re*w.real()+im*w.imag())/den,(im*w.real()-re*w.imag())/den);
    }

    /**
     * Sine operation.
     * @return new Complex object whose value is equals to sine of this
     */
    public Complex sin() {
        return new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
    }

    /**
     * Cosine  operation.
     * @return new Complex object whose value is equals to cosine of this
     */
    public Complex cos() {
        return new Complex(Math.cos(re) * Math.cosh(im), -Math.sin(re) * Math.sinh(im));
    }

    /**
     * Tan operation.
     * @return new Complex object whose value is equals to tan of this
     */
    public Complex tan() {
        return (this.sin()).div(this.cos());
    }

    /**
     * Exp operation.
     * @return return a new Complex object whose value is the complex exponential of this
     */
    public Complex exp() {
        return new Complex(Math.exp(re) * Math.cos(im), Math.exp(re) * Math.sin(im));
    }

    /**
     * Round this value
     */
    public void round() {
        DecimalFormat df = new DecimalFormat("#.#");
        im = Double.valueOf(df.format(im));
        re = Double.valueOf(df.format(re));
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
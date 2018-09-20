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
    private static final int ZERO = 0;

    public double getRealPart() {
        return re;
    }
      public double getImagPart() {
        return im;
     }

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
     * Sub operation
     * @param b operand
     * @return this Complex object whose value is (this - b)
     */
    public Complex minus(Complex b) {
        double real = this.re - b.re;
        double imag = this.im - b.im;
        this.im = imag;
        this.re = real;
        return this;
    }
     /**
     * Sin operation.
     * @return new Complex object whose value is the complex sin of this
     */
    public Complex sin() {
        double real = Math.sin(re) * Math.cosh(im);
        double image = Math.cos(re) * Math.sinh(im);
        re = real;
        im = image;
        return this;
    }
     /**
     * Cos operation.
     * @return new Complex object whose value is the complex cos of this
     */
    public Complex cos() {
        double real = Math.cos(re) * Math.cosh(im);
        double image = -Math.sin(re) * Math.sinh(im);
        re = real;
        im = image;
        return this;
    }
     /**
     * Divide this complex number to other complex number
     * @param b the other complex number
     * @return the result of division
     */
    public Complex divides(Complex b) {
        if(b.im == 0 && b.re == 0){
            throw new ArithmeticException("Division by zero");
        }
        Complex a = this;
        double realPart = (re * b.re + im * b.im) / (b.re * b.re + b.im * b.im);
        double imagePart = (b.re * im - re * b.im) / (b.re * b.re + b.im * b.im);
        a.re = realPart;
        a.im = imagePart;
        return a;
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
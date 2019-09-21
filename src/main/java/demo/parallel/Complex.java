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


import static java.lang.Math.*;


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
    // precision of double comparison
    private static final double PRECISION = 0.00001;

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
     * The absolute value of the complex number
     * @return double the absolute value of complex number
     *
     */
    public double absoluteValue() {
        double realSquare = re * re;
        double imaginarySquare = im * im;

        // Handle NaN infinity without exceptions (due to performance)
        if (Double.isInfinite(realSquare) || Double.isInfinite(imaginarySquare)) {
            return Double.POSITIVE_INFINITY;
        }

        // handle NaN due to performance
        if (Double.isNaN(realSquare) || Double.isNaN(imaginarySquare)) {
            return Double.NaN;
        }

        return sqrt(re * re + im * im);
    }

    /**
     * Subtract operation
     * @param b complex number to subtract
     * @return this Complex object whose value is (this - b)
     */
    public Complex subtract(Complex b) {
        if (b == null) {
            throw new ComplexNullPointerException("b is null");
        }

        re -= b.re;
        im -= b.im;
        return this;
    }

    /**
     * Sine operation
     * @param number complex argument
     * @return Complex sine of number
     */
    public static Complex sin(Complex number) {
        if (number == null) {
            throw new ComplexNullPointerException("number is null");
        }

        // Handle nan without exceptions (due to performance)
        if (!Double.isFinite(number.re) || !Double.isFinite(number.im)) {
            return new Complex(Double.NaN, Double.NaN);
        }
        else {
            double resultReal = Math.sin(number.re) * Math.cosh(number.im);
            double resultImaginary = Math.cos(number.re) * Math.sinh(number.im);

            return new Complex(resultReal, resultImaginary);
        }
    }

    /**
     * Cosine operation
     * @param number complex argument
     * @return Complex cosine of number
     */
    public static Complex cos(Complex number) {
        if (number == null) {
            throw new ComplexNullPointerException("number is null");
        }

        // Handle nan without exceptions (due to performance)
        if (!Double.isFinite(number.re) || !Double.isFinite(number.im)) {
            return new Complex(Double.NaN, Double.NaN);
        }
        else {
            double resultReal = Math.cos(number.re) * Math.cosh(number.im);
            double resultImaginary = (-Math.sin(number.re)) * Math.sinh(number.im);

            return new Complex(resultReal, resultImaginary);
        }
    }

    /**
     * Equal comparison operation
     * @param number other complex number
     * @return boolean if number is equal to other complex number
     */
    @Override
    public boolean equals(Object number) {
        if (number == null || number.getClass() != this.getClass()) {
            return false;
        }
        else {
            Complex complex = (Complex) number;

            // handle NaN cases
            boolean anyOfNumbersIsIncorrect = !Double.isFinite(re)
                                              || !Double.isFinite(im)
                                              || !Double.isFinite(complex.im)
                                              || !Double.isFinite(complex.re);
            if (anyOfNumbersIsIncorrect) {
                return (Double.compare(re, complex.re) == 0)
                        && (Double.compare(im, complex.im) == 0);
            }
            else {
                // handle default (not NaN) cases
                return (Math.abs(this.re - complex.re) < PRECISION)
                        && (Math.abs(this.im - complex.im) < PRECISION);
            }
        }
    }

    /**
     * Support operation
     * @return string representation
     */
    public String toString() {
        return String.valueOf(re) + ", " + String.valueOf(im);
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


class ComplexNullPointerException extends NullPointerException {
    public ComplexNullPointerException(String message) {
        super(message);
    }
}

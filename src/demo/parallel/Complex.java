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


package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @Test
    public void minusTest(){
        Complex a = new Complex(6.7, 6.6);
        Complex b = new Complex(-11.4, 4.4);

        Complex result = a.minus(b);

        assertEquals(6.7 - (-11.4), result.getRe(), 0.0001);
        assertEquals(6.6 - 4.4, result.getIm(), 0.0001);
    }

}

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

    public Complex minus(Complex b) {
        re -= b.re;
        im -= b.im;
        return this;
    }

    public double lengthSQ() {
        return re * re + im * im;
    }
}
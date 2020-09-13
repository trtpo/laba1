package sample;



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

    public Complex minus(Complex b) {
        re -= b.re;
        im -= b.im;
        return this;
    }

    public Complex power(int pow) {
        while(pow-->0){
            this.times(this);
        }
        return this;
    }

    public Complex multiply(double pow) {
        Complex res;
        res=new Complex(this.re*pow, this.im*pow);
        return res;
    }

    public Complex division(Complex b) {

        Complex res;
        res=new Complex(0, 0);

        res.re=(this.re*b.re+this.im*b.im)/(b.re*b.re+b.im*b.im);
        res.re=(this.im*b.re-this.re*b.im)/(b.re*b.re+b.im*b.im);

        return res;
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
     * Square of Complex object's length, we're using square of length to
     * eliminate the computation of square root
     * @return square of length
     */
    public double lengthSQ() {
        return re * re + im * im;
    }
}

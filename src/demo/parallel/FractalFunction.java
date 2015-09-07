package demo.parallel;

public class FractalFunction {

    public Complex countFractalFunction(Complex c, Complex comp) {
        return c.plus(comp).plus(c.involution(2));
    }
}

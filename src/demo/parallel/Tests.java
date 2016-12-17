package demo.parallel;

import org.junit.Assert;

/**
 * Created by User on 12/17/2016.
 */
public class Tests {
    @org.junit.Test
    public void TestDivisionMethod() {
        checkDiv(new Complex(4, 4), new Complex(2, 6), new Complex(0.8, -0.4));
        checkDiv(new Complex(6, 4), new Complex(6, 4), new Complex(1, 0));
        checkDiv(new Complex(0, 4), new Complex(0, 2), new Complex(2, 0));
        checkDiv(new Complex(6, 0), new Complex(2, 0), new Complex(3, 0));
        checkDiv(new Complex(3, 15), new Complex(3, 3), new Complex(3, 2));
    }

    @org.junit.Test
    public void TestSubstrMethod() {
        checkSubstr(new Complex(4, 4), new Complex(2, 6), new Complex(2, -2));
        checkSubstr(new Complex(6, 4), new Complex(6, 4), new Complex(0, 0));
        checkSubstr(new Complex(0, 4), new Complex(0, 2), new Complex(0, 2));
        checkSubstr(new Complex(6, 0), new Complex(2, 0), new Complex(4, 0));
        checkSubstr(new Complex(3, 15), new Complex(3, 3), new Complex(0, 12));
    }

    @org.junit.Test
    public void TestConjuctionMethod() {
        checkConjuction(new Complex(1, 1), new Complex(1, -1));
    }



    private void checkDiv(Complex a, Complex b, Complex result) {
        String text = "\nComplex(" + a.getRe() + ", " + a.getIm() + ") / Complex(" + b.getRe() + ", " + b.getIm() + ") doesn't equal to Complex(" + result.getRe() + ", " + result.getIm() + ")";
        a.division(b);
        Assert.assertTrue(text + "\n\tYou have Complex(" + a.getRe() + ", " + a.getIm() + ")", a.getRe() == result.getRe() && a.getIm() == result.getIm());
    }
    private void checkSubstr(Complex a, Complex b, Complex result) {
        String text = "\nComplex(" + a.getRe() + ", " + a.getIm() + ")-Complex(" + b.getRe() + ", " + b.getIm() + ") doesn't equal to Complex(" + result.getRe() + ", " + result.getIm() + ")";
        a.substr(b);
        Assert.assertTrue(text + "\n\tYou have Complex(" + a.getRe() + ", " + a.getIm() + ")", a.getRe() == result.getRe() && a.getIm() == result.getIm());
    }
    private void checkConjuction(Complex a, Complex result) {
        String text = "\nComplex(" + a.getRe() + ", " + a.getIm() + ") after conjuction doesn't equal to Complex(" + result.getRe() + ", " + result.getIm() + ")";
        Complex b = a.findConjuction();
        Assert.assertTrue(text + "\n\tYou have Complex(" + b.getRe() + ", " + b.getIm() + ")", b.getRe() == result.getRe() && b.getIm() == result.getIm());
    }
}

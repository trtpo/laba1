package demo.parallel;

import org.junit.Assert;


/**
 * Created by kosiak_man on 10/29/2016.
 */
public class ComplexTest {

    private void checkDiv(Complex a, Complex b, Complex result) {
        String text = "Complex(" + a.getRe() + ", " + a.getIm() + ") / Complex(" + b.getRe() + ", " + b.getIm() + ") should be equal to Complex(" + result.getRe() + ", " + result.getIm() + ")";
        a.division(b);
        Assert.assertTrue(text + "\nNOT to Complex(" + a.getRe() + ", " + a.getIm() + ")", a.getRe() == result.getRe() && a.getIm() == result.getIm());
    }

    @org.junit.Test
    public void TestDivisionMethod() {
        checkDiv(new Complex(4, 4), new Complex(2, 6), new Complex(0.8, -0.4));
        checkDiv(new Complex(6, 4), new Complex(6, 4), new Complex(1, 0));
        checkDiv(new Complex(0, 4), new Complex(0, 2), new Complex(2, 0));
        checkDiv(new Complex(6, 0), new Complex(2, 0), new Complex(3, 0));
        checkDiv(new Complex(3, 15), new Complex(3, 3), new Complex(3, 2));
    }

    private void checkSubstr(Complex a, Complex b, Complex result) {
        String text = "Complex(" + a.getRe() + ", " + a.getIm() + ") - Complex(" + b.getRe() + ", " + b.getIm() + ") should be equal to Complex(" + result.getRe() + ", " + result.getIm() + ")";
        a.substr(b);
        Assert.assertTrue(text + "\nNOT to Complex(" + a.getRe() + ", " + a.getIm() + ")", a.getRe() == result.getRe() && a.getIm() == result.getIm());
    }

    @org.junit.Test
    public void TestSubstrMethod() {
        checkSubstr(new Complex(4, 4), new Complex(2, 6), new Complex(2, -2));
        checkSubstr(new Complex(6, 4), new Complex(6, 4), new Complex(0, 0));
        checkSubstr(new Complex(0, 4), new Complex(0, 2), new Complex(0, 2));
        checkSubstr(new Complex(6, 0), new Complex(2, 0), new Complex(4, 0));
        checkSubstr(new Complex(3, 15), new Complex(3, 3), new Complex(0, 12));
    }
}

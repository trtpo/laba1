import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;

public class ComplexTest {
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    @Before
    public void setup() {}

    @Test
    public void getReTestZero() {
        Complex a = new Complex(0, 0);
        collector.checkThat(
                "Getting real part operation test. Wrong result.",
                a.getRe(),
                equalTo(0.0)
        );
    }

    @Test
    public void getReTestPositive() {
        Complex b = new Complex(10,0);
        collector.checkThat(
                "Getting real part operation test. Wrong result.",
                b.getRe(),
                equalTo(10.0)
        );
    }

    @Test
    public void getReTestNegative() {
        Complex c = new Complex(-10, 0);
        collector.checkThat(
                "Getting real part operation test. Wrong result.",
                c.getRe(),
                equalTo(-10.0)
        );
    }

    @Test
    public void getImTestZero() {
        Complex a = new Complex(0,0);
        collector.checkThat(
                "Getting imaginary part operation test. Wrong result.",
                a.getIm(),
                equalTo(0.0)
        );
    }

    @Test
    public void getImPositive() {
        Complex b = new Complex(10, 10);
        collector.checkThat(
                "Getting imaginary part operation test. Wrong result.",
                b.getIm(),
                equalTo(10.0)
        );
    }

    @Test
    public void getImNegative() {
        Complex c = new Complex(10, -10);
        collector.checkThat(
                "Getting imaginary part operation test. Wrong result.",
                c.getIm(),
                equalTo(-10.0)
        );
    }

    @Test
    public void isNaNTest() {
        Complex a = new Complex(0,0);
        collector.checkThat(
                "isNaN operation test. Wrong result. Shouldn't be NaN.",
                a.isNaN(),
                equalTo(false)
        );
    }

    @Test
    public void divideByZeroTest() {
        Complex a = new Complex(10,5);
        Complex zero = new Complex(0,0);
        a.divide(zero);
        collector.checkThat(
                "Division operation test. Wrong result. Should be NaN.",
                a.isNaN(),
                equalTo(true)
        );
    }

    @Test
    public void divideTest() {
        Complex a = new Complex(10,-6);
        Complex b = new Complex(2,2);
        a.divide(b);
        collector.checkThat(
                "Division operation test. Wrong real part result.",
                a.getRe() != 1.0 && a.getIm() == - 4.0,
                equalTo(false)
        );
        collector.checkThat(
                "Division operation test. Wrong imaginary part result.",
                a.getRe() == 1.0 && a.getIm() != - 4.0,
                equalTo(false)
        );
        collector.checkThat(
                "Division operation test. Wrong real and imaginary part result.",
                a.getRe() != 1.0 && a.getIm() != - 4.0,
                equalTo(false)
        );
    }
    @Test
     public void minusTestPositive() {
        Complex a = new Complex(10,4);
        Complex b = new Complex(8,2);
        a.minus(b);
        collector.checkThat(
                "Subtraction operation test. Wrong result.",
                a.equal(new Complex(2, 2)),
                equalTo(true)
        );
    }

    @Test
     public void minusTestNegative() {
        Complex a = new Complex(10,4);
        Complex b = new Complex(8,2);
        b.minus(a);
        collector.checkThat(
                "Subtraction operation test. Wrong result.",
                b.equal(new Complex(-2, -2)),
                equalTo(true)
        );
    }
    @Test
    public void minusTestZero() {
        Complex a = new Complex(10,4);
        Complex zero = new Complex(0,0);
        a.minus(zero);
        collector.checkThat(
                "Subtraction operation test. Wrong result.",
                a.equal(a),
                equalTo(true)
        );
    }
}

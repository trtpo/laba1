package demo.parallel;

import org.junit.After;
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

    @After
    public void destroy() {}

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
    public void divideTest() {

        Complex a = new Complex(12, -3);
        Complex b = new Complex(3, 3);

        a.divide(b);

        collector.checkThat(
                "Division operation test. Wrong real part result.",
                a.getRe() != 1.5 && a.getIm() == -2.5,
                equalTo(false)
        );
        collector.checkThat(
                "Division operation test. Wrong imaginary part result.",
                a.getRe() == 1.5 && a.getIm() != -2.5,
                equalTo(false)
        );
        collector.checkThat(
                "Division operation test. Wrong real and imaginary part result.",
                a.getRe() != 1.5 && a.getIm() != -2.5,
                equalTo(false)
        );
    }

    @Test
    public void minusTestPositive() {

        Complex a = new Complex(12, 9);
        Complex subtrahend = new Complex(12, -7);

        a.minus(subtrahend);

        collector.checkThat(
                "Subtraction operation test. Wrong result.",
                a.equals(new Complex(0, 16)),
                equalTo(true)
        );
    }

    @Test
    public void minusTestNegative() {

        Complex b = new Complex(-18, -1);
        Complex subtrahend = new Complex(12, -7);

        b.minus(subtrahend);

        collector.checkThat(
                "Subtraction operation test. Wrong result.",
                b.equals(new Complex(-30, 6)),
                equalTo(true)
        );
    }

    @Test
    public void minusTestZero() {

        Complex c = new Complex(12, -3);
        Complex subtrahend = new Complex(12, -3);

        c.minus(subtrahend);

        collector.checkThat(
                "Subtraction operation test. Wrong result.",
                c.equals(new Complex(0, 0)),
                equalTo(true)
        );
    }
}
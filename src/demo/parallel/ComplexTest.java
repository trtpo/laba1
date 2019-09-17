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

}
package demo.parallel;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;

public class ComplexTests {
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();
    @Test
    public void minusTest() {
        Complex minuend = new Complex(4, 3.5);
        Complex subtrahend = new Complex(-7, 2.5);
        errorCollector.checkThat("Subtract test. Wrong real part calculation.",
                minuend.minus(subtrahend).getRe(), equalTo(11.0));
        errorCollector.checkThat("Subtract test. Wrong image part calculation.",
                minuend.getIm(), equalTo(1.0));
    }
    @Test
    public void divideTest() {
        Complex divider = new Complex(2, 4);
        Complex dividend = new Complex(3, 4).divide(divider);
        errorCollector.checkThat(
                "Division test. Wrong real quotient value.",
                dividend.getRe() != 0.4 && dividend.getIm() == 0.0,
                equalTo(false)
        );
        errorCollector.checkThat(
                "Division test. Wrong image quotient value.",
                dividend.getIm() != 0.0 && dividend.getRe() == 0.4,
                equalTo(false)
        );
    }
}
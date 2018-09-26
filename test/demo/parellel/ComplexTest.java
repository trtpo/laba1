package demo.parellel;
import demo.parallel.Complex;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;
public class ComplexTest {
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void minusTest() {
        Complex minuend = new Complex(4, 3);
        Complex subtrahend = new Complex(-3, 2);
        errorCollector.checkThat("Subtract test. Wrong real part calculation.",
                minuend.minus(subtrahend).getRe(), equalTo(7.0));
        errorCollector.checkThat("Subtract test. Wrong image part calculation.",
                minuend.getIm(), equalTo(1.0));
    }

    @Test
    public void divideTest() {
        Complex divider = new Complex(2, 4);
        Complex dividend = new Complex(3, 4).division(divider);
        errorCollector.checkThat(
                "Division test. Wrong real value.",
                dividend.getRe() != 0.4 && dividend.getIm() == 0.0,
                equalTo(false)
        );
        errorCollector.checkThat(
                "Division test. Wrong image value.",
                dividend.getIm() != 0.0 && dividend.getRe() == 0.4,
                equalTo(false)
        );
    }
}
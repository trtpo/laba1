package demo.parellel;

import demo.parallel.Complex;
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

    @Test
    public void conjugateTest() {
        Complex a = new Complex(3.5, 4);
        errorCollector.checkThat(
                "Conjugate operation test. Image part is wrong.",
                 a.conjugate().getIm(),
                equalTo(-4.0)
        );
    }

    @Test
    public void scaleTest() {
        Complex complexMultiplier = new Complex(1, 9);
        double scalacMultiplier = 5;
        errorCollector.checkThat("Scalac multiplication test. Wrong real part operation.",
                complexMultiplier.scale(scalacMultiplier).getRe(), equalTo(5.0));
        errorCollector.checkThat("Scalac multiplication test. Wrong image part operation.",
                complexMultiplier.scale(scalacMultiplier).getIm(), equalTo(45.0));
    }

    @Test
    public void equalTest() {
        Complex a = new Complex(3, 2);
        Complex b = new Complex(7, 2);
        Complex c = new Complex(3, 10);
        errorCollector.checkThat(
                "Equal operation test. Wrong operation result.",
                a.equal(a),
                equalTo(true)
        );
        errorCollector.checkThat(
                "Equal operation test. Wrong real equality operator.",
                a.equal(b),
                equalTo(false)
        );
        errorCollector.checkThat(
                "Equal operation test. Wrong image equality operator.",
                a.equal(c),
                equalTo(false)
        );
    }

    @Test
    public void absTest() {
        Complex a = new Complex(3, 4);
        errorCollector.checkThat("Absolute value test. Wrong real part operation.",
                a.abs(), equalTo(5.0));
    }

    @Test
    public void phaseTest() {
        Complex a = new Complex(5, 5);
        errorCollector.checkThat("Phase value test. Wrong real part operation.",
                a.phase(), equalTo(Math.PI/4));
    }


}

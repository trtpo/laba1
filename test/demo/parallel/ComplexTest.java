package demo.parallel;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ComplexTest {

    private final static double DOUBLE_DELTA = 1E-10;

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void minus() {
        Complex a = new Complex(4, 8);
        Complex b = new Complex(-2, 1);
        collector.checkThat("Subtract test. Wrong real part operation.", a.minus(b).Re(), equalTo(6.0));
        collector.checkThat("Subtract test. Wrong image part operation.", a.Im(), equalTo(7.0));
    }

    @Test
    public void divide() {
        Complex b = new Complex(2, 4);
        Complex a = new Complex(10, 4).divide(b);
        collector.checkThat(
                "Division test. Wrong real numerator value.",
                a.Re() != 1.8 && a.Im() == -1.6,
                equalTo(false)
        );
        collector.checkThat(
                "Division test. Wrong image numerator value.",
                a.Im() != -1.6 && a.Re() == 1.8,
                equalTo(false)
        );
        collector.checkThat(
                "Division test. Division algorithm error.",
                a.Re() != 1.8 && a.Im() != -1.6,
                equalTo(false)
        );
    }

    @Test
    public void re() {
        Complex a = new Complex(1, 0);
        assertEquals("Real operation test. Wrong real result.", 1.0, a.Re(), DOUBLE_DELTA);
    }

    @Test
    public void im() {
        Complex a = new Complex(0, 1);
        assertEquals("Image operation test. Wrong image result.", 1.0, a.Im(), DOUBLE_DELTA);
    }

    @Test
    public void arg() {
        Complex a = new Complex(0, 0);
        Complex b = new Complex(4, 2.3094010767585030580365951220078);
        collector.checkThat(
                "Argument operation test. Wrong non-existent variant result.",
                a.Arg(),
                equalTo(Double.NaN)
        );
        collector.checkThat(
                "Argument operation test. Wrong function result.",
                b.Arg(),
                equalTo(Math.PI / 6)
        );
    }

    @Test
    public void conjugate() {
        Complex a = new Complex(4, 4);
        assertEquals(
                "Conjugate operation test. Wrong conjugate result. Image part is wrong.",
                -4.0, a.conjugate().Im(),
                DOUBLE_DELTA
        );
    }

    @Test
    public void equal() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(2, 2);
        Complex c = new Complex(1, 1);
        collector.checkThat(
                "Equal operation test. Wrong operation result.",
                a.equal(a),
                equalTo(true)
        );
        collector.checkThat(
                "Equal operation test. Wrong real equality operator.",
                a.equal(b),
                equalTo(false)
        );
        collector.checkThat(
                "Equal operation test. Wrong image equality operator.",
                a.equal(c),
                equalTo(false)
        );
    }

    @Test
    public void isNaN() {
        Complex a = new Complex(Double.NaN, Double.NaN);
        assertTrue("NaN check test. Wrong operation result.", a.isNaN());
    }
}
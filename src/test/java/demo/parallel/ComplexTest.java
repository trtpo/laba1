package demo.parallel;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ComplexTest {private Complex a;
    private Complex b;

    @Before
    public void setUp() {
        a = new Complex(5.0, 6.0);
        b = new Complex(-3.0, 4.0);
    }

    @org.junit.Test
    public void abs() throws Exception {
        assertThat("abs(x, y) = ((x)^2 + y^2)^(1/2)", b.abs(), is(5.));
    }

    @org.junit.Test
    public void phase() throws Exception {
        assertThat("phase(x, y) = atan(y / x)", a.phase(), is(.8760580505981934));
    }

    @org.junit.Test
    public void plus() throws Exception {
        Complex sum = new Complex(2, 10);
        assertThat("c1 + c2 = x1 + x2 + i(y1 + y2)", a.plus(b), is(sum));
    }

    @org.junit.Test
    public void minus() throws Exception {
        Complex sub = new Complex(8, 2);
        assertThat("c1 + c2 = x1 - x2 + i(y1 - y2)", a.minus(b), is(sub));
    }

    @org.junit.Test
    public void scale() throws Exception {
        Complex scaled = new Complex(10, 12);
        assertThat("scale(c, factor) = x * factor + i(y * factor)", a.scale(2), is(scaled));
    }

    @org.junit.Test
    public void conjugate() throws Exception {
        Complex conj = new Complex(5, -6);
        assertThat("conj(c) = x + i(-y)", a.conjugate(), is(conj));
    }

    @org.junit.Test
    public void reciprocal() throws Exception {
        Complex recip = new Complex(.08196721311475409, -.09836065573770492);
        assertThat("recip(c) = x / abs(c)^2 + i(-y / abs(c)^2)", a.reciprocal(), is(recip));
    }

    @org.junit.Test
    public void divides() throws Exception {
        Complex div = new Complex(0.36, -1.52);
        assertThat("div(c1, c2) = c1 * recip(c2)", a.divides(b), is(div));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void divisionByZero() throws Exception {
        Complex zero = new Complex(0, 0);
        a.divides(zero);
    }

    @org.junit.Test
    public void exp() throws Exception {
        Complex exp = new Complex(142.50190551820737, -2.157951692870801E61);
        assertThat("exp(c) = e^x * cos(y) + i(e^x * sin(y))", a.exp(), is(exp));
    }

    @org.junit.Test
    public void sin() throws Exception {
        Complex sin = new Complex(-193.43002005693958, 44.427540211512465);
        assertThat("sin(c) = sin(x) * ch(y) + i(cos(x) * sh(y))", a.sin(), is(sin));
    }

    @org.junit.Test
    public void cos() throws Exception {
        Complex cos = new Complex(57.21909818460074, -125.32908499677721);
        assertThat("cos(c) = cos(x) * ch(y) + i(-sin(x) * sh(y))", a.cos(), is(cos));
    }

    @org.junit.Test
    public void tan() throws Exception {
        Complex tan = new Complex(-1.620995076511252E-38, -1.1654991644980341E-38);
        assertThat("tab(c) = sin(c) / cos(c)", a.tan(), is(tan));
    }

    @org.junit.Test
    public void times() throws Exception {
        Complex mult = new Complex(-39., 2.);
        assertThat("mult(c1, c2) = x1 * x2 - y1 * y2 + i(x1 * y2 + y1 * x2)", a.times(b), is(mult));
    }

    @org.junit.Test
    public void timesCommutative() throws Exception {
        Complex mult = new Complex(-39., 2.);
        assertThat("multiplication is commutative", b.times(a), is(mult));
    }

    @org.junit.Test
    public void lengthSQ() throws Exception {
        assertThat("(x)^2 + y^2 = abs(c)^2", a.lengthSQ(), is((double)Math.round(Math.pow(a.abs(), 2))));
    }

}
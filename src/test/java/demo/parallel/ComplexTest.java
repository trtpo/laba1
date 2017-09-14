package demo.parallel;

import org.junit.Before;
import org.junit.BeforeClass;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ComplexTest {
    private static double abs;
    private static double phase;
    private static Complex sum;
    private static Complex sub;
    private static Complex scaled;
    private static Complex conj;
    private static Complex recip;
    private static Complex div;
    private static Complex exp;
    private static Complex sin;
    private static Complex cos;
    private static Complex tan;
    private static Complex mult;

    private Complex a;
    private Complex b;

    @BeforeClass
    public static void setUpTestConstants() {
        abs = 5.;
        phase = .8760580505981934;
        sum = new Complex(2, 10);
        sub = new Complex(8, 2);
        scaled = new Complex(10, 12);
        conj = new Complex(5, -6);
        recip = new Complex(.08196721311475409, -.09836065573770492);
        div = new Complex(0.36, -1.52);
        exp = new Complex(142.50190551820737, -41.468936789922886);
        sin = new Complex(-193.43002005693958, 57.21839505634109);
        cos = new Complex(57.21909818460074, 193.4276431213065);
        tan = new Complex(-7.218901788276057E-50, 3.4351329259973757E-50);
        mult = new Complex(-39., 2.);
    }

    @Before
    public void setUp() {
        a = new Complex(5.0, 6.0);
        b = new Complex(-3.0, 4.0);
    }

    @org.junit.Test
    public void  shouldCalculateAbs() throws Exception {
        assertThat("abs(x, y) = ((x)^2 + y^2)^(1/2)", b.abs(), is(abs));
    }

    @org.junit.Test
    public void  shouldCalculatePhase() throws Exception {
        assertThat("phase(x, y) = atan(y / x)", a.phase(), is(phase));
    }

    @org.junit.Test
    public void  shouldCalculateSum() throws Exception {
        assertThat("c1 + c2 = x1 + x2 + i(y1 + y2)", a.plus(b), is(sum));
    }

    @org.junit.Test
    public void  shouldCalculateSub() throws Exception {
        assertThat("c1 + c2 = x1 - x2 + i(y1 - y2)", a.minus(b), is(sub));
    }

    @org.junit.Test
    public void  shouldScale() throws Exception {
        assertThat("scale(c, factor) = x * factor + i(y * factor)", a.scale(2), is(scaled));
    }

    @org.junit.Test
    public void  shouldConjugate() throws Exception {
        assertThat("conj(c) = x + i(-y)", a.conjugate(), is(conj));
    }

    @org.junit.Test
    public void  shouldReciprocal() throws Exception {
        assertThat("recip(c) = x / abs(c)^2 + i(-y / abs(c)^2)", a.reciprocal(), is(recip));
    }

    @org.junit.Test
    public void  shouldDivide() throws Exception {
        assertThat("div(c1, c2) = c1 * recip(c2)", a.divides(b), is(div));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void shouldThrowArithmeticExceptionWhenDiviByZero() throws Exception {
        a.divides(Complex.ZERO);
    }

    @org.junit.Test
    public void  shouldCalculateExponent() throws Exception {
        assertThat("exp(c) = e^x * cos(y) + i(e^x * sin(y))", a.exp(), is(exp));
    }

    @org.junit.Test
    public void  shouldCalculateSin() throws Exception {
        assertThat("sin(c) = sin(x) * ch(y) + i(cos(x) * sh(y))", a.sin(), is(sin));
    }

    @org.junit.Test
    public void  shouldCalculateCos() throws Exception {
        assertThat("cos(c) = cos(x) * ch(y) + i(-sin(x) * sh(y))", a.cos(), is(cos));
    }

    @org.junit.Test
    public void  shouldCalculateTan() throws Exception {
        assertThat("tab(c) = sin(c) / cos(c)", a.tan(), is(tan));
    }

    @org.junit.Test
    public void  shouldMultiply() throws Exception {
        assertThat("mult(c1, c2) = x1 * x2 - y1 * y2 + i(x1 * y2 + y1 * x2)", a.times(b), is(mult));
    }

    @org.junit.Test
    public void multiplicationShouldBeCommutative() throws Exception {
        assertThat("multiplication is commutative", b.times(a), is(mult));
    }

    @org.junit.Test
    public void  shouldCalculateLengthSQ() throws Exception {
        assertThat("(x)^2 + y^2 = abs(c)^2", a.lengthSQ(), is((double)Math.round(Math.pow(a.abs(), 2))));
    }

}
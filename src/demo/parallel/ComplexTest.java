package demo.parallel;

        import static org.junit.Assert.*;

public class ComplexTest {
    private static final double DELTA = 1e-15;
    @org.junit.Test
    public void minus() {
        Complex myNumber = new Complex(24,6);
        Complex tested = new Complex(12, 3);
        assertEquals("Check numbers",tested.getReal(), myNumber.minus(tested).getReal(), DELTA);
    }

    @org.junit.Test
    public void divide() {
        Complex a = new Complex(12, -3);
        Complex b = new Complex(3, 3);
        a.divide(b);
        assertTrue("Check numbers",a.equal(new Complex(1.5, -2.5)));
    }
    @org.junit.Test
    public void equal() {
        Complex a = new Complex(12, -3);
        Complex b = new Complex(3, 3);
        assertEquals("Not equal numbers",true,a.equal(b));
        assertEquals(true,a.equal(a));

    }
}
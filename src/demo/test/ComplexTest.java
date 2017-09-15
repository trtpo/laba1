package demo.test;
import demo.parallel.Complex;
import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void testSub() throws Exception {
                Complex a = new Complex(5,6);
                Complex b = new Complex(7,-1);
        assertTrue(a.sub(b).equalTo(new Complex(-2,7)));
    }

    @org.junit.Test
    public void testDivides() throws Exception {
        Complex a = new Complex(-1,3);
        Complex b = new Complex(1,2);

        assertTrue(a.divides(b).equalTo(new Complex(1,1)));
    }
}

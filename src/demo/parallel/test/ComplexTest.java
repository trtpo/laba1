import demo.parallel.Complex;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class ComplexTest {
    @Before
    public void setUp() throws Exception {
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testTimes() throws Exception {
        String errorMessage = "Basic sin operation";
        Complex a = new Complex(2,4);
        Complex b = new Complex(7,8);
        a.times(b);
        assertTrue(errorMessage, a.equals(new Complex(-18.0, 44.0)));
    }
    @Test
    public void testCos() throws Exception {
        String errorMessage = "Basic cos operation";
        Complex a = new Complex(2,4);
        a.cos();
        assertTrue(errorMessage, a.equals(new Complex(-11.36423470640106, -24.814651485634183)));
    }
    @Test
    public void testSin() throws Exception {
        String errorMessage = "Basic sin operation";
        Complex a = new Complex(2,4);
        a.sin();
        assertTrue(errorMessage, a.equals(new Complex(24.83130584894638, -11.356612711218173)));
    }
    @Test
    public void testMinusBasic() throws Exception {
        String errorMessage = "Basic minus operation";
        Complex a = new Complex(2,4);
        Complex b = new Complex(7,8);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(-5, -4)));
    }
    @Test
    public void testMinusZero() throws Exception {
        String errorMessage = "Minus zero";
        Complex a = new Complex(2,5);
        Complex b = new Complex(0,0);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(2, 5)));
    }
    @Test
    public void testMinusNull() throws Exception {
        String errorMessage = "Minus null complex number";
        Complex a = new Complex(2,2);
        Complex b = null;
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(2, 2)));
    }
    @Test
    public void testDivideOne() throws Exception {
        String errorMessage = "Divide on one";
        Complex a = new Complex(2,2);
        Complex b = new Complex(1,0);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(2, 2)));
    }
    @Test
    public void testDivideBasic() throws Exception {
        String errorMessage = "Basic division";
        Complex a = new Complex(3,3);
        Complex b = new Complex(5,7);
        a.times(b).divide(b);
        assertTrue(errorMessage, a.equals(new Complex(3,3)));
    }
    @Test
    public void testDivideImagine() throws Exception {
        String errorMessage = "Equals with only imagine complex number";
        Complex a = new Complex(3,7);
        Complex b = new Complex(0,1);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(7,-3)));
    }
    @Test
    public void testEqualsBasic() throws Exception {
        String errorMessage = "Equals with equal complex number";
        Complex a = new Complex(2,4);
        Complex b = new Complex(2,4);
        assertTrue(errorMessage, a.equals(b));
    }
    @Test
    public void testEqualsUnequal() throws Exception {
        String errorMessage = "Equals with unequals complex number";
        Complex a = new Complex(2,4);
        Complex b = new Complex(2,-4);
        assertTrue(errorMessage, !a.equals(b));
    }
    @Test
    public void testEqualsNull() throws Exception {
        String errorMessage = "Equals with null complex number";
        Complex a = new Complex(2,4);
        Complex b = null;
        assertTrue(errorMessage, !a.equals(b));
    }
}
package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestJUnit4 {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMinusBasic() throws Exception {
        String errorMessage = "Basic minus operation";
        Complex a = new Complex(2,4);
        Complex b = new Complex(6,2);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(-4, 2)));
    }

    @Test
    public void testMinusNegative() throws Exception {
        String errorMessage = "Minus negative complex number";
        Complex a = new Complex(10235,-10288);
        Complex b = new Complex(-16,2);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(10251, -10290)));
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
    public void testMinusLong() throws Exception {
        String errorMessage = "Minus with long complex number";
        Complex a = new Complex(1232174029345626842.1,18352134023345126043.1);
        Complex b = new Complex(1232174029345626842.1,18352134023345126043.1);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(0, 0)));
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
    public void testDivideZero() throws Exception {
        String errorMessage = "Divide on zero complex number";
        Complex a = new Complex(3,3);
        Complex b = new Complex(0,0);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(0,0)));
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
    public void testDivideLong() throws Exception {
        String errorMessage = "Divide on long complex number";
        Complex a = new Complex(1232174029345626842.1,135134023345126043.0);
        Complex b = new Complex(1232174029345626842.1,135134023345126043.0);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(1,0)));
    }

    @Test
    public void testDivideNull() throws Exception {
        String errorMessage = "Divide on null complex number";
        Complex a = new Complex(1232174029345626842.1,135134023345126043.0);
        Complex b = null;
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(1232174029345626842.1,135134023345126043.0)));
    }


    @Test
    public void testGetFBasic() throws Exception {
        String errorMessage = "Basic getting angle of complex number";
        Complex a = new Complex(2,2);
        assertEquals(errorMessage, a.getF(), 0.785398,0.00001);
    }

    @Test
    public void testGetF1Sector() throws Exception {
        String errorMessage = "Getting angle of complex number in 1-st sector";
        Complex a = new Complex(16,2);
        assertEquals(errorMessage, a.getF(), 0.124354,0.00001);
    }

    @Test
    public void testGetF4Sector() throws Exception {
        String errorMessage = "Getting angle of complex number in 4-d sector";
        Complex a = new Complex(16,-2);
        assertEquals(errorMessage, a.getF(), Math.PI*2 - 0.124354,0.00001);
    }

    @Test
    public void testGetF2Sector() throws Exception {
        String errorMessage = "Getting angle of complex number in 2-nd sector";
        Complex a = new Complex(-16,2);
        assertEquals(errorMessage, a.getF(), Math.PI - 0.124354,0.00001);
    }

    @Test
    public void testGetF3Sector() throws Exception {
        String errorMessage = "Getting angle of complex number in 3-rd sector";
        Complex a = new Complex(-16,-2);
        assertEquals(errorMessage, a.getF(), 3.265947,0.00001);
    }

    @Test
    public void testGetF0() throws Exception {
        String errorMessage = "Getting angle from Complex with 0 real and 0 imagine parts ";
        Complex a = new Complex(0,0);
        assertEquals(errorMessage, a.getF(), 0, 0.000001);
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
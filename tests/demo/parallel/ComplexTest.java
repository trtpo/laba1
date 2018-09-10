package demo.parallel;

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
    public void testMinusBasic() throws Exception {
        String errorMessage = "Basic minus operation.";
        Complex a = new Complex(2,4);
        Complex b = new Complex(6,2);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(-4, 2)));
    }

    @Test
    public void testMinusNegative() throws Exception {
        String errorMessage = "Minus negative complex number.";
        Complex a = new Complex(501,-511);
        Complex b = new Complex(-512,502);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(1013, -1013)));
    }

    @Test
    public void testMinusLong() throws Exception {
        String errorMessage = "Minus with long complex number.";
        Complex a = new Complex(9999999999999999999.1,9999999999999999999.1);
        Complex b = new Complex(9999999999999999999.1,9999999999999999999.1);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(0, 0)));
    }

    @Test
    public void testMinusZero() throws Exception {
        String errorMessage = "Minus zero.";
        Complex a = new Complex(2,5);
        Complex b = new Complex(0,0);
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(2, 5)));
    }

    @Test
    public void testMinusNull() throws Exception {
        String errorMessage = "Minus null complex number.";
        Complex a = new Complex(7.7,7.7);
        Complex b = null;
        a.minus(b);
        assertTrue(errorMessage, a.equals(new Complex(7.7, 7.7)));
    }

    @Test
    public void testDivideBasic() throws Exception {
        String errorMessage = "Basic division.";
        Complex a = new Complex(3,3);
        Complex b = new Complex(5,7);
        a.times(b).divide(b);
        assertTrue(errorMessage, a.equals(new Complex(3,3)));
    }

    @Test
    public void testDivideOne() throws Exception {
        String errorMessage = "Divide on one.";
        Complex a = new Complex(7.2,7.3);
        Complex b = new Complex(1,0);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(7.2, 7.3)));
    }

    @Test
    public void testDivideImagine() throws Exception {
        String errorMessage = "Equals with only imagine complex number.";
        Complex a = new Complex(15,15);
        Complex b = new Complex(0,1);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(15,-15)));
    }

    @Test
    public void testDivideLong() throws Exception {
        String errorMessage = "Divide on long complex number.";
        Complex a = new Complex(9999999999999999999.1,9999999999999999999.1);
        Complex b = new Complex(9999999999999999999.1,9999999999999999999.1);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(1,0)));
    }

    @Test
    public void testDivideZero() throws Exception {
        String errorMessage = "Divide on zero complex number.";
        Complex a = new Complex(12.1,14.2);
        Complex b = new Complex(0,0);
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(0,0)));
    }

    @Test
    public void testDivideNull() throws Exception {
        String errorMessage = "Divide on null complex number.";
        Complex a = new Complex(7,7);
        Complex b = null;
        a.divide(b);
        assertTrue(errorMessage, a.equals(new Complex(7,7)));
    }

    @Test
    public void testGetAngleInTrigonometryFormBasic() throws Exception {
        String errorMessage = "Basic getting angle of complex number.";
        Complex a = new Complex(2,2);
        assertEquals(errorMessage, a.getAngleInTrigonometryForm(), 0.785398,0.00001);
    }

    @Test
    public void testGetAngleInTrigonometryFormFirstSector() throws Exception {
        String errorMessage = "Getting angle of complex number in 1st sector.";
        Complex a = new Complex(16,2);
        assertEquals(errorMessage, a.getAngleInTrigonometryForm(), 0.124354,0.00001);
    }

    @Test
    public void testGetAngleInTrigonometryFormFourthSector() throws Exception {
        String errorMessage = "Getting angle of complex number in 4th sector.";
        Complex a = new Complex(16,-2);
        assertEquals(errorMessage, a.getAngleInTrigonometryForm(), Math.PI*2 - 0.124354,0.00001);
    }

    @Test
    public void testGetAngleInTrigonometryFormSecondSector() throws Exception {
        String errorMessage = "Getting angle of complex number in 2nd sector.";
        Complex a = new Complex(-16,2);
        assertEquals(errorMessage, a.getAngleInTrigonometryForm(), Math.PI - 0.124354,0.00001);
    }

    @Test
    public void testGetAngleInTrigonometryFormThirdSector() throws Exception {
        String errorMessage = "Getting angle of complex number in 3rd sector.";
        Complex a = new Complex(-16,-2);
        assertEquals(errorMessage, a.getAngleInTrigonometryForm(), 3.265947,0.00001);
    }

    @Test
    public void testGetAngleInTrigonometryFormWithZero() throws Exception {
        String errorMessage = "Getting angle from Complex with 0 real and 0 imagine parts.";
        Complex a = new Complex(0,0);
        assertEquals(errorMessage, a.getAngleInTrigonometryForm(), 0, 0.000001);
    }

    @Test
    public void testEqualsBasic() throws Exception {
        String errorMessage = "Equals with equal complex number.";
        Complex a = new Complex(6.1,5.1);
        Complex b = new Complex(6.1,5.1);
        assertTrue(errorMessage, a.equals(b));
    }

    @Test
    public void testEqualsUnequal() throws Exception {
        String errorMessage = "Equals with unequals complex number.";
        Complex a = new Complex(6.1,5.1);
        Complex b = new Complex(6.1,-5.1);
        assertTrue(errorMessage, !a.equals(b));
    }

    @Test
    public void testEqualsNull() throws Exception {
        String errorMessage = "Equals with null complex number";
        Complex a = new Complex(65.2,23.1);
        Complex b = null;
        assertTrue(errorMessage, !a.equals(b));
    }

    @Test
    public void testGetRealBasic() throws Exception {
        String errorMessage = "Basic get real part operation.";
        Complex a = new Complex(65.2,23.1);
        assertEquals(errorMessage, a.getReal(), 65.2, 0.000001);
    }

    @Test
    public void testGetRealWithZero() throws Exception {
        String errorMessage = "Get real part operation with zero.";
        Complex a = new Complex(0,23.1);
        assertEquals(errorMessage, a.getReal(), 0, 0.000001);
    }

    @Test
    public void testGetImagBasic() throws Exception {
        String errorMessage = "Basic get imag part operation.";
        Complex a = new Complex(65.2,23.1);
        assertEquals(errorMessage, a.getImag(), 23.1, 0.000001);
    }

    @Test
    public void testGetImagWithZero() throws Exception {
        String errorMessage = "Get imag part operation with zero.";
        Complex a = new Complex(55.2,72.1);
        assertEquals(errorMessage, a.getImag(), 72.1, 0.000001);
    }

    @Test
    public void testNotImagBasic() throws Exception {
        String errorMessage = "Basic not imag operation.";
        Complex a = new Complex(44.1,54.7);
        a.notImag();
        assertTrue(errorMessage, a.equals(new Complex(44.1, -54.7)));
    }

    @Test
    public void testNotImagWithZero() throws Exception {
        String errorMessage = "Not imag operation with zero.";
        Complex a = new Complex(44.1,0);
        a.notImag();
        assertTrue(errorMessage, a.equals(new Complex(44.1, 0)));
    }
}
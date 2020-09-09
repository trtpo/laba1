package demo.parallel;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexTest {

	@Test
	public void testMinusBothPositive() {
        Complex a = new Complex(7, 6);
        Complex b = new Complex(1, 5);
        Complex result = a.minus(b);
        assertEquals(new Complex(6, 1), result);
	}
	
	@Test
	public void testMinusBothNegative() {
        Complex a = new Complex(-7, -6);
        Complex b = new Complex(-1, -5);
        Complex result = a.minus(b);
        assertEquals(new Complex(-6, -1), result);
	}
	
	@Test
	public void testMinusResultZero() {
        Complex a = new Complex(7, 6);
        Complex b = new Complex(7, 6);
        Complex result = a.minus(b);
        assertEquals(new Complex(0, 0), result);
	}

}

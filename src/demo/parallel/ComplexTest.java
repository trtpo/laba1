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
	public void testMinusResultZero() {
        Complex a = new Complex(8, 3);
        Complex b = new Complex(8, 3);
        Complex result = a.minus(b);
        assertEquals(new Complex(0, 0), result);
	}
	
	@Test
	public void testDivide() {
        Complex a = new Complex(2, -3);
        Complex b = new Complex(-4, 6);
        Complex result = a.divide(b);
        assertEquals(new Complex(-0.5, 0), result);
	}

}

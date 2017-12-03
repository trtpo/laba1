package demo.parallel;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {
	
	@Test
	public void complexDivideDividesItselfByAnotherNumberCorrectly() {
		Complex a = new Complex(4, 5);
		Complex b = new Complex(2, 3);
		
		double real = (4.0 * 2.0 + 5.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
    	double imaginary = (2.0 * 5.0 - 4.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
    	
		a.divide(b);
		
		assertEquals("Real part of a is", real, a.get_real(), 0.0);
		assertEquals("Imaginary part of a is", imaginary, a.get_imag(), 0.0);
	
		
	}
	@Test
	public void complexMinusSubtractsAnotherNumberFromItselfCorrectly() {
		
		Complex a = new Complex(35, 26);
		Complex b = new Complex(6, 10);
		
		a.minus(b);
		
		assertEquals("Real part of a is", 29.0, a.get_real(), 0.0);
		assertEquals("Imaginary part of a is", 16.0, a.get_imag(), 0.0);
	}
	
}

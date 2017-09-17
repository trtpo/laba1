package demo.parallel;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexTest {

	@Test
	public void complexConstructorCreatesNewObjectWithCorrectRealPart() {
		// Act
		Complex c = new Complex(5, 6);
		
		// Assert
		assertNotNull(c);
		assertEquals("Real part should be equal", 5.0, c.getReal(), 0.0);
		assertEquals("Imaginary part should be equal", 6.0, c.getImaginary(), 0.0);
	}
	
	@Test
	public void complexPlusAddsAnotherNumberToItselfCorrectly() {
		// Arrange
		Complex a = new Complex(0, 0);
		Complex b = new Complex(7, 8);
		
		// Act
		a.plus(b);
		
		// Assert
		assertEquals("Real part of a is", 7.0, a.getReal(), 0.0);
		assertEquals("Imaginary part of a is", 8.0, a.getImaginary(), 0.0);		
	}
	
	@Test
	public void complexMinusSubtractsAnotherNumberFromItselfCorrectly() {
		// Arrange
		Complex a = new Complex(15, 20);
		Complex b = new Complex(7, 8);
		
		// Act
		a.minus(b);
		
		// Assert
		assertEquals("Real part of a is", 8.0, a.getReal(), 0.0);
		assertEquals("Imaginary part of a is", 12.0, a.getImaginary(), 0.0);		
	}
	
	
	@Test
	public void complexTimesMultipliesAnotherNumberWithItselfCorrectly() {
		// Arrange
		Complex a = new Complex(4, 5);
		Complex b = new Complex(2, 3);
		
		// Act
		a.times(b);
		
		// Assert
		assertEquals("Real part of a is", -7.0, a.getReal(), 0.0);
		assertEquals("Imaginary part of a is", 22.0, a.getImaginary(), 0.0);		
	}
	
	@Test
	public void complexDivideDividesItselfByAnotherNumberCorrectly() {
		// Arrange
		Complex a = new Complex(4, 5);
		Complex b = new Complex(2, 3);
		
		double real = (4.0 * 2.0 + 5.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
    	double imaginary = (2.0 * 5.0 - 4.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
		
		// Act
		a.divide(b);
		
		// Assert
		assertEquals("Real part of a is", real, a.getReal(), 0.0);
		assertEquals("Imaginary part of a is", imaginary, a.getImaginary(), 0.0);		
	}

}

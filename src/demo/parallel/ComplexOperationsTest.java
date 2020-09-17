package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexOperationsTest {
	
	private Complex valOne = new Complex(1,0);
	private Complex valZero = new Complex(0,0);
	private Complex valInf = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
	
	private boolean ComplexEqual(Complex a, Complex b, double epsilon)
	{
		if(Math.abs(a.re - b.re) > epsilon || Math.abs(a.im - b.im) > epsilon)
			return false;
		else
			return true;
	}
	
	@Test
	void testDivide() {
		Complex testA;
		Complex testB;
		Complex testRes;
		double epsilon = 0.000001; //Double.MIN_NORMAL;
		
		testA = new Complex(5, 5);
		testB = new Complex(5, 5);
		testA.divide(testB);
		assertTrue(ComplexEqual(testA, valOne, epsilon));
		
		testA.divide(valZero);
		assertTrue(ComplexEqual(testA, valInf, epsilon));
		
		testA = new Complex(10, -5);
		testB = new Complex(-1, 2);
		testRes = new Complex(-4, -3);
		testA.divide(testB);
		assertTrue(ComplexEqual(testA, testRes, epsilon));
		
	}

	@Test
	void testLn() {
		Complex testA = new Complex(Math.exp(8), 0);
		Complex testRes;
		double epsilon = 0.000000001;
		
		testA.ln();
		testRes = new Complex(8, 0);
		assertTrue(ComplexEqual(testA, testRes, epsilon));
		
		testA = new Complex(0, -1);
		testA.ln();
		testRes = new Complex(0, -Math.PI / 2);
		assertTrue(ComplexEqual(testA, testRes, epsilon));
		
		testA = new Complex(-1, -1);
		testA.ln();
		testRes = new Complex(Math.log(Math.sqrt(2)), -Math.PI*3/4);
		assertTrue(ComplexEqual(testA, testRes, epsilon));
	}

}

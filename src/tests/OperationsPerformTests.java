package tests;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class OperationsPerformTests {


	@Test
	public void testComplexDivide() throws Exception{
		Complex a = new Complex(7, 12);
		Complex b = new Complex(3, 4);
		a.divide(b);
		assertEquals(2.76, a.getRe(), 0.01);
		assertEquals(0.32, a.getIm(), 0.01);
	}

	@Test
	public void testComplexSquare() throws Exception{
		Complex a = new Complex(1.0, -1.0);
		a.square();

		assertEquals(0, a.getRe(), 0.01);
		assertEquals(-2, a.getIm(), 0.01);
	}

	@Test
	public void testComplexSin() throws Exception{
		Complex a = new Complex(3, -5);
		double reExpected = Math.sin(a.getRe()) * Math.cosh(a.getIm());
		double imExpected = Math.cos(a.getRe()) * Math.sinh(a.getIm());
		Complex sinus = a.sin();

		assertEquals(reExpected, sinus.getRe(), 0);
		assertEquals(imExpected, sinus.getIm(), 0);
	}

	@Test
	public void testComplexCos() throws Exception{
		Complex a = new Complex(3, -5);
		double reExpected = Math.cos(a.getRe()) * Math.cosh(a.getIm());
		double imExpected = -Math.sin(a.getRe()) * Math.sinh(a.getIm());
		Complex cosinus = a.cos();

		assertEquals(reExpected, cosinus.getRe(), 0);
		assertEquals(imExpected, cosinus.getIm(), 0);
	}
}

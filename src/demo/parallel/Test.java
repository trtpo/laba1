package demo.parallel;

import static org.junit.Assert.assertEquals;

public class Test {

	@org.junit.Test
	public void test_minus() throws Exception {
		
		Complex a = new Complex(10, 10);
		Complex b = new Complex(7, 5);
		
		a.minus(b);
		
		assertEquals("Real part:", 3.0, a.get_real(), 0.0);
		assertEquals("Imaginary part:", 5.0, a.get_imag(), 0.0);
	}
	
	@org.junit.Test	
	public void test_divide() throws Exception {
		
		Complex a = new Complex(4, 5);
		Complex b = new Complex(2, 3);
		
		double real = (4.0 * 2.0 + 5.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
		double imag = (2.0 * 5.0 - 4.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
		
		a.divide(b);
		assertEquals("Real part:", real, a.get_real(), 0.0);
		assertEquals("Imaginary part:", imag, a.get_imag(), 0.0);
	}
}

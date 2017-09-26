package demo.parallel;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test_minus() throws Exception {
		
		Complex complex_1 = new Complex(10, 8);
		Complex complex_2 = new Complex(2, 1);
		Complex expected_result = new Complex(8, 7);
		
		Complex test_result = complex_1.minus(complex_2);
			
		double expected_real = expected_result.get_real();
		double test_real = test_result.get_real();
		
		double expected_imag = expected_result.get_imag();
		double test_imag = test_result.get_imag();
					
		double DELTA = 1e-15;	//delta to make assertEquals accept double type
			
		assertEquals(expected_real, test_real, DELTA);
		assertEquals(expected_imag, test_imag, DELTA);
	}

	@org.junit.Test	
	public void test_divide() throws Exception {
		
		Complex complex_1 = new Complex(10, 10);
		Complex complex_2 = new Complex(2, 2);
		Complex expected_result = new Complex(5, 0);		
		
		Complex test_result = complex_1.divide(complex_2);
				
		double expected_real = expected_result.get_real();
		double test_real = test_result.get_real();
		
		double expected_imag = expected_result.get_imag();
		double test_imag = test_result.get_imag();
					
		double DELTA = 1e-15;	//delta to make assertEquals accept double type
			
		assertEquals(expected_real, test_real, DELTA);
		assertEquals(expected_imag, test_imag, DELTA);
	}
}
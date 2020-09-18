package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComplexNumbersOperationsTest {
	
	@Test
	void testArgumentCalculation() {
		Complex c = new Complex(0, 0);
		assertEquals(0, c.argument(), "Argument calculation failed!");
		
		Complex c0 = new Complex(5, 0);
		assertEquals(0, c0.argument(), "Argument calculation failed!");
		
		Complex c1 = new Complex(0, -5);
		assertEquals(Math.PI * -0.5, c1.argument(), "Argument calculation failed!");
		
		Complex c2 = new Complex(0, 5);
		assertEquals(Math.PI * 0.5, c2.argument(), "Argument calculation failed!");
		
		Complex c3 = new Complex(4, 4);
		assertEquals(Math.PI / 4.0, c3.argument(), "Argument calculation failed!");
	}
	
	@Test
	void testExponentiation() {
		Complex c = new Complex(2.3, 4.5);
		c.pow(0);
		assertEquals(c.getIm(), 0, "Exponentiation failed");
		assertEquals(c.getReal(), 1, "Exponentiation failed");
		
		Complex c0 = new Complex(4, 3);
		c0.pow(3);
		assertEquals((int)c0.getReal(), -44, "Exponentiation failed");
		assertEquals(c0.getIm(), 117, "Exponentiation failed");
		
		Complex c1 = new Complex(43.2, 17.2);
		c1.pow(1);
		assertEquals(c1.getReal(), 43.2, "Exponentiation failed");
		assertEquals(c1.getIm(), 17.2, "Exponentiation failed");
		
		Complex c2 = new Complex(2.1, 4);
		c2.pow(3);
		assertEquals(c2.getReal(), -91.53900000000003, "Exponentiation failed");
		assertEquals(c2.getIm(), -11.079999999999961, "Exponentiation failed");
	}
}

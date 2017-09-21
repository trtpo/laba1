package demo.parallel;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class UnitTest {
	public class ComplexTest {

	}

	private Complex a;
	private Complex b;
	private Complex c;

	@Before
	public void setStartParametres() {

		a = new Complex(5, 75);
		b = new Complex(66, 35);
		c = new Complex(-5, 0);
	}

	@Test
	public void testsub() throws Exception {
		Complex result = a.sub(b);
		assertTrue(result.getReal() == -61.0);
		assertTrue(result.getImage() == 40.0);
	}

	@Test
	public void testsub1() throws Exception {
		Complex result = a.sub(c);
		assertTrue(result.getReal() == 10.0);
		assertTrue(result.getImage() == 75.0);
	}

	@Test
	public void testsub2() throws Exception {
		Complex result = a.sub(a);
		assertTrue(result.getReal() == 0.0);
		assertTrue(result.getImage() == 0.0);
	}
	
	@Test
	public void testsub3() throws Exception {
		Complex result = b.sub(a);
		assertTrue(result.getReal() == 61.0);
		assertTrue(result.getImage() == -40.0);
	}

}

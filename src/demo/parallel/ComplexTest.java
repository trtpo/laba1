package demo.parallel;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexTest {

	@Test
	public void testMinus() {
        Complex a = new Complex(7, 6);
        Complex b = new Complex(1, 5);
        Complex result = a.minus(b);
        assertEquals(new Complex(6, 1), result);
	}

}

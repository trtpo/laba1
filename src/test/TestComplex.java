package test;

import demo.parallel.Complex;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.Random;

/**
 * Test for Complex numbers (JUnit 4.12)
 * Created by Bobrovskiy
 */
@RunWith(JUnit4.class)
public class TestComplex extends Assert {

	@Test
	public void testSub() {
		double real;
		double imag;
		double delta = 4E-10;
		Random random = new Random();
		for (int o = 0; ++o < 100;) {
			real = random.nextDouble();
			imag = random.nextDouble();
			double r = random.nextDouble();
			double i = random.nextDouble();
			Complex c = new Complex(real, imag);
			c.sub(new Complex(r, i));
			assertEquals(c.real(), real - r, delta);
			assertEquals(c.imag(), imag - i, delta);
		}
	}

	@Test
	public void testDiv() {
		double real;
		double imag;
		double delta = 4E-8;
		Random random = new Random();
		for (int o = 0; ++o < 100;) {
			real = random.nextDouble();
			imag = random.nextDouble();
			double r = random.nextDouble();
			double i = random.nextDouble();
			Complex c = new Complex(real, imag);
			Complex c2 = new Complex(r, i);
			c.mul(c2).div(c2);
			assertEquals(c.real(), real, delta);
			assertEquals(c.imag(), imag, delta);
		}
	}
}

package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OperationsTest
{
	@Test
	@DisplayName("Sum of two complex numbers must me the same " +
			"as the sum of imaginary and real part of each of them")
	public void plus()
	{
		Complex z1 = new Complex(1, 2);
		Complex z2 = new Complex(10, 10);
		Complex sum = new Complex(11, 12);

		Complex actualSum = z1.plus(z2);
		Assertions.assertEquals(actualSum.re(), sum.re());
		Assertions.assertEquals(actualSum.im(), sum.im());
	}

	@Test
	public void times()
	{
		Complex z1 = new Complex(12, 9);
		Complex z2 = new Complex(17, 8);
		Complex m = new Complex(132, 249);

		Complex actualm = z1.times(z2);
		Assertions.assertEquals(actualm.re(), m.re());
		Assertions.assertEquals(actualm.im(), m.im());
	}

	@Test
	public void sub()
	{
		Complex z1 = new Complex(12, 9);
		Complex z2 = new Complex(17, 8);
		Complex diff = new Complex(-5, 1);

		Complex actualDiff = z1.sub(z2);
		Assertions.assertEquals(actualDiff.re(), diff.re());
		Assertions.assertEquals(actualDiff.im(), diff.im());
	}

	@Test
	public void cos()
	{
		Complex z1 = new Complex(12, 9);
		Complex cos = new Complex(3419, 2174);
		Complex actualCos = z1.cos();
		Assertions.assertEquals(Math.round(actualCos.im()), cos.im());
		Assertions.assertEquals(Math.round(actualCos.re()), cos.re());
	}
}

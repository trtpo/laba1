package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationsTest
{
	@Test
	public void plus()
	{
		Complex z1 = new Complex(1, 2);
		Complex z2 = new Complex(10, 10);
		Complex sum = new Complex(11, 12);

		Assertions.assertEquals(z1.plus(z2).re(), sum.re());
		Assertions.assertEquals(z1.plus(z2).im(), sum.im());
	}

	@Test
	public void times()
	{
		Complex z1 = new Complex(12, 9);
		Complex z2 = new Complex(17, 8);
		Complex m = new Complex(132, 249);

		Assertions.assertEquals(z1.times(z2).re(), m.re());
		Assertions.assertEquals(z1.times(z2).im(), m.im());
	}

	@Test
	public void sub()
	{
		Complex z1 = new Complex(12, 9);
		Complex z2 = new Complex(17, 8);
		Complex diff = new Complex(-5, 1);

		Assertions.assertEquals(z1.sub(z2).im(), diff.im());
		Assertions.assertEquals(z1.sub(z2).re(), diff.re());
	}

	@Test
	public void cos()
	{
		Complex z1 = new Complex(12, 9);
		Complex cos = new Complex(3418, 2173);

		Assertions.assertEquals(Math.round(z1.cos().im()), cos.im());
		Assertions.assertEquals(Math.round(z1.cos().re()), cos.re());
	}
}

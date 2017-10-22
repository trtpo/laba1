package demo.parallel;
 
 import junit.framework.TestCase;
 
 public class TestComplex extends TestCase {
 	
 	public void testPlus()
 	{
 		Complex a = new Complex(1,2);
 		Complex b = new Complex(2,2);
 		a.plus(b);
 		
 		assertEquals((double)3, a.getReal());
 		assertEquals((double)4, a.getImage());
 	}
 	public void testIncrementPlus()
 	{
 		Complex a = new Complex(1,2);
 		Complex b = new Complex(2,2);
 		a.increment(a);
 		b.increment(b);
 		
 		assertEquals((double)5, a.getReal());
 		assertEquals((double)6, a.getImage());
 	}
 	public void testDecrementPlus()
 	{
 		Complex a = new Complex(1,2);
 		Complex b = new Complex(2,2);
 		a.decrement(a);
 		b.decrement(b);
 		
 		assertEquals((double)1, a.getReal());
 		assertEquals((double)2, a.getImage());
 	}
 
 	public void testTimes()
 	{
 		Complex a = new Complex(1,2);
 		Complex b = new Complex(2,2);
 		a.times(b);
 		
 		assertEquals((double)-2, a.getReal());
 		assertEquals((double)6, a.getImage());
 	}
 	

 	
 	public void testdivision()
 	{
 		Complex a = new Complex(7,-4);
 		Complex b = new Complex(3,2);
 		a.division(b);
 		
 		assertEquals((double)1, a.getReal());
 		assertEquals((double)-2, a.getImage());
 	}
 }
 
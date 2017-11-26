package demo.parallel;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import demo.parallel.Complex;


public class myTest {
	 Complex a = new Complex(26,-3);
	 Complex b = new Complex(8, 45);
	 @Test
	 public void TestDiv() throws Exception {
		         Complex res = a.div(b);
		         assertEquals(0.0349, res.getReal(), 0.0001);
		         assertEquals(-0.5715, res.getImag(), 0.0001);
		         System.out.println("TestDiv ok");
		         

	 }
		 
	 @Test
	 public void TestSub() throws Exception {
		         Complex res = a.sub(b);
		         assertEquals(18, res.getReal(), 1);
		         assertEquals(-48,res.getImag(), 1);
		         System.out.println("TestSub ok");

	 }
	
	

}

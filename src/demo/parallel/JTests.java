package demo.parallel;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class JTests extends TestCase{
	private Complex current;
	
	@Before
	public void init() throws Exception {
		current = new Complex(5,3);
	}
	
	@Test
	public void Tests() throws Exception {
    	assertNotNull("Test for re and im functions was crashed",new Complex(current.getRe()-5,current.getIm()-3));		
		assertEquals("Test for conjugate fonction was crashed",current,current.conjugate,0.0000001);		
        assertNull("Test for minus finction aws crashed",current.minus(current));	
	}
}

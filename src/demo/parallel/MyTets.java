package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyTets {

	@Test
	void test() {
		Complex result = new Complex(1, 1).mun(new Complex(2, 2));
		
		assertEquals(result.GetRe(), 0);
		assertEquals(result.GetIm(), 4);
	}

}

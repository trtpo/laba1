package demo.parallel;

import org.junit.*;

public class ComplexTest extends  Assert {
    @Test
    public void plus() throws Exception {
       assertFalse(((new Complex(1,1)).plus(new Complex(1,1)).equals(new Complex(2,3))));
       assertTrue((((new Complex(1,1)).plus(new Complex(1,1))).printReal() == ((new Complex(2,2)).printReal())));
    }

    @Test
    public void minus() throws Exception {
        assertFalse(((new Complex(1,1)).minus(new Complex(1,1)).equals(new Complex(0,0))));
        assertTrue((((new Complex(1,1)).minus(new Complex(1,1))).printReal() == ((new Complex(0,0)).printReal())));
    }

}
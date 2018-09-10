package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void minusic() {
        Complex qwe = new Complex(10,20);
        qwe.minusic(new Complex(5,10));
        assertEquals(qwe.getRe(),5,0);
        assertEquals(qwe.getIm(),10,0);
    }
}
package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void cos()
    {

        Complex obj = new Complex(5,6);

        assertEquals(obj.cos().Get_im(),193.4276431213065,0.001);
        assertEquals(obj.cos().Get_re(),57.21909818460074,0.001);
    }
}
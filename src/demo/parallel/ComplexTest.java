package demo.parallel;

import org.junit.Assert;
import org.junit.Test;


public class ComplexTest extends Assert {
    @Test
    public void minusTest(){
        Complex a = new Complex(10.2, 5.5);
        Complex b = new Complex(-16.7, 3.1);
        assertNotNull(a.minus(b));
    }

    @Test
    public void cubeTest(){
        Complex a = new Complex(10.2, 5.5);
        assertNotNull(a.cube());
    }

    @Test
    public void specialTest(){
        Complex a = new Complex(10.2, 5.5);
        Complex b = new Complex(-16.7, 3.1);
        assertNotNull(a.special(b));
    }

}
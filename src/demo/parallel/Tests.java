package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    @Test
    public void minus_test1() {
    	Complex first = new Complex(7,3);
        Complex second = new Complex(5,8);
        Complex actual = first.minus(second);
        Complex expected = new Complex(2,-5);;

        assertEquals(expected.getReal(), actual.getReal(), 0);
        assertEquals(expected.getImage(), actual.getImage(), 0);
    }
    
    @Test
    public void minus_test2() {
    	Complex first = new Complex(10.89563425, 98.6523145);
        Complex second = new Complex(-1, 1);
        Complex actual = first.minus(second);
        Complex expected = new Complex(11.89563425, 97.6523145);;

        assertEquals(expected.getReal(), actual.getReal(), 0);
        assertEquals(expected.getImage(), actual.getImage(), 0);
     
    }
    
    @Test
    public void minus_test3() {
    	Complex first = new Complex(-8.78, -6);
        Complex second = new Complex(6, -6);
        Complex actual = first.minus(second);
        Complex expected = new Complex(-14.78, 0);;

        assertEquals(expected.getReal(), actual.getReal(), 0);
        assertEquals(expected.getImage(), actual.getImage(), 0);
        
    }
 
} 
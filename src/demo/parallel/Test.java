package demo.parallel;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test {

     @Test
     public void testSub() {
         Complex a = new Complex(5, 5);
         Complex b = new Complex(3, 2);

         a.sub(b);

         assertTrue("Substraction fails ", a.im != 2.0 && a.im != 3.0);
        }

    }

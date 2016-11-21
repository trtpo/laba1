 package demo.parallel;

 import static org.junit.Assert.*;

 import org.junit.Test;

 public class MyClass {

     @Test
     public void testDiv() {
         Complex a = new Complex(1, 1);
         Complex b = new Complex(1, 1);


         assertTrue("thay are not complex", a.trying(b));


         //assertTrue("Divide assert Failed! Expected 1.0, Got " + c, c >= 1.0 && c <= 1.000000000000001);
        }

    }



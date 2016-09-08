package demo.parallel;
 
 import static org.junit.Assert.*;
 import org.junit.Before;
 
 /**
  * Created by JeniaEfimov on 08.09.2016.
  */
 public class ComplexNumberTest {
 
     Complex complexNumber;
 
     @Before public void setUp(){
         complexNumber = new Complex(2, 3);
     }
 
     @org.junit.Test
     public void plus_function_test() throws Exception {
         complexNumber.plus(new Complex(6, 7));
         assertEquals(8, complexNumber.getRe(), 0.0001);
         assertEquals(10, complexNumber.getIm(), 0.0001);
     }
 
     @org.junit.Test
     public void minus_function_test() throws Exception {
         complexNumber.minus(new Complex(6, 7));
         assertEquals(-4, complexNumber.getRe(), 0.0001);
         assertEquals(-4, complexNumber.getIm(), 0.0001);
     }
 
     @org.junit.Test
     public void times_function_test() throws Exception {
         complexNumber.times(new Complex(6, 7));
         assertEquals(-9, complexNumber.getRe(), 0.001);
         assertEquals(32, complexNumber.getIm(), 0.001);
     }
 }
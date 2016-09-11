package demo.parallel;

import static org.junit.Assert.*;

/*Test*/

 public class ComplexTest {
    private Complex _complexTest;
 @org.junit.Before
    public void setUp() throws Exception {
     _complexTest = new Complex(1,2);
   }

 /*Test for subtraction*/

 @org.junit.Test
  public void subtraction() throws Exception {
        _complexTest.subtraction(new Complex(1,-1));
        assertEquals("Fail subtraction", 0,_complexTest.getRe(), 0.0001);
        assertEquals("Fail subtraction", 3,_complexTest.getIm(), 0.0001);
    }

  /*Test for the division operation*/

  @org.junit.Test
  public void division() throws Exception {
       _complexTest.division(new Complex(2,-1));
       assertEquals("Fail division", 0,_complexTest.getRe(),0.0001);
       assertEquals("Fail division", 1,_complexTest.getIm(),0.0001);
   }
}
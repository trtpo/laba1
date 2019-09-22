package demo.parallel;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class ComplexTest {

  private Complex a;

  @BeforeEach
  void setUp() {
   a = new Complex(2,3);
  }

  @Test
  void minus() {
   Complex b = new Complex(1,1);
   Complex result;
   result = a.minus(b);

   Assert.assertEquals(result,new Complex(1,2));
  }

  @Test
  void divide() {
   Complex b = new Complex(4,5);
   Complex result;
   result = a.divide(b);

   Assert.assertEquals(result.getRe(), 0.56, 0.01);
   Assert.assertEquals(result.getIm(), 0.048, 0.01);
  }
}

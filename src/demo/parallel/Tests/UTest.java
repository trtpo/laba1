package demo.parallel.Tests;
import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class UTest {





        @Test
        public void RaisingOk(){
            Complex expect = new Complex(1, 0);
            Complex real = new Complex(2, 3).raising(0);
            assertEquals(expect, real);
        }




}

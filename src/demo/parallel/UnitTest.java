package demo.parallel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static org.junit.Assert.assertEquals;

        /**
         * Created by Никита on 15.09.2016.
 */
        public class UnitTest {
     private Complex Sin=new Complex(0,0);
     private Complex Cos=new Complex(0,0 );

             @Before
     public void setUp() throws Exception {
                 Sin = Sin.sinus(new Complex(3, 4));
                 Cos = Cos.cosinus(new Complex(3, 4));
             }

            @Test
     public void testSinAndCos() throws Exception {
                       assertEquals(-27.0168132580039, Sin.getIm(), 0.0001);
                       assertEquals(-27.0349456030, Cos.getRe(), 0.0001);
                   }

 }
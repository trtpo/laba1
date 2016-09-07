package demo.parallel;


import org.junit.Test;
import org.junit.Before;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;
/**
 * Created by Nickolay on 07.09.2016.
 */
public class ComplexTesting {

        private Complex complexNumber;

        @Before public void setUp(){
            complexNumber = new Complex(4,6);
        }

        @Test public void divide() throws Exception{
            complexNumber.divide(new Complex(2,3));
            assertEquals(2,complexNumber.getRe(),0.1);
            assertEquals(0,complexNumber.getIm(),0.01);
        }

        @Test public void plus() throws Exception{
            complexNumber.plus(new Complex(3,4));
            assertEquals(7,complexNumber.getRe(),0.0001);
            assertEquals(10,complexNumber.getIm(),0.0001);
        }

        @Test public void minus() throws Exception{
            complexNumber.minus(new Complex(3,4));
            assertEquals(1,complexNumber.getRe(),0.0001);
            assertEquals(2,complexNumber.getIm(),0.0001);
        }
    }



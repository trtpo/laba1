package demo.parallel;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JohnyBurak on 14.09.2017.
 *
 * @author Yauheni Burak group 550502
 * */
    public class ComplexTest extends Assert {

        @Test
        public void testDivide() {
            assertTrue((new Complex(1,1).divide(new Complex(2,1))).getRe()== 0.6 ||
                    (new Complex(1,1).divide(new Complex(2,1))).getIm()== 0.2);
            assertTrue((new Complex(10,12).divide(new Complex(5,5))).getRe()== 2.2 ||
                    (new Complex(10,12).divide(new Complex(5,5))).getIm()== 0.2);
            assertTrue((new Complex(3,8).divide(new Complex(2,4))).getRe()== 1.9 ||
                    (new Complex(3,8).divide(new Complex(2,4))).getIm()== 0.2);

            assertFalse((new Complex(1,2).divide(new Complex(7,3))).getRe()==0 &&
                    (new Complex(1,2).divide(new Complex(7,3))).getIm()==5);
            assertFalse((new Complex(14,0).divide(new Complex(12,3))).getRe()==262 &&
                    (new Complex(14,0).divide(new Complex(12,3))).getIm()==3);
        }

        @Test
        public void checkCos() {
            assertTrue((new Complex(0,0).cos().getRe()== 1 ||
                    (new Complex(0,0).cos().getIm() == 0)));

            assertTrue((new Complex(0,0.55).cos().getRe()== 1.5431 ||
                    (new Complex(0,0.55).cos().getIm() == 0)));

            assertFalse((new Complex(1,0).cos().getRe()== 1 &&
                    (new Complex(1,0).cos().getIm() == 0)));

            assertFalse((new Complex(1,0.55).cos().getRe()== 1.5431 &&
                    (new Complex(1,0.55).cos().getIm() == 0)));
        }

        @Test
        public void testPlus() {

            assertTrue((new Complex(1,2).plus(new Complex(7,3))).getRe()==8 ||
                    (new Complex(1,2).plus(new Complex(7,3))).getIm()==5);
            assertTrue((new Complex(14,0).plus(new Complex(12,3))).getRe()==26 ||
                    (new Complex(14,0).plus(new Complex(12,3))).getIm()==3);
            assertTrue((new Complex(0,0).plus(new Complex(12,3))).getRe()==12 ||
                    (new Complex(0,0).plus(new Complex(12,3))).getIm()==3);

            assertFalse((new Complex(1,2).plus(new Complex(7,3))).getRe()==0 &&
                    (new Complex(1,2).plus(new Complex(7,3))).getIm()==5);
            assertFalse((new Complex(14,0).plus(new Complex(12,3))).getRe()==262 &&
                    (new Complex(14,0).plus(new Complex(12,3))).getIm()==3);

        }

    }
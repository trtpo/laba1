import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        assertTrue(new Complex(10.3,2.1).minus(new Complex(7.9,-4)).equals(new Complex(2.4,6.1)), "Test for simple subtraction #1.");
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertTrue(new Complex(1.5,1.6).divide(new Complex(0.7,3.4)).equals(new Complex((double)649/1205,-(double)398/1205)), "Test for simple division with the same signs.");
        assertTrue(new Complex(2.3,1.1).divide(new Complex(-10.7,3.4)).equals(new Complex(-(double)2087/12605,-(double)1959/12605)), "Test for simple division with the different signs #1.");
        assertTrue(new Complex(-3.4,0.9).divide(new Complex(3.9,-1.7)).equals(new Complex(-(double)1479/1810,-(double)227/1810)), "Test for simple division with the different signs #2.");
        assertTrue(new Complex(2.7,-1.3).divide(new Complex(3.3,2.1)).equals(new Complex((double)103/255,-(double)166/255)), "Test for simple division with the different signs #3.");

        assertTrue(new Complex(19.8,0).divide(new Complex(23.87,-39.21)).equals(new Complex((double)472626/2107201,(double)776358/2107201)), "Test for division with one value =0 #1.");
        assertTrue(new Complex(0,1.37).divide(new Complex(5.87,4.21)).equals(new Complex((double)57677/521810 ,(double)80419/521810 )), "Test for division with one value =0 #2.");
        assertTrue(new Complex(2,1.84).divide(new Complex(5.87,0)).equals(new Complex((double)200/587,(double)184/587)), "Test for division with one value =0 #3.");
        assertTrue(new Complex(4.1,1.56).divide(new Complex(0,3.1)).equals(new Complex((double)78/155,-(double)41/31)), "Test for division with one value =0 #4.");
    }

    @org.junit.jupiter.api.Test
    void getCos() {
        assertTrue(new Complex(Math.PI /6,0).getCos().equals(new Complex(Math.sqrt(3)/2,0)),"Test for simple cos(z) with arg = PI/6");
        assertTrue(new Complex(2*Math.PI/3 ,0).getCos().equals(new Complex(-0.5,0)),"Test for simple cos(z) with arg =2PI/3");
    }

    @org.junit.jupiter.api.Test
    void pow() {
        assertTrue(new Complex(2.3,-1.6).pow(4).equals(new Complex(-46.7167,-40.1856)), "Test for degree 4.");
        assertTrue(new Complex(3.1,-4.2).pow(5).equals(new Complex(-145.71209,3873.55038)),"Test for degree 5.");
        assertTrue(new Complex(7,-11).pow(0).equals(new Complex(1,0)), "Test for degree 0.");
        assertTrue(new Complex(7.2,-11.6).pow(1).equals(new Complex(7.2,-11.6)), "Test for degree 1.");
    }
}
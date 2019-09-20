package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    private Complex[] minuend;
    private Complex[] subtrahend;
    private Complex[] dividend;
    private Complex[] divider;
    private Complex[] expectedMinusResult;
    private Complex[] expectedDevideResult;

    @BeforeEach
    void setUp() {
        minuend = new Complex[]{new Complex(0,0),new Complex(-2,1),new Complex(5,-4),new Complex(345,743), new Complex(4,-7).plus(new Complex(-3, 6))};
        subtrahend = new Complex[]{new Complex(0,0),new Complex(6,70),new Complex(32,1),new Complex(345,743), new Complex(-3,6)};
        expectedMinusResult = new Complex[]{new Complex(0,0),new Complex(-8, -69),new Complex(-27,- 5),new Complex(0,0), new Complex(4, -7)};

        dividend = new Complex[]{new Complex(0,0),new Complex(1,1),new Complex(-320,-55),new Complex(210,-75), new Complex (245, -765).times(new Complex(-43, 62))};
        divider = new Complex[]{new Complex(1,0),new Complex(1,1),new Complex(2,1),new Complex(1,-2), new Complex(-43, 62)};
        expectedDevideResult = new Complex[]{new Complex(0,0),new Complex(1,0),new Complex(-139,42),new Complex(-12,-99), new Complex (245, -765)};
    }

    @Test
    void minusTest() {
        for (int i = 0; i < minuend.length; i++) {
            assertEquals(minuend[i].minus(subtrahend[i]).getIm(), expectedMinusResult[i].getIm());
            assertEquals(minuend[i].minus(subtrahend[i]).getRe(), expectedMinusResult[i].getRe());
        }
    }

    @Test
    void devide() {
        for (int i = 0; i < dividend.length; i++) {
            assertEquals(dividend[i].minus(divider[i]).getIm(), expectedDevideResult[i].getIm());
            assertEquals(dividend[i].minus(divider[i]).getRe(), expectedDevideResult[i].getRe());
        }
    }
}
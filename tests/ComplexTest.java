import demo.parallel.Complex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    private Complex[] minuend;
    private Complex[] subtrahend;
    private Complex[] dividend;
    private Complex[] divider;
    private Complex[] residual;
    private Complex[] quotient;

    @BeforeEach
    void setUpInput() {
        minuend = new Complex[]{new Complex(0,0),new Complex(-2,1),new Complex(5,-4),new Complex(345,743), new Complex(4,-7).plus(new Complex(-3, 6))};
        subtrahend = new Complex[]{new Complex(0,0),new Complex(6,70),new Complex(32,1),new Complex(345,743), new Complex(-3,6)};
        residual = new Complex[]{new Complex(0,0),new Complex(-8, -69),new Complex(-27,- 5),new Complex(0,0), new Complex(4, -7)};

        dividend = new Complex[]{new Complex(0,0),new Complex(1,1),new Complex(-320,-55),new Complex(210,-75)};
        divider = new Complex[]{new Complex(1,0),new Complex(1,1),new Complex(2,1),new Complex(1,-2)};
        quotient = new Complex[]{new Complex(0,0),new Complex(1,0),new Complex(-139,42),new Complex(73,69)};
    }

    @Test
    void minusTest() {
        for (int i = 0; i < minuend.length; i++) {
            assertEquals(minuend[i].minus(subtrahend[i]), residual[i]);
        }
    }

    @Test
    void divideTest() {
        for (int i = 0; i < dividend.length; i++) {
            assertEquals(dividend[i].by(divider[i]), quotient[i]);
        }
    }
}

import demo.parallel.Complex;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    private Complex[] arrayA;
    private Complex[] arrayB;
    private Complex[] minusResults;
    private Complex[] sinResults;
    private Complex[] cosResults;

    @BeforeEach
    void setUpInput() {
        arrayA = new Complex[]{new Complex(0,0),new Complex(-2,1),new Complex(5,-4)};
        arrayB = new Complex[]{new Complex(0,0),new Complex(6,70),new Complex(32,1)};

        minusResults = new Complex[]{new Complex(0,0),new Complex(-8, -69),new Complex(-27,- 5)};
        sinResults = new Complex[]{new Complex(0,0),new Complex(-1.403, -0.489),new Complex(-26.186,- 7.741)};
        cosResults = new Complex[]{new Complex(1,0),new Complex(-0.642, +1.069),new Complex(7.746,- 26.169)};
        }

    @Test
    void minusTest() {
        for (int i = 0; i < arrayA.length; i++) {
            assertEquals(arrayA[i].minus(arrayB[i]), minusResults[i]);
        }
    }

    @Test
    void sinTest() {
        for (int i = 0; i < arrayA.length; i++) {
            assertEquals(arrayA[i].sin(), sinResults[i]);
        }
    }

    @Test
    void cosTest() {
        for (int i = 0; i < arrayA.length; i++) {
            assertEquals(arrayA[i].cos(), cosResults[i]);
        }
    }
}

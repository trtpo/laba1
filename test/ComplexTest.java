import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComplexTest {

    private Complex a;
    private Complex b;

    @BeforeEach
    void init(){
        a = new Complex(19.32,93.22);
        b = new Complex(51.56,82.22);
    }

    @Test
    void minus_resultOfComplexNumberSubtraction(){
        Complex result = a.minus(b);

        Assertions.assertEquals(19.32 - 51.56,result.getRe(),0.0001);
        Assertions.assertEquals(93.22-82.22,result.getIm(),0.0001);
    }

    @Test
    void special_factOfDifferenceWithThePlusMethod() {

        Complex result = a.special(b);

        Assertions.assertNotEquals(19.32 + 51.56, result.getRe(), 0.00001);
        Assertions.assertNotEquals(93.22 + 82.22, result.getIm(), 0.00001);
    }

}

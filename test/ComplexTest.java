import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComplexTest {

    private Complex a;
    private Complex b;
    @BeforeEach
    void complex(){
        a = new Complex(14.5, 567.23);
        b = new Complex(234.5, 56.24);
    }
    @Test
    void minus_resultOfSubtraction(){
        Complex result = a.minus(b);

        Assertions.assertEquals(14.5-234.5,result.getRe(),0.0001);
        Assertions.assertEquals(567.23-56.24,result.getIm(),0.0001);

    }
}

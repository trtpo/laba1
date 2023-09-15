package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComplexTest {
    @Test
    void square(){
        var complex = new Complex(2, 3);
        var value = complex.square();
        Assertions.assertTrue(value.getRe() == -5 && value.getIm() == 12);
    }

    @Test
    void add(){
        var complex = Complex.add(new Complex(5,12), new Complex(2,22));
        Assertions.assertTrue(complex.getRe() == 7 && complex.getIm() == 34);
    }
}

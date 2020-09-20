package unitTests;
import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests
{
    @Test
    public void sin() {
        Complex complex1 = new Complex(90, 0);
        Complex complex2 = new Complex(1, 0);
//        Assertions.assertEquals(complex1.sin(), complex2);
        Assertions.assertEquals(Math.round(complex1.sin().getRe()), complex2.getRe());
        Assertions.assertEquals(Math.round(complex1.getIm()), complex2.getIm());
    }

    @Test
    public void plus() {
        Complex complex1 = new Complex(7, 3);
        Complex complex2 = new Complex(15, 24);
        Complex complex3 = new Complex(22, 27);
        Assertions.assertEquals(complex1.plus(complex2), complex3);
    }
}

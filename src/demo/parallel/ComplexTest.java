package demo.parallel;

import org.junit.Test;

public class ComplexTest {

    @Test
    public void minus() {
        Complex a = new Complex(5, 10);
        Complex b = new Complex(3, 5);
        Complex answer = new Complex(2, 5);
        Complex result = a.minus(b);

        assert answer.getRe() == result.getRe() &&
                answer.getIm() == result.getIm() :
                "Error in substraction : answer != result";
    }

    @Test
    public void divide() {
        Complex a = new Complex(5, 15);
        Complex b = new Complex(1, 2);
        Complex empty = new Complex(0, 0);

        Complex firstResult = a.clone();
        firstResult.divide(empty);

        assert firstResult.getRe() == a.getRe() &&
                firstResult.getIm() == a.getIm() :
                "Wrong divide: we can't delete on 0";

        Complex secondAnswer = new Complex (7, 1);
        Complex secondResult = a.clone();
        secondResult.divide(b);

        assert secondResult.getRe() == secondAnswer.getRe() &&
                secondResult.getIm() == secondAnswer.getIm() :
                "Error in division : answer != result";
    }
}

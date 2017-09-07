package demo.parallel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTasks {
    private Complex number_1;
    private Complex number_2;

    @BeforeEach
    public void setterForNumbers() {
        number_1 = new Complex(-1, 3);
        number_2 = new Complex(1, 2);
    }

    @Test
    public void divideZero() {
        Complex temp = number_1.div(new Complex(0, 0));
        assertEquals(temp.getRealPart(), 0, "As its illegal to divide on zero, so we get 0 in result");
        assertEquals(temp.getImagePart(), 0, "As its illegal to divide on zero, so we get 0 in result");
    }

    @Test
    public void normalDivide() {
        Complex temp = number_1.div(number_2);
        assertEquals(temp.getRealPart(), 1, "Real part of dividing");
        assertEquals(temp.getImagePart(), 1, "Image part of dividing");
    }

    @Test
    public void minusTesting() {
        Complex temp = number_1.minus(number_2);
        assertEquals(temp.getRealPart(), -2.0, "Real part of subtracting");
        assertEquals(temp.getImagePart(), 1.0, "Image part of subtracting");
    }
}
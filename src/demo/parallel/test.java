package demo.parallel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ComplexTest {
    @Test
    void div() {
        Complex test_1 = new Complex(1,1);
        Complex test_2 = new Complex (0,0);
        Complex res = test_1.div(test_2);
        assertTrue(test_2.getReal() != 0 || test_2.getImg() != 0);
        }
    }
} 
package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void div() {
        Complex  test_1 = new Complex(0,0);
        Complex res = new Complex(0,0);
        for (int i = 0; i < 256; i++) {
            for(int j = 0; j < 256; j++) {
                Complex test_2 = new Complex (i,j);
                res = test_1.div(test_2);
                double div_re = test_2.getReal();
                double div_img = test_2.getImg();
                assertTrue(div_img!=0 || div_re!= 0);
            }
        }
    }
}
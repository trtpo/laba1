package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void divide() {
        Complex  test = new Complex(0,0);
        Complex res = new Complex(0,0);
        int i=0;
        int j=0;
        for (i = 0; i < 256; i++) {
            for(j = 0; j < 256; j++) {
                Complex div = new Complex (i,j);
                //res = test.divide(div);
                double divRe = div.getReal();
                double divImg = div.getImg();
                /*if(divRe == 0 || divImg == 0) {
                    fail("Zero division error");
                }
                else if(test == res){
                }
                else {
                    fail("Something went wrong");
                }*/
            }
            res.divide(test);
            res.pr();
        }
    }
}


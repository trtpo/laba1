package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ComplexTest {
    
    @Test
    final void testDiv() {
        Complex  test_c = new Complex(0,0);
        Complex res = new Complex(0,0);
        int i = 0;
        int j = 0;
        
        for (i = 0; i < 256; i++) {
            for(j = 0; j < 256; j++) {
                Complex divid = new Complex (i,j);
                res = test_c.div(divid);
                double div_re = divid.getReal();
                double div_img = divid.getImg();
                if(div_re == 0|| div_img == 0) {
                    fail("Zero division error");
                }
                else if(test_c == res){
                    
                }
                else {
                    fail("Something went wrong");
                }
                
            }
            
        }
        
    }
    
}


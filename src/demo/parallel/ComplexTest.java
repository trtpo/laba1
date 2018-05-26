package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void newComplexOperation() {
        Complex tmp =new Complex(0,0);
        Complex result = new Complex(0,0);
        Complex tmp1;
        double real=0;
        double image=0;
        for(int i =0; i<100; i++){
            for(int j=0; j<100; j++){
                tmp1=new Complex(i,j);
                result=tmp.newComplexOperation(tmp1);
                real=result.getReal();
                image=result.getImage();
                assertTrue(real!=0 || image!=0);
            }
        }
    }
}
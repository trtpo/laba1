package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    @org.junit.jupiter.api.Test
    void checkRePartValidityOfTangentFunction1() {
        Complex a = new Complex(1,1);
        //  except = 0.2718, 1.0839
        double exceptedRe = 0.2718;
        assertEquals(exceptedRe, (double)Math.round(a.tan().getReAndImValues()[0] * 10000d) / 10000d);
    }

    @org.junit.jupiter.api.Test
    void checkImPartValidityOfTangentFunction1() {
        Complex a = new Complex(1,1);
        double exceptedIm = 1.0839;
        assertEquals(exceptedIm, (double)Math.round(a.tan().getReAndImValues()[1] * 10000d) / 10000d);
    }

    @org.junit.jupiter.api.Test
    void checkRePartValidityOfTangentFunction2() {
        Complex a = new Complex(2.45,-1.45);
        //   except = -0.1056, -0.974
        double exceptedRe = -0.1056;
        assertEquals(exceptedRe, (double)Math.round(a.tan().getReAndImValues()[0] * 10000d) / 10000d);
    }

    @org.junit.jupiter.api.Test
    void checkImPartValidityOfTangentFunction2() {
        Complex a = new Complex(2.45,-1.45);
        double exceptedIm = -0.974;
        assertEquals(exceptedIm, (double)Math.round(a.tan().getReAndImValues()[1] * 10000d) / 10000d);
    }

    @org.junit.jupiter.api.Test
    void checkRePartValidityOfTangentFunction3() {
        Complex a = new Complex(0.001,1);
        //    except = 0.0004, 0.7616;
        double exceptedRe = 0.0004;
        assertEquals(exceptedRe, (double)Math.round(a.tan().getReAndImValues()[0] * 10000d) / 10000d);
    }

    @org.junit.jupiter.api.Test
    void checkImPartValidityOfTangentFunction3() {
        Complex a = new Complex(0.001,1);
        double exceptedIm = 0.7616;
        assertEquals(exceptedIm, (double)Math.round(a.tan().getReAndImValues()[1] * 10000d) / 10000d);
    }
}
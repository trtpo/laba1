package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    private Complex nullComplex;
    private Complex random1;
    private Complex negativeRe;
    private Complex negativeIm;
    private Complex neg;
    private Complex temp;

    @BeforeEach
    void init() {
        nullComplex = new Complex(0, 0);
        random1 = new Complex(2.4568486, 9.54555548);
        negativeRe = new Complex(-7.564856, 5.5645984);
        negativeIm = new Complex(2.6545454, -18.4545415);
        neg = new Complex(-1, -1);

    }

    @Test
    void sin() {
        temp = nullComplex.sin();
        assertTrue(temp.equals(nullComplex));

        temp = random1.sin();
        assertTrue(temp.equals(new Complex(4421.761271765428, -5415.254684662877)));

        temp = negativeRe.sin();
        assertTrue(temp.equals(new Complex(-125.09499848191258, 37.209766797438526)));

        temp = negativeIm.sin();
        assertTrue(temp.equals(new Complex(2.4206867711965363E7, 4.5707720584694386E7)));

        temp = neg.sin();
        assertTrue(temp.equals(new Complex(-1.2984575814159773, -0.6349639147847361)));
    }

    @Test
    void eyler() {
        temp = nullComplex.eyler();
        assertTrue(temp.equals(new Complex(1, 0)));

        temp = random1.eyler();
        assertTrue(temp.equals(new Complex(-11.58298480273868, -1.405806423939478)));

        temp = negativeRe.eyler();
        assertTrue(temp.equals(new Complex(3.901826036424241E-4, -3.412423434865832E-4)));

        temp = negativeIm.eyler();
        assertTrue(temp.equals(new Complex(13.123566987753055, 5.471592518543351)));

        temp = neg.eyler();
        assertTrue(temp.equals(new Complex(0.19876611034641298, -0.3095598756531122)));
    }
}
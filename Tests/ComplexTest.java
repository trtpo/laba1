package demo.parallel;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ComplexTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Complex.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void subtract() {

        Complex operationResult = new Complex(5, 10).subtract(new Complex(15, -2));
        assertEquals(operationResult.getRe(), 5 - 15);
        assertEquals(operationResult.getIm(), 10 - -2);

        operationResult = new Complex(0, 0).subtract(new Complex(1, -2));
        assertEquals(operationResult.getRe(), 0 - 1);
        assertEquals(operationResult.getIm(), 0 - -2);

        operationResult = new Complex(1, -2).subtract(new Complex(0, 0));
        assertEquals(operationResult.getRe(), 1);
        assertEquals(operationResult.getIm(), -2);

        operationResult = new Complex(12345, 54321).subtract(new Complex(-6789, 9876));
        assertEquals(operationResult.getRe(), 12345 - -6789);
        assertEquals(operationResult.getIm(), 54321 - 9876);
    }

    @org.junit.Test
    public void conjugate() {
        Complex operationResult = new Complex(5, -5).conjugate(new Complex(15, 10));
        assertEquals(operationResult.getRe(), (double)(5*15 + -5*10) / (15*15 + 10*10));
        assertEquals(operationResult.getIm(), (double)(-5*15 - 5*10) / (15*15 + 10*10));

        operationResult = new Complex(5, -5).conjugate(new Complex(1, 1));
        assertEquals(operationResult.getRe(), (double)(5 + -5) / (1 + 1));
        assertEquals(operationResult.getIm(), (double)(-5 - 5) / (1 + 1));

        operationResult = new Complex(0, 0).conjugate(new Complex(15, 10));
        assertEquals(operationResult.getRe(), 0);
        assertEquals(operationResult.getIm(), 0);
    }
}

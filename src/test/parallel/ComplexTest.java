package test.parallel;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author v.tarasevich
 * @version 1.0
 * @since 17.09.2017 19:59
 */
public class ComplexTest extends Assert {

    private static final String errorPattern;
    private static final Method powMethod;
    private static final Random random;

    static {
        try {
            errorPattern = "\nError in method : %s , %s\nExpected : (%f , %f) . Actual : (%f , %f)";
            random = new Random(System.currentTimeMillis());
            powMethod = Complex.class.getMethod("pow", int.class);
        } catch (Exception e) {
            throw new RuntimeException("There are no method \'pow\' in the Complex class");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void powNegNumTest() throws Exception {
        Complex complex = new Complex(1, 1);
        complex.pow(-514);
        System.out.println(String.format("Error in method : %s , %s",
                                         getMethodSignature(powMethod),
                                         Complex.class.toString())
                                        );
    }

    @Test
    public void powZeroTest() throws Exception {
        Complex complex = new Complex(1, 1);
        complex.pow(0);
        assertEquals(String.format(errorPattern,
                                    getMethodSignature(powMethod),
                                    Complex.class.toString(),
                                    1.,
                                    0.,
                                    complex.getRe(),
                                    complex.getIm()
                                  ),
                     complex,
                     new Complex(1, 0)
                    );
    }

    @Test
    public void powSimpleTest() throws Exception {
        Complex actual = new Complex(random.nextInt(100), random.nextInt(100));
        Complex expected = new Complex(actual.getRe(), actual.getIm());
        expected.times(expected);
        actual.pow(2);
        assertEquals(String.format(errorPattern,
                                    getMethodSignature(powMethod),
                                    Complex.class.toString(),
                                    expected.getRe(),
                                    expected.getIm(),
                                    actual.getRe(),
                                    actual.getIm()
                                  ),
                     expected,
                     actual
                    );
    }

    @Test
    public void powRandomTest() throws Exception {
        Complex complex = new Complex(0, 0);
        Complex correct;
        int n = 500_000;
        while (n-- > 0) {
            complex.setRe(random.nextInt(8));
            complex.setIm(random.nextInt(8));
            int deg = random.nextInt(10);
            correct = getCorrectAnswer(complex, deg);
            complex.pow(deg);
            assertEquals(String.format(errorPattern,
                                        getMethodSignature(powMethod),
                                        Complex.class.toString(),
                                        correct.getRe(),
                                        correct.getIm(),
                                        complex.getRe(),
                                        complex.getIm()
                                      ),
                         correct,
                         complex
                        );
        }
    }

    private Complex getCorrectAnswer(final Complex value, int deg) {
        Complex result = new Complex(value.getRe(), value.getIm());
        if( deg == 0) {
            return new Complex(1, 0);
        } else if (deg > 1) {
            Complex mult = new Complex(value.getRe(), value.getIm());
            while (deg-- > 1) {
                result.times(mult);
            }
        }
        return result;
    }

    private String getMethodSignature(Method method) {
        String result = "";
        try {
            result += method.getReturnType().getSimpleName();
            result += " " + method.getName();
            result += "( int );";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
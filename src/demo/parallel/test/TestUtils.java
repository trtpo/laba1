package demo.parallel.test;

public class TestUtils {
    public static final double APPROXIMATION = 0.01d;

    public static boolean testRange(Complex a, Complex b) {
        return Math.abs(Math.abs(a.getRe()) - Math.abs(b.getRe())) < APPROXIMATION
                && Math.abs(Math.abs(a.getIm()) - Math.abs(b.getIm())) < APPROXIMATION;
    }

}

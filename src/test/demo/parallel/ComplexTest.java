package demo.parallel;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ComplexTest {
    private static int BOUNDS = 10;
    private static double DELTA = 0.01;

    private static List<Double> parts = new ArrayList<>();

    private static List<Complex> line = new ArrayList<>();
    private static List<Complex> abscissa = new ArrayList<>();
    private static List<Complex> ordinate = new ArrayList<>();

    @BeforeClass
    public static void setUp(){
        for (int i = -BOUNDS; i < BOUNDS; i++){
            parts.add((double) i);
            line.add(new Complex(i, i));
            abscissa.add(new Complex(i, 0));
            ordinate.add(new Complex(0, i));
        }
    }

    @Test
    public void ordinateTest(){
        for (int i = 0; i < parts.size(); i++){
            Complex c = ordinate.get(i);
            double actual = c.getIm();
            double expected = parts.get(i);
            assertEquals(expected, actual, DELTA);
        }
    }

    @Test
    public void abscissaTest(){
        for (int i = 0; i < parts.size(); i++){
            Complex c = abscissa.get(i);
            double actual = c.getRe();
            double expected = parts.get(i);
            assertEquals(expected, actual, DELTA);
        }
    }

    @Test
    public void lineImTest(){
        for (int i = 0; i < parts.size(); i++){
            Complex c = line.get(i);
            double actualIm = c.getIm();
            double expected = parts.get(i);
            assertEquals(expected, actualIm, DELTA);
        }
    }
}

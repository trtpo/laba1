package demo.parallel;
import org.junit.rules.ErrorCollector;
import org.junit.Rule;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;


public class TestClass {
    @Rule
    public  ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void divisionTest() {
        Complex divider = new Complex(1,2);
        Complex dividend = new Complex(1,4);
        Complex result = dividend.division(divider);
        errorCollector.checkThat("Division test. Error in real part", result.getRealPart(),equalTo(1.8));
        errorCollector.checkThat("Division test. Error in imaginary part", result.getImaginaryPart(),equalTo(0.4));
    }
    @Test
    public void minusTest() {
        Complex minuend = new Complex(2,4);
        Complex subtrahend = new Complex(1,2);
        Complex result = minuend.minus(subtrahend);
        errorCollector.checkThat("Subtraction test. Error in real part", result.getRealPart(),equalTo(1.0));
        errorCollector.checkThat("Subtraction test. Error in imaginary part", result.getImaginaryPart(),equalTo(2.0));
    }
    @Test
    public void plusRealTest() {
        Complex comp = new Complex(2,4);
        Complex result = comp.plusReal(5);
        errorCollector.checkThat("Addition/subtraction with a real number test. Error in real part", result.getRealPart(),equalTo(7.0));
        errorCollector.checkThat("Addition/subtraction with a real number test. Error in imaginary part", result.getImaginaryPart(),equalTo(4.0));
    }
    @Test
    public void realNumberMultiplication() {
        Complex comp = new Complex(2,4);
        Complex result = comp.realNumberMultiplication(5);
        errorCollector.checkThat("Multiplication by a real number test. Error in real part", result.getRealPart(),equalTo(10.0));
        errorCollector.checkThat("Multiplication by a real number test. Error in imaginary part", result.getImaginaryPart(),equalTo(20.0));
    }
    @Test
    public void conjugateTest() {
        Complex comp = new Complex(2,4);
        comp.conjugate();
        errorCollector.checkThat("Search conjugate test. Error in real part", comp.getRealPart(),equalTo(2.0));
        errorCollector.checkThat("Search conjugate test. Error in imaginary part", comp.getImaginaryPart(),equalTo(-4.0));
    }
}

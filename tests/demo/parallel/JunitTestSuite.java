package demo.parallel;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({ComplexNumberMultiplicationTest.class,
ComplexNumberAdditionTest.class,
ComplexNumberSubtractionTest.class,
ComplexNumberDivisionTest.class})

public class JunitTestSuite {
}

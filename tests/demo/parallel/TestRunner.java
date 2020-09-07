package demo.parallel;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(JunitTestSuite.class);

        System.out.println("The number of tests run: " + result.getRunCount());
        System.out.println("The number of failed tests: " + result.getFailureCount());

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}

package demo.parallel;

public class RunTest {
    public static void main(String[] args){
        try{
            ComplexTest test = new ComplexTest();
            test.plus();
            test.subtract();
            test.times();
            test.divide();
            test.sinus();
            test.cosinus();
            test.length();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

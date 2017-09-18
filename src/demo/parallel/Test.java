import org.junit.Test;
import static org.juint.Assert;
import org.junit.After;
import org.junit.Before;

public class Test{
    private Complex a, b;

    @Before
    public void setUp() throws Exeption {
        a = new Complex(1, 1);
        b = new Complex(2, 2);
    }

    @Test
    public void divide() throws Exeption {
        a.divide(b);
        assertTrue("Error in divid method, 96  string in Complex file",  a.getReal() == 0.5 );
        assertTrue("Error in divid method, 97  string in Complex file",  a.getImage() == 0 );
    }

    @Test
    public void exp() throws Exeption {
        exp(a);
        assertTrue("Error in exp method, 107  string in Complex file",  a.getReal() == 1.46869393999741 );
        assertTrue("Error in exp method, 108  string in Complex file",  a.getImage() == 2.2873552872476 );
    }

    @Test
    public void cos() throws Exeption {
        cos(b);
        assertTrue("Error in divid method, 116  string in Complex file",  a.getReal() == -1.56562583533573 );
        assertTrue("Error in divid method, 117  string in Complex file",  a.getImage() == -3.29789483631676 );
    }
}

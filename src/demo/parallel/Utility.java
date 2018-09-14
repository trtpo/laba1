package demo.parallel;

import java.text.DecimalFormat;

public class Utility {

    public static double round(double d) {
        DecimalFormat df = new DecimalFormat("#.#");
        return Double.valueOf(df.format(d));
    }

}

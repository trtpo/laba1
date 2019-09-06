package demo.parallel;

public class FloatingComparator {

    public static<T extends Number> boolean checkIfEquals(T floating1, T floating2, T epsilon){
        if (floating1 instanceof Double && floating2 instanceof Double && epsilon instanceof Double) {
            return (Math.abs((Double)floating1 - (Double)floating2) < (Double)epsilon);
        } else if (floating1 instanceof Float&& floating2 instanceof Float && epsilon instanceof Float){
            return (Math.abs((Float)floating1 - (Float)floating2) < (Float)epsilon);
        }else{
            throw new IllegalArgumentException("Wrong types passed in floating point comparator function." +
                    "Possible types: float, double." +
                    "All arguments must be of same type.");
        }
    }
}

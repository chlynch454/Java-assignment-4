 public class MathUtils {
    public static int factorial(int n) throws IllegalArgumentException{
        if (n < 0) {
            throw new IllegalArgumentException("Value entered be >= 0");
        }
        else if (n > 16) {
            throw new IllegalArgumentException("Value entered be <= 16");
        }
        else {
            int fac = 1;
            for (int i=n; i>0; i--)
                fac *= i;
            return fac;
        }
    }
}

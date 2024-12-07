package hw55;

public class AECatcher {
    static double divide(double divisor, double divisible) {
        try {
            return divisor / divisible;
        } catch (ArithmeticException e) {
            System.out.println("Что-то не так : " + e.getLocalizedMessage());

        }
        return 0;
    }
}

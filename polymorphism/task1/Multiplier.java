package polymorphism.task1;

public class Multiplier {
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double multiply(double a, int b) {
        return a * b;
    }
}

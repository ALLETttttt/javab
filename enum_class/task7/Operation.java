package enum_class.task7;

public enum Operation {
    ADD {
        @Override
        double apply(double a, double b) {
            return a + b;
        }
    }, SUBTRACT {
        @Override
        double apply(double a, double b) {
            return a - b;
        }
    }, MULTIPLY {
        @Override
        double apply(double a, double b) {
            return a * b;
        }
    }, DIVIDE {
        @Override
        double apply(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        }
    };

    abstract double apply(double a, double b);

}

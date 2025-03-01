package enum_class.task7;


public class Main {
    public static void main(String[] args) {
        System.out.println("Addition: " + Operation.ADD.apply(10, 5));
        System.out.println("Subtraction: " + Operation.SUBTRACT.apply(12, 5));
        System.out.println("Multiplication: " + Operation.MULTIPLY.apply(103, 5));
        System.out.println("Division: " + Operation.DIVIDE.apply(10, 2));
    }
}

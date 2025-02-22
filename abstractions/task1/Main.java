package abstractions.task1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.printf("%.2f%n", circle.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.printf("%.2f", rectangle.area());
    }
}

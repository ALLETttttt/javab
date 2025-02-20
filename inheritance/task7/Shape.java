package inheritance.task7;

public class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }

    void draw(double radius) {
        System.out.printf("Drawing a shape with %s radius%n", radius);
    }

    void draw(int length, int width) {
        System.out.printf("Drawing some shape with length %s and width %s%n", length, width);
    }
}

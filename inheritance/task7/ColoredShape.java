package inheritance.task7;

public class ColoredShape extends Shape {
    private String color;

    public ColoredShape(String color) {
        this.color = color;
    }

    @Override
    void draw(double radius) {
        System.out.println("Drawing " + color + " Circle with radius " + radius);
    }
}

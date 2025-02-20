package inheritance.task7;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        shape.draw(5, 6);
        shape.draw(4);

        ColoredShape coloredShape = new ColoredShape("Blue");
        coloredShape.draw(3.0);
    }
}

package intro_to_oop.models;

public class Rectangle {
    int length;
    int width;

    public Rectangle() {
        length = width = 0;
    }

    public Rectangle(int length) {
        this.length = this.width = length;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayInfo() {
        System.out.println("Length: " + length + " Width: " + width);
    }

}

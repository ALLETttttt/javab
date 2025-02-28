package internal_class.task1;

public class Outer {

    public Outer() {
        new Inner().display();
    }

    class Inner {
        void display() {
            System.out.println("Inner class called.");
        }
    }

}

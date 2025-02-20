package inheritance.task5;

public class Child extends Parent {
    @Override
    void show() {
        super.show();
        System.out.println("Child`s show()");
    }
}

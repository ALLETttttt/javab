package static_class.task4;

public class Main {
    public static void main(String[] args) {
        Outer.Inner outerInner = new Outer.Inner();
        System.out.println(outerInner.displayVariable());
    }
}

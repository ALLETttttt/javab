package internal_class.task5;

public class Outer {
    private String privateString = "Accessed from Inner Class";

    public Outer() {
        new Inner().accessOuter();
    }

    class Inner {
        void accessOuter() {
            System.out.println(privateString);
        }
    }

}

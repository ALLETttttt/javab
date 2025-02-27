package static_class.task4;

public class Outer {
    private static String variable = "test variable";

    static class Inner {
        String displayVariable() {
            return variable;
        }
    }
}

package exceptions;

public class MyRuntime {

    public static void validateUserInput(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new MyRuntimeException("Invalid user input.");
        }
        System.out.println("Input is valid.");
    }

    public static void main(String[] args) {
        try {
            validateUserInput("");
        } catch (MyRuntimeException e) {
            System.out.println("Runtime exception caught with message: " + e.getMessage());
        }
    }
}

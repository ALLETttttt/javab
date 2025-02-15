package exceptions;

public class SimpleException extends Exception {
    public SimpleException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new SimpleException("Simple error occurred");
        } catch (SimpleException e) {
            System.out.println("Exception message: \"" + e.getMessage() + "\"");
        }
    }
}

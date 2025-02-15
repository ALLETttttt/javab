package try_catch_finally;

public class NullPointer {
    public static void main(String[] args) {
        String text = null;
        try {
            int len = text.length();
            System.out.println("The size of string: " + len);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}

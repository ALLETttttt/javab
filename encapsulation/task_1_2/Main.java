package encapsulation.task_1_2;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java Fundamentals");
        book.setAuthor("John Doe");

        System.out.println(book.getTitle() + " - - " + book.getAuthor());

        book.setPageCount(-11);
        System.out.println(book.getPageCount());

        book.setPageCount(300);
        System.out.println(book.getPageCount());
    }
}

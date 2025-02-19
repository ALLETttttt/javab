package access_modifiers;

public class Library {
    public void displayBookInfo() {
        Book book = new Book("1984", "George Orwell");
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
    }
}

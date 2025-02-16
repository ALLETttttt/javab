package intro_to_oop;

public class Book {
    String title;
    String author;

    public Book() {

    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Author: " + author + " \nBooks title: " + title);
    }
}

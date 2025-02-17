package intro_to_oop.library_management;

public class Book {
    String title;
    String author;
    String yearPublished;
    String genre;

    public Book() {

    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String yearPublished, String genre) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public String getGenre() {
        return genre;
    }

    public void displayBookInfo() {
        System.out.print("Title: " + title + ", Author: " + author);
        if (yearPublished != null) {
            System.out.print(", Year: " + yearPublished);
        }
        if (genre != null) {
            System.out.print(", Genre: " + genre);
        }
        System.out.println();
    }
}

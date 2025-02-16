package intro_to_oop;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("1984", "George Orwell");
        myBook.displayBookInfo();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        book1.displayBookInfo();

        Book book2 = new Book("Moby-Dick", "Herman Melville");
        book2.displayBookInfo();
    }
}

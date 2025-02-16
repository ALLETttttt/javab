package intro_to_oop;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("1984", "George Orwell");
        myBook.displayBookInfo();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        book1.displayBookInfo();

        Book book2 = new Book("Moby-Dick", "Herman Melville");
        book2.displayBookInfo();

        Person person = new Person("John Doe", 30, "johndoe@example.com");
        person.displayPersonInfo();

        person.updatePersonInfo(100);
        person.displayPersonInfo();

        person.updatePersonInfo(33, "newjohndoe@example.com");
        person.displayPersonInfo();

        Rectangle rectangle1 = new Rectangle();
        rectangle1.displayInfo();

        Rectangle rectangle2 = new Rectangle(5);
        rectangle2.displayInfo();

        Rectangle rectangle3 = new Rectangle(4, 6);
        rectangle3.displayInfo();
    }
}

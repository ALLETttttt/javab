package intro_to_oop;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("1984", "George Orwell");
        myBook.displayBookInfo();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        book1.displayBookInfo();

        Book book2 = new Book("Moby-Dick", "Herman Melville");
        book2.displayBookInfo();

        Book book3 = new Book("1984", "George Orwell", "1949", "Dystopian");
        book3.displayBookInfo();
        book3.setGenre("Classic");
        book3.displayBookInfo();

        Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", "1960", "Fiction");
        book4.displayBookInfo();
        book4.setYearPublished("1999");
        book4.displayBookInfo();

        Book book5 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", "Classic");
        book5.displayBookInfo();
        book5.setAuthor("Tor");
        book5.displayBookInfo();

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

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(5, 6));
        System.out.println(calculator.add(5, 6, 7));
        System.out.println(calculator.subtract(2, 3));
        System.out.println(calculator.subtract(1, 3, 4));

        Inventory inventory = new Inventory();
        Product product1 = new Product(101, "Laptop", 1200.50);
        Product product2 = new Product(102, "Smartphone", 799.99);
        Product product3 = new Product(103, "Headphones", 199.99);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        inventory.getProductList();

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.getBookList();
        library.getBookByTitleName("1984").ifPresentOrElse(
                Book::displayBookInfo,
                () -> System.out.println("Book not found.")
        );


    }
}

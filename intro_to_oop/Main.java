package intro_to_oop;

import intro_to_oop.banking_system.Bank;
import intro_to_oop.banking_system.BankAccount;
import intro_to_oop.employee_management.Employee;
import intro_to_oop.employee_management.EmployeeManager;
import intro_to_oop.inventory_system.Inventory;
import intro_to_oop.inventory_system.Product;
import intro_to_oop.library_management.Book;
import intro_to_oop.library_management.Library;
import intro_to_oop.models.Calculator;
import intro_to_oop.models.Person;
import intro_to_oop.models.Rectangle;
import intro_to_oop.registration_system.Course;
import intro_to_oop.registration_system.Student;

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


        Employee emp1 = new Employee(101, "Alice Johnson", "HR");
        Employee emp2 = new Employee(102, "Bob Smith", "IT");
        Employee emp3 = new Employee(103, "Charlie Brown", "Finance");

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(emp1);
        employeeManager.addEmployee(emp2);
        employeeManager.addEmployee(emp3);

        employeeManager.getEmployees();

        employeeManager.getEmployeeById(101).ifPresentOrElse(
                Employee::displayEmployeePersonalInfo,
                () -> System.out.println("Employee not found.")
        );

        Bank bank = new Bank();

        BankAccount acc1 = new BankAccount("12345", "John Doe", 200);
        BankAccount acc2 = new BankAccount("67890", "Jane Smith", 500);
        BankAccount acc3 = new BankAccount("11223", "Alice Brown", 1000);

        bank.addBankAccount(acc1);
        bank.addBankAccount(acc2);
        bank.addBankAccount(acc3);

        bank.getBankAccounts();

        bank.getBankAccountByAccountNumber("12345").displayInfo();
        bank.getBankAccountByAccountNumber("12345").deposit(400);

        acc1.deposit(1000);


        // Creating Courses
        Course javaCourse = new Course("101", "Introduction to Java", 2);
        Course dsaCourse = new Course("102", "Data Structures", 2);
        Course dbmsCourse = new Course("103", "Database Management Systems", 1);

        // Creating Students
        Student alice = new Student("S001", "Alice Smith");
        Student bob = new Student("S002", "Bob Johnson");
        Student charlie = new Student("S003", "Charlie Brown");

        alice.enrollToCourse(javaCourse);
        bob.enrollToCourse(javaCourse);
        charlie.enrollToCourse(javaCourse);

        alice.enrollToCourse(dsaCourse);
        alice.enrollToCourse(dbmsCourse);

        bob.enrollToCourse(dsaCourse);
        charlie.enrollToCourse(dbmsCourse);

        alice.getEnrolledCourses();
        bob.getEnrolledCourses();
        charlie.getEnrolledCourses();
    }
}

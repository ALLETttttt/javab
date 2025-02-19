package access_modifiers;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(19);
        person.setName("Aldar Kose");

        System.out.println("Name: " + person.getName() + " \nAge: " + person.getAge());

        Gardener gardener = new Gardener();
        gardener.tendGarden();

        Library library = new Library();
        library.displayBookInfo();

        Calculator calculator = new Calculator();
        calculator.add(5, 6);

        UserData userData = new UserData("1234");
        System.out.println(userData.isPasswordCorrect("123"));

        Account account = new Account(4500);
        account.deposit(500);

        PrintManager manager = new PrintManager();
        manager.getPrinter();
    }
}

package inheritance.task8;

public class Employee extends Person {
    String employeeID;

    public Employee(String employeeID, String name, int age) {
        super(name, age);
        this.employeeID = employeeID;
    }

    @Override
    void display() {
        super.display();
        System.out.println("ID: " + this.employeeID);
    }
}

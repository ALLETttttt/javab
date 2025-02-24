package polymorphism.task4;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Computer computer = new Computer();
        smartphone.start();
        computer.start();
    }
}

package abstraction.task4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla");
        Bike bike = new Bike("Bike");

        System.out.println(car.getName());
        System.out.println(bike.getName());
    }
}

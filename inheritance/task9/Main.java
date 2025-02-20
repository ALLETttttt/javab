package inheritance.task9;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("15 km/l");
        Bike bike = new Bike("35 kkm/l");

        car.fuelEfficiency();
        bike.fuelEfficiency();
    }
}

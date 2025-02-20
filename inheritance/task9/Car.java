package inheritance.task9;

public class Car extends Vehicle {
    String efficiency;

    public Car(String efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    void fuelEfficiency() {
        System.out.println("Fuel efficiency of Car is: " + this.efficiency);
    }
}

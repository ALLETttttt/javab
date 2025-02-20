package inheritance.task9;

public class Bike extends Vehicle {
    String efficiency;

    public Bike(String efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    void fuelEfficiency() {
        System.out.println("Fuel efficiency of bike is: " + this.efficiency);
    }
}

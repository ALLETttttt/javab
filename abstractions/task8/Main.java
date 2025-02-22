package abstractions.task8;

public class Main {
    public static void main(String[] args) {
        VehicleTelemetry carTelemetry = new CarTelemetry();
        VehicleTelemetry motorcycleTelemetry = new MotorcycleTelemetry();

        System.out.println("Collect telemetry data from a car.");
        carTelemetry.collectData();

        System.out.println("Collect telemetry data from a motorcycle.");
        motorcycleTelemetry.collectData();
    }
}

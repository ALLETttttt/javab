package abstractions.task8;

public class CarTelemetry extends VehicleTelemetry {
    @Override
    void collectEngineData() {
        System.out.println("Car engine data collected.");
    }

    @Override
    void collectTransmissionData() {
        System.out.println("Car transmission data collected.");
    }
}

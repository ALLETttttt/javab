package abstractions.task8;

public class MotorcycleTelemetry extends VehicleTelemetry {
    @Override
    void collectEngineData() {
        System.out.println("Motorcycle engine data collected.");
    }

    @Override
    void collectTransmissionData() {
        System.out.println("Motorcycle transmission data collected.");
    }
}

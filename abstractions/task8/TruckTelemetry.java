package abstractions.task8;

public class TruckTelemetry extends VehicleTelemetry {

    @Override
    void collectEngineData() {
        System.out.println("Truck engine data collected.");
    }

    @Override
    void collectTransmissionData() {
        System.out.println("Truck transmission data collected.");
    }
}

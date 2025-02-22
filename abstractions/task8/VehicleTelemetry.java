package abstractions.task8;

abstract public class VehicleTelemetry {

    abstract void collectEngineData();

    abstract void collectTransmissionData();

    void collectData() {
        collectEngineData();
        collectTransmissionData();
    }
}

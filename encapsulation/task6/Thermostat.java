package encapsulation.task6;

public class Thermostat {
    private double temperature;
    private Mode mode;

    public void setData(double temperature, Mode mode) {
        if (temperature >= 16 && temperature <= 28) {
            this.temperature = temperature;
            this.mode = mode;
        } else {
            System.out.println("Error: temperature is out of range.");
        }
    }

    @Override
    public String toString() {
        return "Thermostat{" +
                "temperature=" + temperature +
                ", mode=" + mode +
                '}';
    }
}

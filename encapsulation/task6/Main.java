package encapsulation.task6;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat =  new Thermostat();

        thermostat.setData(36, Mode.HEAT);
        thermostat.setData(25, Mode.HEAT);
        System.out.println(thermostat.toString());
    }
}

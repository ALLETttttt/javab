package enum_class.task_1__5;

public enum Weeks {
    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    WEDNESDAY("Weekday"),
    THURSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String type;

    Weeks(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getTypeOfWeek() {
        return this == SUNDAY || this == SATURDAY ? "Weekend": "Weekday";
    }
}

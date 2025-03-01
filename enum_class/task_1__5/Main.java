package enum_class.task_1__5;

public class Main {
    public static void main(String[] args) {
        Weeks weeks = Weeks.MONDAY;
        switch (weeks) {
            case MONDAY -> System.out.println("Monday");
            case TUESDAY -> System.out.println("Tuesday");
            case THURSDAY -> System.out.println("Thursday");
            case WEDNESDAY -> System.out.println("Wednesday");
            case FRIDAY -> System.out.println("Friday");
            case SATURDAY -> System.out.println("Saturday");
            case SUNDAY -> System.out.println("Sunday");
            default -> System.out.println("Error");
        }
        System.out.println(weeks.getType());
        for (Weeks weeks1: Weeks.values()) {
            System.out.println(weeks1.getType());
        }

        System.out.println(weeks.getTypeOfWeek());
        System.out.println(Weeks.SUNDAY.getTypeOfWeek());
    }
}

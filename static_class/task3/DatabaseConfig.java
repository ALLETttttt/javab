package static_class.task3;

public class DatabaseConfig {
    static String dbURL;

    static {
        dbURL = "DB URL for initialization in static block";
    }
}

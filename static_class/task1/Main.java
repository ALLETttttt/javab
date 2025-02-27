package static_class.task1;

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(Counter.count);
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.count);
    }
}

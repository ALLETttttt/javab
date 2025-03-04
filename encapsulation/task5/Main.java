package encapsulation.task5;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.decrement();
        counter.decrement();
        counter.increment();
        System.out.println(counter.getCount());
        counter.increment();
        System.out.println(counter.getCount());
        counter.increment();
        counter.increment();
        System.out.println(counter.getCount());

    }
}

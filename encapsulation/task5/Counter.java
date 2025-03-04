package encapsulation.task5;

public class Counter {
    private int count = 1;

    public void increment() {
        this.count++;
    }

    public void decrement() {
        if (this.count > 0) {
            this.count--;
        } else {
            System.out.println("Counter can not be negative/");
        }
    }

    public int getCount() {
        return count;
    }
}

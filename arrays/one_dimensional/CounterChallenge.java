package arrays.one_dimensional;

public class CounterChallenge {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -5, 53, 3, 43, -43, 34, 231, 231};
        int counter = 0;
        for (int i : array) {
            if (i >= 0) {
                counter++;
            }
        }
        System.out.printf("You entered %d positive numbers.", counter);
    }
}

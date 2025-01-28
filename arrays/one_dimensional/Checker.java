package arrays.one_dimensional;

public class Checker {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -5, 53, 3, 43, -43, 34, 231, 231};
        int even = 0, odd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.printf("You entered %d even numbers and %d odd number.", even, odd);
    }
}

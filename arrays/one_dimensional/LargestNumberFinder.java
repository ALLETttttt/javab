package arrays.one_dimensional;


public class LargestNumberFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -5, 53, 3, 43, -43, 34, 231, 231};
        int max = (int) -1e9;

        for (int n : array) {
            if (max < n) {
                max = n;
            }
        }

        System.out.printf("The largest number you entered is %d.", max);
    }
}

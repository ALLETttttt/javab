package arrays.one_dimensional;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -5, 53, 3, 43, -43, 34, 231, 231};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

package arrays.one_dimensional;

public class VowelCounter {
    public static void main(String[] args) {
        char[] array = {'a', 'd', 's', 'e', 'u', 'p', 'g', 'i', 'o', 'y'};
        int counter = 0;
        for (char ch : array) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter++;
            }
        }
        System.out.printf("You entered %d vowels.", counter);

    }
}

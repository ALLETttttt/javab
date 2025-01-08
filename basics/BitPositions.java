package basics;

import java.util.Scanner;

public class BitPositions {
    public static void main(String[] args) {

        String bytes = "10110011";
        System.out.println(bytes);
        int byteValue = Integer.parseInt(bytes, 2);
        int firstBit = (byteValue >> 7) & 1;

        System.out.println(firstBit);

//        System.out.println(~(firstBit << 7));
        byteValue &= ~(1 << 7);
        String result = String.format("%8s", Integer.toBinaryString(byteValue)).replace(' ', '0');
        System.out.println(result);

    }
}

package basics;

public class BitPositions {
    public static void main(String[] args) {
        // Test the function with the example input
        String input = "11001010";
        System.out.println("Input:  " + input);
        System.out.println("Output: " + swapBits(input));
    }

    public static String swapBits(String binaryString) {
        byte inputByte = (byte) Integer.parseInt(binaryString, 2);

        byte firstTwoBits = (byte) ((inputByte & 0b11000000) >>> 6);

        byte lastTwoBits = (byte) (inputByte & 0b00000011);

        byte middleBits = (byte) (inputByte & 0b00111100);

        byte result = (byte) (
                (lastTwoBits << 6) |
                        middleBits |
                        firstTwoBits
        );

        String resultStr = String.format("%8s", Integer.toBinaryString(result & 0xFF))
                .replace(' ', '0');

        return resultStr;
    }
}

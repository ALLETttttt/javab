package basics;

public class BlockScopeIdentifier {

    public static void main(String[] args) {
        int outsideBlock = 777;
        System.out.printf("Outside variable before block: %s%n", outsideBlock);

        {
            int insideBlock = 67;
            System.out.printf("Inside block variable: %s%n", insideBlock);
        }

        System.out.printf("Outside variable after block: %s", outsideBlock);
    }


}

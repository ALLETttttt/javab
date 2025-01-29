package arrays.one_dimensional;

import java.util.Scanner;

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] warehouseA = fillWarehouseArray("A", scanner);
        String[][] warehouseB = fillWarehouseArray("B", scanner);

        compareWarehouses(warehouseA, warehouseB);

        scanner.close();
    }

    private static void compareWarehouses(String[][] warehouseA, String[][] warehouseB) {
        boolean isMatched = false;
        boolean[] matchedA = new boolean[warehouseA.length];
        boolean[] matchedB = new boolean[warehouseB.length];

        for (int i = 0; i < warehouseA.length; i++) {
            for (int j = 0; j < warehouseB.length; j++) {
                if (warehouseA[i][0].equals(warehouseB[j][0])) {
                    isMatched = true;
                    matchedA[i] = true;
                    matchedB[j] = true;

                    System.out.printf("Matching Items: ID: %s, Name: %s, Count in A: %s, Count in B: %s%n",
                            warehouseA[i][0], warehouseA[i][1], warehouseA[i][2], warehouseB[j][2]);
                }
            }
        }

        if (!isMatched) {
            System.out.println("No Matching Items Found.");
        }

        System.out.println("\nUnmatched Items in Warehouse A:");
        for (int i = 0; i < warehouseA.length; i++) {
            if (!matchedA[i]) {
                System.out.printf("ID: %s, Name: %s, Count: %s%n",
                        warehouseA[i][0], warehouseA[i][1], warehouseA[i][2]);
            }
        }

        System.out.println("\nUnmatched Items in Warehouse B:");
        for (int i = 0; i < warehouseB.length; i++) {
            if (!matchedB[i]) {
                System.out.printf("ID: %s, Name: %s, Count: %s%n",
                        warehouseB[i][0], warehouseB[i][1], warehouseB[i][2]);
            }
        }
    }

    private static String[][] fillWarehouseArray(
            String warehouseType, Scanner scanner
    ) {

        System.out.printf("Warehouse %s Items size: ", warehouseType);
        int size = scanner.nextInt();

        String[] fields = getItemFields();
        String[][] array = new String[size][fields.length];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < fields.length; j++) {
                System.out.print(fields[j]);
                array[i][j] = scanner.next();
            }
        }

        return array;

    }

    private static String[] getItemFields() {
        return new String[]{"ID: ", "Name: ", "Count: "};
    }
}

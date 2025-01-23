package operators;

import java.util.Scanner;

public class MonthDaysFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.next().trim().toLowerCase();
        String result;

        switch (month) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                result = " has 31 days.";
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                result = " has 30 days.";
                break;

            case "february":
                result = " has 28 days.";
                break;

            default:
                result = " is not a valid month name.";
        }

        System.out.printf("%s" + result, month);
    }
}

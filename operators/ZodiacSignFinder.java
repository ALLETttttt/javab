package operators;

import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth month (e.g., January): ");
        String month = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();

        String zodiacSign = "";

        switch (month) {
            case "january":
                if (day >= 1 && day <= 19) {
                    zodiacSign = "Capricorn";
                } else if (day >= 20 && day <= 31) {
                    zodiacSign = "Aquarius";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "february":
                if (day >= 1 && day <= 18) {
                    zodiacSign = "Aquarius";
                } else if (day >= 19 && day <= 29) {
                    zodiacSign = "Pisces";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "march":
                if (day >= 1 && day <= 20) {
                    zodiacSign = "Pisces";
                } else if (day >= 21 && day <= 31) {
                    zodiacSign = "Aries";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "april":
                if (day >= 1 && day <= 19) {
                    zodiacSign = "Aries";
                } else if (day >= 20 && day <= 30) {
                    zodiacSign = "Taurus";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "may":
                if (day >= 1 && day <= 20) {
                    zodiacSign = "Taurus";
                } else if (day >= 21 && day <= 31) {
                    zodiacSign = "Gemini";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "june":
                if (day >= 1 && day <= 20) {
                    zodiacSign = "Gemini";
                } else if (day >= 21 && day <= 30) {
                    zodiacSign = "Cancer";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "july":
                if (day >= 1 && day <= 22) {
                    zodiacSign = "Cancer";
                } else if (day >= 23 && day <= 31) {
                    zodiacSign = "Leo";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "august":
                if (day >= 1 && day <= 22) {
                    zodiacSign = "Leo";
                } else if (day >= 23 && day <= 31) {
                    zodiacSign = "Virgo";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "september":
                if (day >= 1 && day <= 22) {
                    zodiacSign = "Virgo";
                } else if (day >= 23 && day <= 30) {
                    zodiacSign = "Libra";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "october":
                if (day >= 1 && day <= 22) {
                    zodiacSign = "Libra";
                } else if (day >= 23 && day <= 31) {
                    zodiacSign = "Scorpio";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "november":
                if (day >= 1 && day <= 21) {
                    zodiacSign = "Scorpio";
                } else if (day >= 22 && day <= 30) {
                    zodiacSign = "Sagittarius";
                } else {
                    invalidDay();
                    return;
                }
                break;
            case "december":
                if (day >= 1 && day <= 21) {
                    zodiacSign = "Sagittarius";
                } else if (day >= 22 && day <= 31) {
                    zodiacSign = "Capricorn";
                } else {
                    invalidDay();
                    return;
                }
                break;
            default:
                System.out.println("Invalid month. Please enter a valid month.");
                return;
        }

        System.out.printf("Your zodiac sign is %s.%n", zodiacSign);
    }

    private static void invalidDay() {
        System.out.println("Invalid day. Please enter a valid day for the specified month.");
    }
}

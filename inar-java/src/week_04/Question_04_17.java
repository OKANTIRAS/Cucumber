package week_04;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month");
        String month = input.next();
        // enter the first three letter of the month first letter must be in uppercase
        if (!(('A' <= (month.charAt(0)) && (month.charAt(0) <= 'Z')))) {
            System.out.println("The first letter must be in uppercase");
            System.exit(1);
        }
        if (month.startsWith("Jan")) {
            System.out.printf("%s %d has 31 days/n", month.substring(0, 3), year);
        } else if ((month.startsWith("Feb"))) {
            if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
                System.out.printf("%s %d has 29 days", month.substring(0, 3), year);
            } else {
                System.out.printf("%s %d has 28 days", month.substring(0, 3), year);
            }
        } else if (month.startsWith("Mar")) {
            System.out.printf("%s %d has 30 days", month.substring(0, 3), year);
        } else if (month.startsWith("Apr")) {
            System.out.printf("%s %d has 31 days", month.substring(0, 3), year);
        } else if (month.startsWith("May")) {
            System.out.printf("%s %d has 30 days", month.substring(0, 3), year);
        } else if (month.startsWith("Jun")) {
            System.out.printf("%s %d has 31 days", month.substring(0, 3), year);
        } else if (month.startsWith("Jul")) {
            System.out.printf("%s %d has 30 days", month.substring(0, 3), year);
        } else if (month.startsWith("Aug")) {
            System.out.printf("%s %d has 31 days", month.substring(0, 3), year);
        } else if (month.startsWith("Sep")) {
            System.out.printf("%s %d has 30 days", month.substring(0, 3), year);
        } else if (month.startsWith("Oct")) {
            System.out.printf("%s %d has 31 days", month.substring(0, 3), year);
        } else if (month.startsWith("Now")) {
            System.out.printf("%s %d has 30 days", month.substring(0, 3), year);
        } else if (month.startsWith("Dec")) {
            System.out.printf("%s %d has 31 days", month.substring(0, 3), year);
        }
    }
}

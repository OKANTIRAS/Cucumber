package week_03;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: (e. g., 2012): ");
        int year = input.nextInt();
        System.out.println("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.println("Enter the day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();
        int century = year / 100;
        int yearOfCentury = year % 100;
        int dayOfTheWeek = ((dayOfMonth + (26 * (month + 1)) / 10 + yearOfCentury + (yearOfCentury / 4) +
                (century / 4) + (5 * century)) % 7);
        switch (dayOfTheWeek) {
            case 0:
                System.out.println("Day of the week is Saturday");
                break;
            case 1:
                System.out.println("Day of the week is Sunday");
                break;
            case 2:
                System.out.println("Day of the week is Monday");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday");
                break;
            case 5:
                System.out.println("Day of the week is Thursday");
                break;
            case 6:
                System.out.println("Day of the week is Friday");
                break;
        }

    }

}

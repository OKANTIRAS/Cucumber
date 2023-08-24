package week_03;

import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter number for each day for example 1 for monday, 2 for tuesday and so
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();
        int totalDays = today + elapsedDays;
        int futureDay = totalDays % 7;
        switch (today) {
            case 1:
                System.out.print("Today is  Monday");
                break;
            case 2:
                System.out.print("Today is Tuesday");
                break;
            case 3:
                System.out.print("Today is Wednesday");
                break;
            case 4:
                System.out.print("Today is Thursday");
                break;
            case 5:
                System.out.print("Today is Friday");
                break;
            case 6:
                System.out.print("Today is Saturday");
                break;
            case 7:
                System.out.print("Today is Sunday");
                break;
            default:
                System.out.println("Invalid input ");
        }
        switch (futureDay) {
            case 1:
                System.out.println(" and the future day is Monday");
                break;
            case 2:
                System.out.println(" and the future day is Tuesday");
                break;
            case 3:
                System.out.println(" and the future day is Wednesday");
                break;
            case 4:
                System.out.println(" and the future day is Thursday");
                break;
            case 5:
                System.out.println(" and the future day is Friday");
                break;
            case 6:
                System.out.println(" and the future day is Saturday");
                break;
            case 7:
                System.out.println(" and the future day is Sunday");
                break;
            default:
                System.out.println(" Invalid input");


        }

    }

}


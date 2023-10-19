package week_08;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        int[][] workHours = createWorkHoursArray();
        displayHours(workHours);
    }

    public static void displayHours(int[][] workHours) {
        int [] sums = new int[workHours.length];
        int sum = 0;
        for (int i = 0; i < workHours.length; i++) {
            sum = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                sums[i] += workHours[i][j];

            }
        }
        for (int i = 0; i < sums.length; i++) {
            System.out.println("Employee " + i + "'s total work hours in decreasing order " +
                    "of the total hours: " + sums[i]);

        }

    }


    public static int[][] createWorkHoursArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee number: ");
        int employeeNumber = input.nextInt();
        int[][] workHours = new int[employeeNumber][7];
        System.out.println("Employees and their total hours in decreasing order of the total hours: ");

        for (int i = 0; i < employeeNumber; i++) {
            for (int j = 0; j < 7; j++) {
                workHours[i][j] = input.nextInt();
            }
        }
        return workHours;
    }
}

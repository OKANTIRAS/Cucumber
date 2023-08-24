package week_02;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int year = input.nextInt();
        int population = year * (365 * 24 * 3600 / 7) - (year * 365 *24 * 3600 / 13) +(year * 365 * 24 * 3600 / 45) + 312032486;
        System.out.println("The population in " + year + "years is " + population);

    }
}

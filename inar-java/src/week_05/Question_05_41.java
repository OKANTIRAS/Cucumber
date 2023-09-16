package week_05;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integers if your number is 0 it ends: ");
        String numbers = "";
        int number = -1;
        int maxNumber = 0;
        int maxCount = 0;
        do {
            number = input.nextInt();

            if (number > maxNumber) {
                maxNumber = number;
                maxCount = 1;
            } else if (number == maxNumber) {
                maxCount++;
            }

        } while (number != 0);



        System.out.printf("The largest count is %d " +
                "and the occurrence of the count is %d", maxNumber, maxCount);
    }
}

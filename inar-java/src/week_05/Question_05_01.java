package week_05;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = 1;
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int total = 0;
        double average = 0.0;

        while (number != 0) {
            number = input.nextInt();
            total += number;

            if (number > 0) {
                ++numberOfPositives;
            } else if (number < 0) {
                ++numberOfNegatives;
            }
            average = (total * 1.0) / (numberOfPositives + numberOfNegatives);

            if (((number == 0) && (numberOfPositives == 0)) && (numberOfNegatives == 0)) {
                System.out.println("No numbers entered except 0");
            }
        }
            System.out.printf("The number of positives is %d \n", numberOfPositives);
            System.out.printf("The number of negatives is %d \n", numberOfNegatives);
            System.out.printf("The total is %d \n", total);
            System.out.printf("The average is %.2f \n", average);

    }

}

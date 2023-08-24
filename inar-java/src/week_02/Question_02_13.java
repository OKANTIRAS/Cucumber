package week_02;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        final double MONTHLY_INTEREST_RATE = 0.00417;
        double firstMonthAmount = savingAmount * (1 + MONTHLY_INTEREST_RATE);
        double secondMonthAmount = (savingAmount + firstMonthAmount) * (1 + MONTHLY_INTEREST_RATE);
        double thirdMonthAmount = (savingAmount + secondMonthAmount) * (1 + MONTHLY_INTEREST_RATE);
        double fourthMonthAmount = (savingAmount + thirdMonthAmount) * (1 + MONTHLY_INTEREST_RATE);
        double fifthMonthAmount = (savingAmount + fourthMonthAmount) * (1 + MONTHLY_INTEREST_RATE);
        double sixthMonthAmount = (savingAmount + fifthMonthAmount) * (1 + MONTHLY_INTEREST_RATE);
        System.out.println("After the sixth month, the account value is " + sixthMonthAmount) ;

    }
}

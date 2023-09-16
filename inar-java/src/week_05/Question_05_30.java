package week_05;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount (e.g., 100): ");
        int amount = input.nextInt();
        System.out.print("Enter the annual interest rate: (e.g., 5): ");
        int interestRate = input.nextInt();
        System.out.print("Enter the number of months (e.g.,6): ");
        int numberOfMonths = input.nextInt();
        double monthlyInterestRate = interestRate / 100.0 / 12;
        double finalAmount = 0.0;

        for(int i = 1; i <= numberOfMonths; i++){
            finalAmount = (finalAmount + amount) * (1 + monthlyInterestRate);
        }
        System.out.printf("Amount in savings account after %d months: $%.2f",numberOfMonths,finalAmount);
    }
}

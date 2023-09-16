package week_05;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Loan amount: ");
        int loanAmount = input.nextInt();

        System.out.println("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter annual interest Rate");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 12.0 / 100.0;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12))));

        double totalPayment = monthlyPayment * 12.0 * numberOfYears;

        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Number of Years: " + numberOfYears);
        System.out.println("Annual Interest Rate: " + annualInterestRate);
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);

        double interest;
        double principal;
        double balance = loanAmount;

        System.out.printf("\n%-10s %10s %10s %10s", "Payment", "Interest", "Principal", "Balance");

        for (int i = 1; i <= 12; i++) {

            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;

            System.out.printf("\n%-10d %10.2f %10.2f %10.2f", i, interest, principal, balance);


        }
    }
}

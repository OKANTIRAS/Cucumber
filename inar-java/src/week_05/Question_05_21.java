package week_05;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter loan amount: ");
        int loanAmount = input.nextInt();
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();


        System.out.print("Interest Rate     Monthly Payment     Total Payment");
        double interestRate =5000;
        while (interestRate <= 8000){
            double monthlyInterestRate = interestRate /1000 / 12.0/ 100.0;

            double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow(1 + (monthlyInterestRate),(numberOfYears * 12)))));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("\n%-10.3f %-10.2f %-10.2f ", interestRate / 1000 ,monthlyPayment,totalPayment);
            interestRate += 125;
        }

    }
}

package week_06;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        int annualInterestRate = input.nextInt();
        double monthlyInterestRate = annualInterestRate / 12.0 / 100;
        for(int year = 1; year <= 30; year++){
            System.out.printf("%.2f\n",futureInvestmentValue(amount,monthlyInterestRate,year));
        }

    }public static double futureInvestmentValue(double amount, double monthlyInterestRate, int year){
        double futureInvestmentValue = amount * Math.pow((1 + monthlyInterestRate) , (year * 12));
        return futureInvestmentValue;
    }
}

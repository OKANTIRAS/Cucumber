package week_03;

import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int currency = input.nextInt();
        switch (currency) {
            case 0:
                System.out.print("Enter the dollar amount: ");
                double dollar = input.nextInt();
                System.out.println("$" + dollar + " is " + (dollar * exchangeRate) + " yuan");
                break;
            case 1:
                System.out.print("Enter the RMB amount: ");
                double RMB = input.nextDouble();
                System.out.println(RMB + " yuan is " + "$" + (RMB / exchangeRate));
                break;
            default:
                System.out.println("Incorrect input");


        }

    }
}

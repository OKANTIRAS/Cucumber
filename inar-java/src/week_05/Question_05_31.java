package week_05;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial deposit amount: ");
        int depositAmount = input.nextInt();
        System.out.println("Enter annual percentage yield: ");
        double percentageYield = input.nextDouble();
        System.out.println("Enter maturity period (number of months): ");
        int maturityPeriod = input.nextInt();
        double monthlypercentageYield = percentageYield / 1200.0;
        double finalAmount = 0;
        System.out.println("Month CD Value");
        for (int i = 1; i <= maturityPeriod; i++){
            if(i ==1) {
                finalAmount = (depositAmount + (depositAmount * monthlypercentageYield));
            }else {
                finalAmount = (finalAmount + (finalAmount * monthlypercentageYield));
            }
            System.out.printf("%d %.2f\n",i,finalAmount);
        }
    }
}

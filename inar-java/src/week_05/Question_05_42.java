package week_05;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salesAmount = 0;
        System.out.println("Enter the commission sought: ");
        double commissionSought = input.nextDouble();

        double commissionOfFirst5000 = 5000 * 0.08;
        double commissionOfSecond5000 = 5000 * 0.1;

        for (; ; ) {
            if (commissionSought <= commissionOfFirst5000) {
                if (salesAmount * 0.08 != commissionSought) {
                    salesAmount += 0.01;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        for (; ; ) {
            if (commissionSought <= commissionOfSecond5000 + commissionOfFirst5000) {
                if ((commissionOfFirst5000 + (salesAmount - 5000) * 0.1) != commissionSought) {

                    salesAmount += 0.1;
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        for (; ; ) {
            if (commissionSought > commissionOfSecond5000 + commissionOfFirst5000) {
                if ((commissionOfFirst5000
                        + commissionOfSecond5000
                        + (salesAmount - 10000) * 0.12) >= commissionSought) {
                    break;
                } else {
                    salesAmount += 0.1;
                }
            } else {
                System.exit(1);
            }
        }
        System.out.printf("Minimum sales to earn $%.0f : $%.1f", commissionSought, salesAmount);
    }
}


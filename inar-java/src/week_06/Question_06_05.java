package week_06;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 < num2 && num2 < num3) {
            System.out.printf("%-4.1f%-4.1f%-4.1f", num1, num2, num3);
        } else if (num1 < num2 && num2 > num3) {
            System.out.printf("%-4.1f%-4.1f%-4.1f", num1, num3, num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.printf("%-4.1f%-4.1f%-4.1f", num2, num1, num3);
        } else if (num2 < num1 && num1 > num3) {
            System.out.printf("%-4.1f%-4.1f%-4.1f", num2, num3, num1);
        }else if (num3 < num1 && num1 < num2) {
            System.out.printf("%-4.1f%-4.1f%-4.1f", num3, num1, num2);
        }else if (num3 < num1 && num1 > num2) {
            System.out.printf("%-4.1f%-4.1f%-4.1f", num3, num2, num1);
        }
    }
}


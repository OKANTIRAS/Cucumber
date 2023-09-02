package week_04;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalValue = input.nextInt();
        int number = 0;
        if (10 < decimalValue && decimalValue <= 16) {
            number = decimalValue % 10;
            switch (number) {
                case 0:
                    System.out.print("The hex value is A");
                    break;
                case 1:
                    System.out.print("The hex value is B");
                    break;
                case 2:
                    System.out.print("The hex value is C");
                    break;
                case 3:
                    System.out.print("The hex value is D");
                    break;
                case 4:
                    System.out.print("The hex value is E");
                    break;
                case 5:
                    System.out.print("The hex value is F");
                    break;
                default:
                    System.out.println(decimalValue + " is invalid input");

            }
        } else if (0 < decimalValue && decimalValue <= 9) {
            System.out.println("The hex value is " + decimalValue);
        } else {
            System.out.println(decimalValue + " is invalid input");
        }
    }
}

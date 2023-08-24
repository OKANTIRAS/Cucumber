package week_03;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer:  ");
        int number = input.nextInt();
        int firstDigit = number / 100;
        int lastDigit = number % 10;

        if (lastDigit == firstDigit) {
            System.out.print(number + " is a palindrome");
        } else {

            System.out.print(number + " is not a palindrome");
        }
    }
}

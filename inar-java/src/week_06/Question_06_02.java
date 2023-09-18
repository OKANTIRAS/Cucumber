package week_06;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = input.nextLong();
        System.out.printf("The sum of the digits in %d is %d",n,sumDigits(n));

    }

    public static int sumDigits(long n) {
        int sumOfDigits = 0;
        while (n != 0) {
            sumOfDigits += n % 10;
            n = n / 10;
        }
        return sumOfDigits;

    }
}

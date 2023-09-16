package week_05;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer : ");

        int decimalNumber = input.nextInt();

        int number = decimalNumber;

        String binaryNumber = "";

        String remainder = "";


        while (number != 0) {

            remainder = Integer.toString(number % 2);

            number = number / 2;

            binaryNumber = remainder.concat(binaryNumber);
        }

        System.out.printf("The binary value of the decimal \"%d\" is : %s",decimalNumber,binaryNumber);


    }
}

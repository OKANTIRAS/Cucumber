package week_05;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        int maxNumber;
        Scanner input = new Scanner(System.in);

        int gcd = 0;
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        maxNumber = Math.max(number1,number2);

        for(int i = 1; i <= (maxNumber / 2); i++){
            if((number1 % i == 0) && (number2 % i == 0)){
                gcd = i;
            }
        }
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + gcd );


    }
}

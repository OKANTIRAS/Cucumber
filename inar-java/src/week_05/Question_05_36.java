package week_05;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int numberOfDigits = 0;
        int sum = 0;
        int lastDigit = 0;
        String digitsOfISBN = "";
        while(numberOfDigits < 9) {
            int number = input.nextInt();
            digitsOfISBN += number + "";
            numberOfDigits++;

            if(number > 9){
                System.out.println("You entered invalid input");
                System.exit(1);
            }
        }

        lastDigit = ((1 * digitsOfISBN.charAt(0)) + (2 * digitsOfISBN.charAt(1)) + (3 * digitsOfISBN.charAt(2)) +
                (4 * digitsOfISBN.charAt(3)) + (5 * digitsOfISBN.charAt(4)) + (6 * digitsOfISBN.charAt(5))
                + (7 * digitsOfISBN.charAt(6)) + (8 * digitsOfISBN.charAt(7)) + (9 * digitsOfISBN.charAt(8))) % 11;
        if(lastDigit == 10){
            System.out.println("The ISBN number is " + digitsOfISBN + "X" );
        }else {
            System.out.println("The ISBN number is " + digitsOfISBN + lastDigit);
        }






    }
}

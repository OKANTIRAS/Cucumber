package week_06;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int reverseNumber = reverse(number);
        boolean result = isPalindrom(number);
        if(result){
            System.out.printf("%d is a palindrom.",number);
        }else{
            System.out.printf("%d is not a palindrom.",number);
        }

    }

    public static int reverse(int number) {
        String newNumber = "";
        int newNumber1 = 0;
        while (number != 0) {
            newNumber += number % 10;
            number = number / 10;
            newNumber1 = Integer.parseInt(newNumber);
        }
        return newNumber1;
    }
    public static boolean isPalindrom(int number){
        if (number == reverse(number)){
            return true;
        }else{
            return false;
        }

    }
}

package week_06;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        System.out.print("Display an integer reversed: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        reverse(number);
    }
    public static void reverse(int number){
        while (number != 0){
            System.out.print(number % 10);
            number = number / 10;
        }
    }
}

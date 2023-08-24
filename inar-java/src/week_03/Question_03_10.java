package week_03;

import java.util.Scanner;

public class Question_03_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = (int) (Math.random() * 100);
        int secondNumber = (int) (Math.random() * 100);
        System.out.println("What is " + firstNumber + " + " + secondNumber + " = " + "?");
        int answer = input.nextInt();
        if (answer == firstNumber + secondNumber) {
            System.out.println("You are correct !");
        } else {
            System.out.println("You are wrong !    " + firstNumber + " + " + secondNumber + " should be " + (firstNumber+secondNumber));

        }

    }
}

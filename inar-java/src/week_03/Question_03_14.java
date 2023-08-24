package week_03;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the flip of coin (0 represent head and 1 represent tail: ");
        int guess = input.nextInt();
        int result = (int) (Math.random() * 2);
        System.out.println(result);
        if (result == guess) {
            System.out.println("Your guess is correct");
        } else {
            System.out.println("Your guess is incorrect");
        }
    }
}

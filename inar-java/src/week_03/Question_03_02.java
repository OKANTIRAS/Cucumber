package week_03;

import java.util.Scanner;

public class Question_03_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        System.out.println("What is " + a + " + " + b + " + " + c + " =  ?");
        int sum = input.nextInt();
        if (sum == a + b + c) {
            System.out.println(a + " + " + b + " + " + c + " = " + sum + " is true");

        } else {
            System.out.println(a + " + " + b + " + " + c + " = " + sum + " is false");
        }

    }
}

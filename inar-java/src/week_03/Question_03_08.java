package week_03;

import java.util.Scanner;

public class Question_03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // enter different numbers
        System.out.print("Enter 3 integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.println(a + " < " + b + " < " + c);
            } else {
                System.out.println(c + " < " + a + " < " + b);
            }
        } else if (b < a) {
            if (a < c) {
                System.out.println(b + " < " + a + " < " + c);
            } else {
                System.out.println(c + " < " + b + " < " + a);
            }

        }
    }
}

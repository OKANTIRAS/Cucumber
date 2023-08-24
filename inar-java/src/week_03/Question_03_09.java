package week_03;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();
        int a = number / 100000000;
        int b = (number / 10000000) % 10;
        int c = (number / 1000000) % 10;
        int d = (number / 100000) % 10;
        int e = (number / 10000) % 10;
        int f = (number / 1000) % 10;
        int g = (number / 100) % 10;
        int h = (number / 10) % 10;
        int i = number % 10;
        int lastDigit = (a + (2 * b) + (3 * c) + (4 * d) + (5 * e) + (6 * f) + (7 * g) + (8 * h) + (9 * i)) % 11;
        if (lastDigit == 10) {
            System.out.print(a);
            System.out.print(b);
            System.out.print(c);
            System.out.print(d);
            System.out.print(e);
            System.out.print(f);
            System.out.print(g);
            System.out.print(h);
            System.out.print(i);
            System.out.print("X");
        } else {
            System.out.print(a);
            System.out.print(b);
            System.out.print(c);
            System.out.print(d);
            System.out.print(e);
            System.out.print(f);
            System.out.print(g);
            System.out.print(h);
            System.out.print(i);
            System.out.print(lastDigit);
        }
    }
}

package week_03;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // to calculate discriminant we need a, b, c, values
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double r1 = (-b + (Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5))) / (2 * a);
        double r2 = (-b - (Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5))) / (2 * a);
        if (discriminant > 0) {
            System.out.println("The equation has two roots " + (int) (r1 * 1000000) / 1000000.0 + " " + (int) (r2 * 1000000) / 1000000.0);
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + (int)r1);
        } else if (discriminant < 0) {
            System.out.println("The equation has no real roots");


        }
    }
}

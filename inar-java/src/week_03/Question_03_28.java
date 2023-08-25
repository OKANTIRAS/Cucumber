package week_03;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r1' center x-, y- coordinates, width, and height: ");
        System.out.println("Enter r2' center x-, y- coordinates, width, and height: ");
        double xR1 = input.nextDouble();
        double yR1 = input.nextDouble();
        double widthR1 = input.nextDouble();
        double heightR1 = input.nextDouble();
        double xR2 = input.nextDouble();
        double yR2 = input.nextDouble();
        double widthR2 = input.nextDouble();
        double heightR2 = input.nextDouble();
        if (Math.abs(xR1 - xR2) <= (widthR1 / 2 + widthR2) && Math.abs(yR1 - yR2) <= (heightR1 / 2 + heightR2)) {
            System.out.println("r2 is inside r1");
        } else if (Math.abs(xR1 - xR2) <= (widthR1 / 2 + widthR2 / 2) && Math.abs(yR1 - yR2) <= (heightR1 / 2 + heightR2 / 2)) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlaps r1");
        }
    }
}
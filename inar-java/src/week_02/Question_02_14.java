package week_02;

import java.util.Scanner;

public class Question_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pound = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inch = input.nextDouble();
        double kilogram = pound * 0.45359237;
        double meter = inch * 0.0254;
        double bmi = kilogram / Math.pow(meter, 2);
        System.out.println("BMI is " + bmi);



    }
}

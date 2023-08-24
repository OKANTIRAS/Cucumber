package week_03;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        double kilograms = weight * 0.45359237;
        double height = (feet * 0.3048) + (inches * 0.0254);
        double bodyMassIndex = kilograms / Math.pow(height, 2);
        System.out.println("BMI is " + bodyMassIndex);
        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        } else if (18.5 <= bodyMassIndex && bodyMassIndex <= 25.0) {
            System.out.println("Normal");
        } else if (25.0 <= bodyMassIndex && bodyMassIndex <= 30.0) {
            System.out.println("Overweight");
        } else if (30.0 <= bodyMassIndex){
            System.out.println("Obese");

        }


    }

}



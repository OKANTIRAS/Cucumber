package week_13;

import java.util.Scanner;

public class Question_13_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter the color:");
        String color = input.next();
        System.out.print("Enter : isFilled ? true or false: ");
        String isFilled = input.next();
        GeometricObject geometricObject = new Triangle(side1,side2,side3,"red",true);

        System.out.println(geometricObject);



    }
}


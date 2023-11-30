package week_12;

import java.util.Scanner;

public class Question_12_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            try {
                System.out.print("Enter three sides of a triangle: ");

                double side1 = input.nextDouble();
                double side2 = input.nextDouble();
                double side3 = input.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Triangle: side1 = " + side1 + " side2= " + side2 + " side3= " +
                        side3);
                System.out.println("Perimeter of the triangle is " + triangle.getPeimeter());
                System.out.println("Area of the triangle is " + triangle.getArea());
                isTrue = false;
            } catch (IllegalTriangleException ex) {
                System.out.println(ex);
            }

        }

    }
}

package week_02;

import java.util.Scanner;

public class Question_02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);


    }
}

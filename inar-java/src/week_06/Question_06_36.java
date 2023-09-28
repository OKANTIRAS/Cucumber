package week_06;

import java.util.Scanner;

public class Question_06_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of sides:");
        int numberOfSides = input.nextInt();

        System.out.print("Enter the side:");
        double side = input.nextDouble();
        double area = area(numberOfSides,side);
        System.out.printf("The area of the polygon is %f",area);
    }
    public static double area(int numberOfSides , double side){
        double area = (numberOfSides * Math.pow(side,2)) / (4 * Math.tan(Math.PI / numberOfSides));
        return area;
    }
}

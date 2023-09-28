package week_06;

import java.util.Scanner;

public class Question_06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side:");
        double side = input.nextDouble();
        double area = area(side);
        System.out.printf("The area of the pentagon is %f",area);
    }
    public static double area(double side){
        double area = (5 * Math.pow(side,2)) / (4 * Math.tan(Math.PI / 5));
        return area;
    }
}

package week_03;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.pow(Math.pow((x - 0), 2) + Math.pow(y - 0, 2), 0.5);
        if(distance <= 10) {
            System.out.println("Point (" + x + ", " + y + ") is in circle");
        }else{
            System.out.println("Point (" + x + ", " + y + ") is not in circle");
        }
    }
}

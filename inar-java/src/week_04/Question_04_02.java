package week_04;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RADIUS =6371.01;

        System.out.print("Enter point 1 (latitude longitude) in degrees: ");
        double point1Latitude = input.nextDouble();
        double point1Longitude = input.nextDouble();

        System.out.print("Enter point 2 (latitude longitude) in degrees: ");
        double point2Latitude = input.nextDouble();
        double point2Longitude = input.nextDouble();
        double x1 =Math.toRadians(point1Latitude);
        double y1 =Math.toRadians(point1Longitude);
        double x2 =Math.toRadians(point2Latitude);
        double y2 =Math.toRadians(point2Longitude);
        double distance = RADIUS * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x2) * Math.cos(y1 - y2)));
        System.out.println("The distance between the two points is " + distance);
    }
}

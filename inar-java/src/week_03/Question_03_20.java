package week_03;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
        int fahrenheit = input.nextInt();
        System.out.println("Enter the wind speed (>=2) in miles per hour : ");
        int speed = input.nextInt();
        double windChillIndex = 0;
        if (-58 < fahrenheit && fahrenheit < 41 && speed >= 2) {
            windChillIndex = 35.74 + (0.6215 * fahrenheit) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * fahrenheit * Math.pow(speed, 0.16));
            System.out.println("The wind chill index is  " + windChillIndex);
        } else {
            System.out.println("The input is invalid");
        }

    }
}

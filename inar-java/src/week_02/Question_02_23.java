package week_02;

import java.util.Scanner;

public class Question_02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.println("Enter miles per gallon");
        double milesPerGalon = input.nextDouble();
        System.out.println("Enter price per galon");
        double pricePerGalon = input.nextDouble();
        double costOfDriving = distance / milesPerGalon * pricePerGalon;
        System.out.println("The cost of driving is " + costOfDriving);

    }
}

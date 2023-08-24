package week_03;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package (in pounds) : ");
        int weight = input.nextInt();
        double cost = 0;
        if (0 < weight && weight <= 1) {
            cost = weight * 3.5;
        } else if (1 < weight && weight <= 3) {
            cost = weight * 5.5;
        } else if (3 < weight && weight <= 10) {
            cost = weight * 8.5;
        } else if (10 < weight && weight <= 20) {
            cost = weight * 10.5;
        } else {
            System.out.println("Package cannot be shipped.");
        }
        System.out.println("Shipping cost of package is $" + cost);


    }

}


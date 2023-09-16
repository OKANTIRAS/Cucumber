package week_05;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        String numbers = "";
        int sum = 0;
        int number = 0;
        double mean = 0;
        double deviation = 0;
        int powSum = 0;
        for (int i = 1; i <= 10; i++) {
            number = input.nextInt();
            numbers += number + " ";
            sum += i;
            mean = sum / 10;
            powSum += Math.pow(i, 2);
        }
        deviation = (Math.sqrt(powSum - (Math.pow(sum , 2) / 10)) / 9);
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);

    }


}


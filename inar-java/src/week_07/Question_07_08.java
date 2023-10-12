package week_07;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten values of double type: ");

        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double averageValue = average(numbers);


        System.out.println("The average value: " + averageValue);
    }

    public static int average(int[] numbers) {
        int sum = 0;
        int average;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / numbers.length;
        return average;
    }

    public static double average(double[] numbers) {
        double sum = 0;
        double average ;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / numbers.length;
        return average;
    }


}

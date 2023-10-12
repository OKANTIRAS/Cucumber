package week_07;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double mean = getMean(numbers);
        double deviation = getDeviation(numbers, mean);
        System.out.printf("The mean is %.2f \n", mean);
        System.out.printf("The standart deviation is  %.5f", deviation);

    }

    public static double getMean(double[] numbers) {
        double sum = 0.0;
        double mean ;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        mean = sum / numbers.length;
        return mean;
    }

    public static double getDeviation(double[] numbers, double mean) {
        double sum = 0;
        double deviation = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow((numbers[i] - mean), 2);
        }
        deviation = Math.sqrt(sum / (numbers.length - 1));
        return deviation;

    }
}

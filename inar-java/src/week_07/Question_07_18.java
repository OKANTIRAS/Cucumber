package week_07;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");

        double [] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();

        }
        double [] bubbleSorted = bubbleSort(numbers);
        for (int i = 0; i < bubbleSorted.length; i++) {
            System.out.print(bubbleSorted[i] + " ");

        }

    }

    public static double[] bubbleSort(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i +1; j <numbers.length ; j++) {
                if(numbers[i] > numbers[j]) {
                    double tempt = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempt;
                }
            }
        }
        return numbers;
    }

}

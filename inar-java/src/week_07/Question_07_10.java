package week_07;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");

        double [] numbers = new double[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }

        int minIndex = indexOfSmallestElement(numbers);
        double min = min(numbers);
        System.out.println("The minumum number is " + min + " index " + minIndex);

    }
    public static double min(double [] numbers){
        double min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
    public static int indexOfSmallestElement(double [] numbers){
        double min = numbers[0];
        int indexOfElement = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
                indexOfElement = i;

            }

        }
        return indexOfElement;

    }
}

package week_08;

import java.util.Scanner;

public class Question_08_17 {
    public static void main(String[] args) {
        double [][] numbers = createArray();
        int [] index = findLargestElementIndex(numbers);
        System.out.println("The location of the largest element is at (" + index[0] + ", " +
                index[1] + ")");

    }

    private static int[] findLargestElementIndex(double[][] numbers) {
        int [] index = new int[2];
        int row = 0;
        int column = 0;
        double largestElement = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j] > largestElement){
                    largestElement = numbers[i][j];
                    row = i;
                    column = j;
                    index[0] = row;
                    index[1] =column;
                }
            }
        }
        return index;
    }

    public static double[][] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows and columns of the array: ");
        int numberOfRows = input.nextInt();
        int numberOfColumns = input.nextInt();
        System.out.print("Enter the array: ");
        double [][] array = new double[numberOfRows][numberOfColumns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }
}

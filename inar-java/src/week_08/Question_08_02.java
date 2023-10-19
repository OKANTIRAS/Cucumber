package week_08;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        double [][] array = createArray();
        double sumMajorDiagonal = sumMajorDiagonal(array);
        System.out.printf("Sum of the elements in the major diagonal is %.1f",sumMajorDiagonal );
    }

    public static double sumMajorDiagonal(double[][] array) {
        double sumMajorDiagonal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j) {
                    sumMajorDiagonal += array[i][j];
                }
            }
        }
        return sumMajorDiagonal;
    }

    public static double[][] createArray() {
        double [][] array = new double[4][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();

            }
        }
        return array;
    }
}

package week_09;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {
        double [][] array = getArray();
        Location largestPoint = locateLargest(array);
        printLargestLocation(largestPoint);

    }

    public static void printLargestLocation(Location largestPoint) {
        System.out.println("The location of the largest element is " + largestPoint.maxValue +
                " at (" + largestPoint.row + " , " + largestPoint.column + ")");
    }

    public static Location locateLargest(double[][] array) {
        Location largestPoint = new Location();
        largestPoint.maxValue = array[0][0];
        largestPoint.row = 0;
        largestPoint.column = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(largestPoint.maxValue < array[i][j]){
                    largestPoint.maxValue = array[i][j];
                    largestPoint.row = i;
                    largestPoint.column = j;
                }

            }

        }
        return largestPoint;
    }

    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the arrays :");
        int countOfRow = input.nextInt();
        int countOfColumns = input.nextInt();
        double [][] array = new double[countOfRow][countOfColumns];
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }

}

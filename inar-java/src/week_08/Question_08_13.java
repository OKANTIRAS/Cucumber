package week_08;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        double [][] array = createArray();
        int [] location = displayLargestElementsLocation(array);
        System.out.println("The location of the largest element is at (" + location[0] + ", " +
        location[1] + ")");
    }

    public static int[] displayLargestElementsLocation(double [][] array) {
        double [][] largestNumber = new double[1][1];
        int largestRow = 0;
        int largestColumn = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > largestNumber[0][0]){
                    largestNumber[0][0] = array[i][j];
                    largestRow = i;
                    largestColumn = j;
                }
            }
        }
        return new int[]{largestRow,largestColumn};

    }

    public static double [][] createArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        System.out.println("Enter the array: ");
        double [][] array = new double[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }
}

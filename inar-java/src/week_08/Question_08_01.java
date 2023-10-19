package week_08;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        double[][] array = createArray();
        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(array, i));
        }
    }

    public static double sumColumn(double[][] array, int i) {
        int sum = 0;
        for (int j = i; j <= i; j++) {
            for (int k = 0; k < array.length; k++) {
                sum += array[k][i];

            }

        }
        return sum;
    }


    public static double[][] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-by-4 matrix row by row: ");
        double[][] array = new double[3][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }
}

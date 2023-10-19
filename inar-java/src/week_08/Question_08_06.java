package week_08;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.print("Enter matrix1 : ");
        for (int row = 0; row < matrix1.length; row++) {
            for (int colmumn = 0; colmumn < matrix1[row].length; colmumn++) {
                matrix1[row][colmumn] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2 : ");
        for (int row = 0; row < matrix2.length; row++) {
            for (int colmumn = 0; colmumn < matrix2[row].length; colmumn++) {
                matrix2[row][colmumn] = input.nextDouble();
            }
        }
        double [][] multiplyMatrix = multiplyMatrix(matrix1,matrix2);
        printTable(matrix1,matrix2,multiplyMatrix);

    }

    public static void printTable(double[][] matrix1, double[][] matrix2, double[][] multiplyMatrix) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%-5.1f",matrix1[i][j]);
            }
            if (i == 1) {
                System.out.print("   +   ");
            } else {
                System.out.print("       ");
            }
            for (int columnOfMatrix2 = 0; columnOfMatrix2 < matrix2[i].length; columnOfMatrix2++) {
                System.out.printf("%-4.1f ", matrix2[i][columnOfMatrix2]);
            }
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            for (int columnOfSum = 0; columnOfSum < multiplyMatrix[i].length; columnOfSum++) {
                System.out.printf("%-5.1f ", multiplyMatrix[i][columnOfSum]);
            }
            System.out.println();



        }
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double [][] multiplyMatrix = new double[3][3];
        for (int i = 0; i < multiplyMatrix.length; i++) {
            for (int j = 0; j < multiplyMatrix[i].length; j++) {
                multiplyMatrix[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j] +
                        matrix1[i][2] * matrix2[2][j];

            }
        }
        return multiplyMatrix;
    }



}

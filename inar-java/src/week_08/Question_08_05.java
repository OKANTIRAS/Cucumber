package week_08;

import java.util.Scanner;

public class Question_08_05 {
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
        double[][] matrixSum = sumArrays(matrix1,matrix2);
        printTable(matrix1,matrix2,matrixSum);
    }

    public static double[][] sumArrays(double[][] matrix1, double[][] matrix2) {
        double [][] matrixSum = new double[3][3];
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[i].length; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];

            }

        }
        return matrixSum;
    }



    public static void printTable(double[][] matrixSum,double [][] matrix1,double [][] matrix2){
        System.out.println("The matrices are added as follows");
        for (int row = 0; row < matrixSum.length; row++) {
            for (int columnOfMatrix1 = 0; columnOfMatrix1 < matrix1[row].length; columnOfMatrix1++) {
                System.out.printf("%-3.1f ", matrix1[row][columnOfMatrix1]);
            }
            if (row == 1) {
                System.out.print("   +   ");
            } else {
                System.out.print("       ");
            }
            for (int columnOfMatrix2 = 0; columnOfMatrix2 < matrix2[row].length; columnOfMatrix2++) {
                System.out.printf("%-3.1f ", matrixSum[row][columnOfMatrix2]);
            }
            if (row == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            for (int columnOfSum = 0; columnOfSum < matrixSum[row].length; columnOfSum++) {
                System.out.printf("%-3.1f ", matrix2[row][columnOfSum]);
            }
            System.out.println();
        }
    }
}
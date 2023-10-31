package week_08;


import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        int[][] matrix = createArray();
        printMatrix(matrix);
        checkRow(matrix);
        checkColumn(matrix);
        checkMajorDiagonal(matrix);
        checkSubDiagonal(matrix);
    }

    public static void checkSubDiagonal(int[][] matrix) {
        int countOfZero = 0;
        int countOfOne = 0;
        int indexOfColumn = matrix.length -1;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][indexOfColumn] == 0){
                countOfZero++;
            }else{
                countOfOne++;
            }
            indexOfColumn--;
        }
        if(countOfZero == matrix.length){
            System.out.println("All 0s on the sub diagonal");
        }else if(countOfOne == matrix.length){
            System.out.println("All 1s on the sub diagonal");
        }else{
            System.out.println("No same numbers on the sub diagonal");
        }
    }


    public static void checkMajorDiagonal(int[][] matrix) {
        int countOfZero = 0;
        int countOfOne = 0;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][i] == 0){
                countOfZero++;
            }else{
                countOfOne++;
            }
        }
        if(countOfZero == matrix.length){
            System.out.println("All 0s on the major diagonal");
        }else if(countOfOne == matrix.length){
            System.out.println("All 1s on the major diagonal");
        }else{
            System.out.println("No same numbers on the major diagonal");
        }
    }

    public static void checkColumn(int[][] matrix) {
        int countOfZero = 0;
        int countOfOne = 0;
        int countNoNumber = 0;
        for (int i = 0; i < matrix.length; i++) {
            countOfZero = 0;
            countOfOne = 0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] == 0){
                    countOfZero++;
                }else{
                    countOfOne++;
                }

            }
            if(countOfZero == matrix.length){
                System.out.println("All 0s on column " + i);
            }else if(countOfOne == matrix.length){
                System.out.println("All 1s on column " + i);
            }else{
                countNoNumber++;
            }
        }
        if(countNoNumber == matrix.length){
            System.out.println("No same number on a column");
        }

    }

    public static void checkRow(int[][] matrix) {
        int countOfZero = 0;
        int countOfOne = 0;
        int countNoNumber = 0;
        for (int i = 0; i < matrix.length; i++) {
            countOfZero = 0;
            countOfOne = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    countOfZero++;
                }else{
                    countOfOne++;
                }

            }
            if(countOfZero == matrix.length){
                System.out.println("All 0s on row " + i);
            }else if(countOfOne == matrix.length){
                System.out.println("All 1s on row " + i);
            }else{
                countNoNumber++;
            }
        }
        if(countNoNumber == matrix.length){
            System.out.println("No same number on a row");
        }


    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();

        }
    }


    public static int[][] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size for the matrix: ");
        int sizeOfMatrix = input.nextInt();
        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }
}

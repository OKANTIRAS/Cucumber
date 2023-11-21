package week_11;


import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        int[][] array = createArray();
        printArray(array);
        ArrayList<Integer> largestRows = getLargestRows(array);
        ArrayList<Integer> largestColumns = getLargestColumns(array);
        System.out.println("The largest row index: " + largestRows);
        System.out.println("The largest column index: " + largestColumns);

    }

    public static ArrayList<Integer> getLargestColumns(int[][] array) {
        ArrayList<Integer> largestColumn = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[j][i] == 1) {
                    count++;
                }
                if (count >= max) {
                    max = count;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[j][i] == 1) {
                    count++;
                }
            }
            if (count == max) {
                largestColumn.add(i);
            }

        }
        return largestColumn;
    }

    public static ArrayList<Integer> getLargestRows(int[][] array) {
        int max = 0;
        ArrayList<Integer> largestRow = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    count++;
                }
                if (count >= max) {
                    max = count;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    count++;
                }
                if (count == max) {
                    largestRow.add(i);
                }
            }
        }
        return largestRow;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size n: ");
        int size = input.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
        return array;
    }
}

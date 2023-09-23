package week_06;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numberOfRows = input.nextInt();
        displayPattern(numberOfRows);

    }

    public static void displayPattern(int number) {
        for (int i = 1; i <= number; i++){
            for(int k = 1; k <= number-i; k++){
                System.out.print("  ");
            }for(int l = 0; l < i; l++){
                System.out.print(i-l + " ");
            }
            System.out.println();
        }
    }
}

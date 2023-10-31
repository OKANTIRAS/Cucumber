package week_08;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        int[][] headsTails = fillArray();
        char [][] headTailsChar = convertToChar(headsTails);
        printResult(headTailsChar);

    }

    public static void printResult(char[][] headTailsChar) {
        for (int i = 0; i < headTailsChar.length; i++) {
            for (int j = 0; j < headTailsChar[i].length; j++) {
                System.out.print(headTailsChar[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] convertToChar(int[][] headsTails) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        char [][] headsAndTails = new char[3][3];
        int count = 0;
        for (int i = 0; i < headsAndTails.length; i++) {
            for (int j = 0; j < headsAndTails[i].length; j++) {
                if(headsTails[number][count] == 0){
                    headsAndTails[i][j] = 'H';
                }else{
                    headsAndTails[i][j] = 'T';
                }

            }count++;
        }
        return headsAndTails;
    }

    public static int[][] fillArray() {
        int[][] headsTails = new int[512][9];
        for (int i = 0; i < headsTails.length; i++) {
            for (int j = 0; j < headsTails[i].length; j++) {
                headsTails[i][j] = (int) (Math.random() * 2);
            }
            for (int j = 0; j < i; j++) {
                if (java.util.Arrays.equals(headsTails[j], headsTails[i])) {
                    i--;
                    break;
                }

            }

        }
        return headsTails;

    }
}

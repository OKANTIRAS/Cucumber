package week_07;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        char letter = ' ';

        System.out.print("Enter " + numberOfStudents + " scores: ");

        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }
        for (int i = 0; i < numberOfStudents; i++) {
            letter = getLetter(scores, scores[i]);
            System.out.printf("Student %d score is %d and grade is %s\n",i,scores[i],letter);
        }

    }

    public static int getBestScore(int[] scores) {
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public static char getLetter(int[] scores, int score) {
        int bestScore = getBestScore(scores);
        if (score >= bestScore - 10) {
            return 'A';
        } else if (score >= (bestScore - 20)){
            return 'B';
        } else if (score >= (bestScore - 30)) {
            return 'C';
        } else if (score >= (bestScore - 40)) {
            return 'D';
        } else {
            return 'F';
        }
    }

}

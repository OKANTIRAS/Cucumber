package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String[] students = new String[numberOfStudents];
        System.out.println("Enter the a name for each student: ");
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = input.next();
            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);
        for (int i = sortedScores.length - 1; i >= 0; i--) {
            for (int j = 0; j < scores.length; j++) {
                if (sortedScores[i] == scores[j]) {
                    System.out.println(students[j]);
                    scores[j] = -1;
                }
            }
        }
    }
}











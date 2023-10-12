package week_07;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter scores: (negatives number signifies end): ");

        int[] scores = new int[101];
        int score = input.nextInt();
        int count = 0;
        while (score >= 0) {
            count++;
            scores[score]++;
            score = input.nextInt();
        }
        int average = getAverage(scores, count);
        System.out.println("Average of scores: " + average);
        belowAndAboveToAverage(scores, average);

    }

    public static int getAverage(int[] scores, int count) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != 0) {
                sum += scores[i] * i;
            }
        }
        average = sum / count;
        return average;
    }

    public static void belowAndAboveToAverage(int[] scores, int average) {
        int numberOfAboveOrEqual = 0;
        int numberOfBelow = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i >= average) {
                numberOfAboveOrEqual += scores[i];
            } else {
                numberOfBelow += scores[i];
            }
        }
        System.out.println("Number of scores above or equal to average: " + numberOfAboveOrEqual);
        System.out.println("Number of scores below average: " + numberOfBelow);


    }
}

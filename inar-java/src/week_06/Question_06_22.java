package week_06;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        double approximatelyRoot =sqrt(number);
        System.out.printf("The approximately square root of %d is %.1f",number,approximatelyRoot);

    }
    public static double sqrt(long number){
        double nextGuess = 0;
        double lastGuess = 0;
        double approximateSquare = 1;

        do {
            lastGuess = approximateSquare;
            nextGuess = (lastGuess + number / lastGuess) / 2;
            approximateSquare = nextGuess;

        } while ((Math.abs(nextGuess - lastGuess)) >= 0.0001);

        return approximateSquare;
    }
}

package week_03;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int number = input.nextInt();
        int numberFirstDigit = number / 100;
        int numberSecondDigit = (number % 100) / 10;
        int numberThirdDigit = number % 10;
        int lotteryNumberFirstDigit = (int) (Math.random() * 10);
        int lotteryNumberSecondDigit = (int) (Math.random() * 10);
        int lotteryNumberThirdDigit = (int) (Math.random() * 10);
        System.out.print("The lottery number is " );
        System.out.print(lotteryNumberFirstDigit);
        System.out.print(lotteryNumberSecondDigit);
        System.out.println(lotteryNumberThirdDigit);
        if (numberFirstDigit == lotteryNumberFirstDigit && numberSecondDigit == lotteryNumberSecondDigit && numberThirdDigit == lotteryNumberThirdDigit) {
            System.out.println("Exact order, the award is $10000");
        } else if ((numberFirstDigit == lotteryNumberFirstDigit || numberFirstDigit == lotteryNumberSecondDigit || numberFirstDigit == lotteryNumberThirdDigit) &&
                numberSecondDigit == lotteryNumberFirstDigit || numberSecondDigit == lotteryNumberSecondDigit || numberSecondDigit == lotteryNumberThirdDigit &&
                numberThirdDigit == lotteryNumberFirstDigit || numberThirdDigit == lotteryNumberSecondDigit || numberThirdDigit == lotteryNumberThirdDigit) {
            System.out.println("Matched all digits, the award is $3000 ");
        } else if ((numberFirstDigit == lotteryNumberFirstDigit || numberFirstDigit == lotteryNumberSecondDigit || numberFirstDigit == lotteryNumberThirdDigit) ||
                numberSecondDigit == lotteryNumberFirstDigit || numberSecondDigit == lotteryNumberSecondDigit || numberSecondDigit == lotteryNumberThirdDigit ||
                numberThirdDigit == lotteryNumberFirstDigit || numberThirdDigit == lotteryNumberSecondDigit || numberThirdDigit == lotteryNumberThirdDigit) {
            System.out.println("Matched one digits, the award is $1000 ");
        } else {
            System.out.println("Sorry no match");
        }

    }
}

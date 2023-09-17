package week_05;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two distinct digits): ");
        int yourFirstDigit = input.nextInt();
        int yourSecondDigit = input.nextInt();
        String lotteryNumbers = "";
        while (yourSecondDigit == yourFirstDigit){
            yourSecondDigit = input.nextInt();
        }
        int lotteryFirstDigit = (int)(Math.random() * 10);
        int lotterySecondDigit = (int)(Math.random() * 10);
        lotteryNumbers = lotteryFirstDigit + "" +lotterySecondDigit ;
        System.out.println(lotteryNumbers);

        while (lotterySecondDigit == lotteryFirstDigit){
             lotterySecondDigit = (int)(Math.random() * 10);
        }
        if((yourFirstDigit == lotteryFirstDigit) && (yourSecondDigit == lotterySecondDigit)) {

            System.out.println("Exact Match!! You win $10,000");
        }else if
        ((yourFirstDigit == lotterySecondDigit) && (yourSecondDigit == lotteryFirstDigit)){
            System.out.println("Match all digits but wrong order!! You win $3,000");
        }else if ((yourFirstDigit == lotteryFirstDigit) && (yourSecondDigit != lotterySecondDigit)){
            System.out.println("Match one digit : you win $1,000");
        }else if ((yourFirstDigit != lotteryFirstDigit) && (yourSecondDigit == lotterySecondDigit)){
            System.out.println("Match one digit : you win $1,000");
        }else if ((yourFirstDigit == lotterySecondDigit) && (yourSecondDigit != lotteryFirstDigit)){
            System.out.println("Match one digit : you win $1,000");
        }else if ((yourFirstDigit != lotterySecondDigit) && (yourSecondDigit == lotteryFirstDigit)) {
            System.out.println("Match one digit : you win $1,000");
        }else{
            System.out.println("Sorry no match");
        }



    }
}

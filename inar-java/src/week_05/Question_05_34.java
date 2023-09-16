package week_05;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counterComputerWins = 0;
        int counterUserWins = 0;

       // Enter number 0 to 2
        while (((Math.abs(counterUserWins - counterComputerWins)) <3)){
            System.out.print("scissor (0), rock(1), paper(2): ");
            int number = input.nextInt();
            int randomNumber = (int) (Math.random() * 3);
            if((number == 0) && (randomNumber == 0)){
                System.out.println("The computer is scissor. You are scissor too. It is a draw.");
                System.out.println("Computer wins: " + counterComputerWins);
                System.out.println("User wins: " + counterUserWins);
            }else if ((number == 1) && (randomNumber == 0)) {
                counterUserWins++;
                System.out.println("The computer is scissor. You are rock. You won");
                System.out.println("Computer wins: " + counterComputerWins);
                System.out.println("User wins: " + counterUserWins);
            }else if ((number == 2) && (randomNumber == 0)) {
                counterComputerWins++;
                System.out.println("The computer is scissor. You are paper. Computer won");
                System.out.println("Computer wins: " + counterComputerWins);
                System.out.println("User wins: " + counterUserWins);
            }else if ((number == 0) && (randomNumber == 1)) {
                counterComputerWins++;
                System.out.println("The computer is rock. You are scissor. Computer won");
                System.out.println("Computer wins: " + counterComputerWins);
                System.out.println("User wins: " + counterUserWins);
            }else if ((number == 1) && (randomNumber == 1)) {
                System.out.println("The computer is rock. You are rock too. It is a draw ");
                System.out.println("Computer wins: " + counterComputerWins);
                System.out.println("User wins: " + counterUserWins);
            }else if ((number == 2) && (randomNumber == 1)) {
                counterUserWins++;
                System.out.println("The computer is rock. You are paper. You won");
                System.out.println("Computer wins: " + counterComputerWins);
                System.out.println("User wins: " + counterUserWins);
            }else if ((number == 0) && (randomNumber == 2)) {
                counterUserWins++;
                System.out.println("The computer is paper. You are scissor. You won");
                System.out.println("Computer wins: " + counterComputerWins);
                System.out.println("User wins: " + counterUserWins);
            }else if ((number == 1) && (randomNumber == 2)) {
                counterComputerWins++;
                System.out.println("The computer is paper. You are rock. Computer won");
                System.out.println("Computer wins: " + counterComputerWins);
                System.out.println("User wins: " + counterUserWins);
            }else if ((number == 2) && (randomNumber == 2)) {
                System.out.println("The computer is paper. You are paper. It is a draw");
                System.out.println("Computer wins: " + counterComputerWins);
                System.out.println("User wins: " + counterUserWins);
            }else{
                System.out.println("invalid input");
            }

        }
    }
}

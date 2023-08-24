package week_03;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // enter number 0 for scissor, 1 for rock, 2 for paper
        System.out.print("scissor (0), rock (1), paper (2): ");
        int number = input.nextInt();
        int computerNumber =(int) (Math.random() * 3);
        switch (number) {
            case 0 :
                if(computerNumber == 0) {
                    System.out.println("The computer is scissor. You are scissor too. It is draw");
                }else if(computerNumber == 1) {
                    System.out.println("The computer is rock. You are scissor. Computer won");
                }else{
                    System.out.println("The computer is paper. You are scissor. You won");
                }break;
            case 1:
                if(computerNumber == 0) {
                    System.out.println("The computer is scissor. You are rock. You won");
                }else if(computerNumber == 1) {
                    System.out.println("The computer is rock. You are rock too. It is draw");
                }else{
                    System.out.println("The computer is paper. You are rock. Computer won");
                }break;
            case 2 :
                if(computerNumber == 0) {
                    System.out.println("The computer is scissor. You are paper. Computer won");
                }else if(computerNumber == 1) {
                    System.out.println("The computer is rock. You are paper. You won");
                }else{
                    System.out.println("The computer is paper. You are paper. It is draw");
                }break;


        }
    }
}

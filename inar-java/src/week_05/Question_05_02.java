package week_05;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int correctCount = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++ ){
            int number1 = (int)(Math.random() * 16);
            int number2 = (int)(Math.random() * 16);
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();
            if(answer == (number1 + number2)){
                System.out.println("You are correct");
                ++correctCount;
            }else{
                System.out.println("your answer is wrong");
                System.out.println(number1 + " + " + number2 + " should be " +
                        (number1 + number2));

            }

        }
        System.out.println("Correct count is " + correctCount);
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Test time is " + testTime / 1000 + " seconds");
    }
}

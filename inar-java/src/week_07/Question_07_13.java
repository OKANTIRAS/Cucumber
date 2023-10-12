package week_07;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers to exclude from random (1 - 54): ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int generatedNumber = getRandom(numbers);
        System.out.println("Number generated : " + generatedNumber);

    }

    public static int getRandom(int[] numbers) {
        int randomNumber = 0;
        boolean isTrue = true;
        while (isTrue) {
            randomNumber = (int) (Math.random() * 55 + 1);
            for (int i = 0; i < numbers.length; i++) {
                if (randomNumber == numbers[i]) {
                    isTrue = false;
                    break;

                }

            }
            if(!isTrue){
                isTrue = true;

            }else{
                isTrue = false;
            }
        }
        return randomNumber;
    }

}

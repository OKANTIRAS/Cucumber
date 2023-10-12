package week_07;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[] numbers = new int[100];
        int number;
        do {
            number = input.nextInt();
            if (number != 0) {
                numbers[number - 1]++;
            }
        } while ( number != 0);
        printNumber(numbers);

    }

    public static void printNumber(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                System.out.print((i+1) + " occurs " + numbers[i]);
                if(numbers[i] == 1){
                    System.out.println(" time");
                }else{
                    System.out.println(" times");
                }
            }

        }
    }

}


package week_07;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {
        int[] numbers = createArray();
        printNumbers(numbers);


    }

    public static int[] createArray() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

        }
        return numbers;
    }
    public static void printNumbers(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i == 0 && j == 0){
                    continue;
                }
                System.out.println(i + " " +  j);

            }

        }
    }
}

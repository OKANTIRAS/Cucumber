package week_07;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");

        int [] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        int [] newNumbers = reverseArray(numbers);
        for(int i = 0 ; i <newNumbers.length; i++){
            System.out.print(newNumbers[i] + " ");
        }
    }
    public static int [] reverseArray(int [] numbers){
        int [] newNumbers = new int[numbers.length];
        for(int i = numbers.length -1, k = 0; i >= 0;  i-- ,k++){
            newNumbers[k] = numbers[i];

        }
        return newNumbers;
    }

}

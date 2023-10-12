package week_07;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int [] numbers = new int[10];
        for(int i = 0; i <numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        int [] eliminateDuplicates = eliminatesDuplicates(numbers);
    }
    public static int [] eliminatesDuplicates(int [] numbers ) {
        int [] newList = new int[numbers.length];
        // 1 ,2 ,3, 2, 1, 6, 3, 4, 5, 2
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            newList[count] = numbers[i];
            for (int j = 0; j <= i; j++) {
               if(newList[j] == numbers[i]){
                   newList[i] = 0;
                   count--;
                   break;

               }
               count++;


            }
            int [] newlist = new int[count];

        }
        return newList;

    }
}

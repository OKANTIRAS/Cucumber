package week_07;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        int[] numbers = new int[10];
        int number ;
        int numberOfDistincts = 0;
        for (int i = 0; i <= numberOfDistincts; i++) {
            number = input.nextInt();
            if(!(contains(numbers,numberOfDistincts,number))){
                numbers[numberOfDistincts] = number;
                numberOfDistincts++;
            }

        }
        System.out.println("The number of distinct numbers is: " + numberOfDistincts);
        System.out.print("The distinct numbers are: ");
        for(int i = 0; i < numberOfDistincts; i++){
            System.out.print(numbers[i] + " ");
        }

    }
    public static boolean contains(int [] numbers , int numberOfDistincts, int number){
        boolean isContain = false;
        for( int i = 0; i < numberOfDistincts; i++){
            if(numbers[i] == number){
                isContain = true;
            }
        }
        return isContain;
    }

}

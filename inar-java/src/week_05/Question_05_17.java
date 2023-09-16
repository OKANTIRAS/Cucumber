package week_05;

import java.util.Scanner;

public class Question_05_17 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        // Enter integer between 1 - 15
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        while(!((1 <= number) && ( number <= 15))){
            System.out.println("Invalid input please enter again ");
            number= input.nextInt();
        }
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number -i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(i-j + " ");
            }
            for( int j = 2; j <= i; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

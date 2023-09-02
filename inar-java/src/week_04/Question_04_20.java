package week_04;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String sentence = input.nextLine();

        System.out.printf("Length of the String is: %d \n", sentence.length() );
        System.out.printf("First character of the string: %c",  sentence.charAt(0) );
    }
}

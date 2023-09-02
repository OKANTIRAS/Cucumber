package week_04;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter =input.next().charAt(0);

        if(('A' <= letter && letter <= 'Z') || ('a' <= letter && letter <= 'z') ) {
            if ((letter == 'a' || letter == 'A') || (letter == 'e' || letter == 'E') || (letter == 'I' || letter == 'i') ||
                    (letter == 'o' || letter == 'O') || (letter == 'U' || letter == 'u')) {
                System.out.println(letter + " is vowel");
            } else {
                System.out.println(letter + " is consonant");
            }
        }else{
            System.out.println("invalid input");
        }
    }
}

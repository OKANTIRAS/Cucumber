package week_04;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        char letter = input.next().charAt(0);
        if(letter == 'A'){
            System.out.println("The numeric value for grade " + letter + " is 4");
        } else if (letter == 'B'){
            System.out.println("The numeric value for grade " + letter + " is 3");
        }else if (letter == 'C') {
            System.out.println("The numeric value for grade " + letter + " is 2");
        }else if  (letter == 'D'){
            System.out.println("The numeric value for grade " + letter + " is 1");
        }else if   (letter == 'F') {
            System.out.println("The numeric value for grade " + letter + " is 0");
        }else {
            System.out.println(letter + " is an invalid grade");
        }
    }
}

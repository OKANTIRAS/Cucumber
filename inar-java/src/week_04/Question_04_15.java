package week_04;

import java.util.Scanner;

public class Question_04_15 {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = input.next();
        if((letter.equalsIgnoreCase("A")) || (letter.equalsIgnoreCase("B")) ||
                (letter.equalsIgnoreCase("C"))){
            System.out.println("The corresponding number is 2");
        }else if ((letter.equalsIgnoreCase("d")) || (letter.equalsIgnoreCase("e")) ||
                (letter.equalsIgnoreCase("f"))){
            System.out.println("The corresponding number is 3");
        }else if ((letter.equalsIgnoreCase("g")) || (letter.equalsIgnoreCase("h")) ||
                (letter.equalsIgnoreCase("i"))) {
            System.out.println("The corresponding number is 4");
        }else if ((letter.equalsIgnoreCase("j")) || (letter.equalsIgnoreCase("k")) ||
                (letter.equalsIgnoreCase("l"))) {
            System.out.println("The corresponding number is 5");
        } else if ((letter.equalsIgnoreCase("m")) || (letter.equalsIgnoreCase("n")) ||
                (letter.equalsIgnoreCase("o"))) {
            System.out.println("The corresponding number is 6");
        }else if ((letter.equalsIgnoreCase("p")) || (letter.equalsIgnoreCase("q")) ||
                (letter.equalsIgnoreCase("r")) || (letter.equalsIgnoreCase("s"))) {
            System.out.println("The corresponding number is 7");
        }else if ((letter.equalsIgnoreCase("u")) || (letter.equalsIgnoreCase("v")) ||
                (letter.equalsIgnoreCase("t"))) {
            System.out.println("The corresponding number is 8");
        }else if ((letter.equalsIgnoreCase("w")) || (letter.equalsIgnoreCase("y")) ||
                (letter.equalsIgnoreCase("x")) || (letter.equalsIgnoreCase("z"))) {
            System.out.println("The corresponding number is 9");
        }else{
            System.out.println(letter + " is an invalid value");
        }
    }
}

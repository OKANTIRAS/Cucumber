package week_06;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int numberOfLetter  = countLetters(str);
        System.out.printf("The number of letters in the string %s : %d",str,numberOfLetter);
    }
    public static int countLetters(String str){
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                counter++;
            }
        }
        return counter;
    }

}

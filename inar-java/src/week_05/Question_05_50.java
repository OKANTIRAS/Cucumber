package week_05;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();
        int uppercasecount = 0;

        for(int i = 0; i <= text.length() - 1; i++){
            if('A' <= text.charAt(i) && text.charAt(i) <= 'Z'){
                uppercasecount++;
            }
        }
        System.out.printf("%s The number of uppercase letters is %d",text,uppercasecount);
    }
}

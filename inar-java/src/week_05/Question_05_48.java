package week_05;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        String newText = "";

        for(int i = 0; i <= text.length() - 1; i++){
            if(i % 2 == 0 ){
                newText += text.charAt(i);
            }

        } System.out.println(newText);
    }
}

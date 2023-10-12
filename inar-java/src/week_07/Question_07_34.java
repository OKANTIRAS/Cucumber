package week_07;

import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to sort: ");
        String text = input.nextLine();
        text = text.toLowerCase();
        String newText = sort(text);
        System.out.println(newText);

    }

    public static String sort(String text) {
        char[] charsOfText = new char[text.length()];
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            charsOfText[i] = text.charAt(i);
        }
        for (int i = 0; i < charsOfText.length; i++) {
            char min = charsOfText[i];
            int minIndex = i;
            for (int j = i + 1; j < charsOfText.length; j++) {
                if (charsOfText[j] - 'a' < min - 'a') {
                    min = charsOfText[j];
                    minIndex = j;

                }
            }
            if (minIndex != i) {
                charsOfText[minIndex] = charsOfText[i];
                charsOfText[i] = min;
            }


        }
        for (int j = 0; j < charsOfText.length; j++) {
            result += charsOfText[j];
        }
        return result;
    }
}








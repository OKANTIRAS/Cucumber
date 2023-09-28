package week_06;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            String newStr = "";
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                newStr += getNumber(ch);
            } else {
                newStr += ch;
            }
            System.out.print(newStr);
        }
    }

    public static int getNumber(char ch) {
        ch = Character.toUpperCase(ch);
        int number = 0;
        if (ch == 'A' || ch == 'B' || ch == 'C') {
            number = 2;
        } else if (ch == 'D' || ch == 'E' || ch == 'F') {
            number = 3;
        } else if (ch == 'G' || ch == 'H' || ch == 'I') {
            number = 4;
        } else if (ch == 'J' || ch == 'K' || ch == 'L') {
            number = 5;
        } else if (ch == 'M' || ch == 'N' || ch == 'O') {
            number = 6;
        } else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
            number = 7;
        } else if (ch == 'T' || ch == 'U' || ch == 'V') {
            number = 8;
        } else if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
            number = 9;
        }else {
            System.out.println("Invalid input");
        }
        return number;
    }
}

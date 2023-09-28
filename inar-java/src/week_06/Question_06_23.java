package week_06;

import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();

        System.out.print("Enter a character that you want to count: ");
        char ch = input.next().charAt(0);

        int count = count(str,ch);
        System.out.println(count);

    }
    public static int count(String str,char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            if(letter == ch){
                count++;
            }
        }
        return count;

    }
}

package week_06;

import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();
        String format = format(number,width);

        System.out.printf("%d formatted to width %d: %s",number,width,format);
    }
    public static String format(int number, int width){
        String format = "";
        String strNumber = Integer.toString(number);
        int numberOfDigit = strNumber.length();
        int numberOfZero = width - numberOfDigit;
        for(int i = 1; i <= numberOfZero; i++){
            format += 0;
        }
        format += strNumber;
        return format;
    }
}

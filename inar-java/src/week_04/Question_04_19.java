package week_04;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer:");
        String number = input.next();
        int lastDigit =((((int) number.charAt(0) * 1) + ((int) number.charAt(1) * 2) ) + ((int) number.charAt(2) * 3) +
                ((int) number.charAt(3) * 4) + ((int) number.charAt(4) * 5) + ((int) number.charAt(5) * 6) +
                ((int) number.charAt(6) * 7) + ((int) number.charAt(7) * 8) + ((int) number.charAt(8) * 9)) % 11;
        if(lastDigit == 10 ){
            System.out.println(number + "X");
        }else{
            System.out.println(number + lastDigit);
        }


    }
}

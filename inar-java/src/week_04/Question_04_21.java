package week_04;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String number = input.nextLine();

        if(number.length() != 11 ){
            System.out.println("invalid input");
            System.exit(1);
        }
        if(('0' <= number.charAt(0) && number.charAt(0) <= '9') && ('0' <= number.charAt(1) && number.charAt(1) <= '9') &&
                ('0' <= number.charAt(2) && number.charAt(2) <= '9') && (number.charAt(3) == '-') && ('0' <= number.charAt(4) && number.charAt(4) <= '9') &&
                ('0' <= number.charAt(5) && number.charAt(5) <= '9') && (number.charAt(6) == '-') && ('0' <= number.charAt(7) && number.charAt(7) <= '9') &&
                ('0' <= number.charAt(8) && number.charAt(8) <= '9') && ('0' <= number.charAt(9) && number.charAt(9) <= '9') && ('0' <= number.charAt(10) && number.charAt(10) <= '9')){
            System.out.printf("%s is a valid social security number", number);
        }else{
            System.out.printf("%s is a invalid social security number", number);
        }
    }
}

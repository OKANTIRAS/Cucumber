package week_12;

import java.util.Scanner;

public class Question_12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = input.nextLine();
        try {
            int decimalNumber = bin2Dec(binaryNumber);
            System.out.println("The decimal value for binary number " + binaryNumber +
                    " is " + decimalNumber);
        } catch (BinaryCustomException ex) {
            System.out.println(ex);
        }
    }

    public static int bin2Dec(String binaryNumber)throws BinaryCustomException {
        int decimal = 0;
        int exponent = 0;
        for (int i = binaryNumber.length() - 1; i >= 0 ; i--) {
            char binary = binaryNumber.charAt(i);
            decimal = charToDecimal(binary,exponent);
            exponent++;
        }
        return decimal;
    }
    public static int charToDecimal(char ch,int exponent)throws BinaryCustomException{
        if(ch == '1'){
            return (int)(Math.pow(2,exponent));
        }else if(ch == '0'){
            return 0;
        }else {
            throw new BinaryCustomException();
        }
    }
}

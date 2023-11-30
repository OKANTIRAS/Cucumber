package week_12;

import java.util.Scanner;

public class Question_12_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexNumber: ");
        String hexNumber = input.nextLine();
        try {
            int number = hexToDecimal(hexNumber);
            System.out.println("The decimal value for hex number " + hexNumber + " is " + number);
        } catch (HexFormatException ex) {
            System.out.println(ex);
        }
    }

    public static int hexToDecimal(String hexNumber)throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            char hexChar = hexNumber.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;

    }

    public static int hexCharToDecimal(char ch) throws HexFormatException {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (Character.isDigit(ch)) {
            return ch - '0';
        } else {
            throw new HexFormatException();
        }
    }
}

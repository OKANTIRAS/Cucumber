package week_12;

import java.util.Scanner;

public class Question_12_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = input.nextLine();
        try {
            int number = bin2Dec(binaryNumber);
            System.out.println("The decimal value for binary number " + binaryNumber + " is "
                    + number);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
    }

    public static int bin2Dec(String binaryNumber) {
        int exponent = 0;
        int decimal = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            char charOfBinary = binaryNumber.charAt(i);
            decimal += charToDec(charOfBinary, exponent);
            exponent++;
        }
        return decimal;
    }

    public static int charToDec(char ch, int exponent) throws NumberFormatException {
        if (ch == '1') {
            return (int) Math.pow(2, exponent);
        } else if (ch == '0') {
            return 0;
        }else{
            throw new NumberFormatException ("It is not a binary String ");
        }


        }
    }

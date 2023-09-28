package week_06;

import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long cardNumber = input.nextLong();
        int sizeOfCard = getSize(cardNumber);
        int sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(cardNumber);
        int sumOfOddPlace = sumOfOddPlace(cardNumber);
        int digitValue = getDigit(cardNumber);
        System.out.println(cardNumber);
        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid");
        } else {
            System.out.println(cardNumber + " is invalid");
        }
    }

    public static int getSize(long cardNumber) {
        String strCardNumber = Long.toString(cardNumber);
        int size = strCardNumber.length();
        return size;
    }

    public static int sumOfDoubleEvenPlace(long cardNumber) {
        int sumOfDoubleEvenPlace = 0;
        String strCardNumber = Long.toString(cardNumber);
        for (int i = 0; i < strCardNumber.length(); i++) {
            if (i % 2 == 0) {
                if (((strCardNumber.charAt(i) - '0') * 2) > 9) {
                    sumOfDoubleEvenPlace += getDigit(cardNumber);
                } else {
                    sumOfDoubleEvenPlace += ((strCardNumber.charAt(i) - '0') * 2);
                }
            }
        }
        return sumOfDoubleEvenPlace;
    }

    public static int sumOfOddPlace(long cardNumber) {
        int sumOfOddPlace = 0;
        String strCardNumber = Long.toString(cardNumber);
        for (int i = 0; i < strCardNumber.length(); i++) {
            if (i % 2 != 0) {
                sumOfOddPlace += ((strCardNumber.charAt(i) - '0'));
            }
        }
        return sumOfOddPlace;
    }

    public static int getDigit(long cardNumber) {
        int digitValue = 0;
        int sum = 0;
        String strCardNumber = Long.toString(cardNumber);
        for (int i = 0; i < strCardNumber.length(); i++) {
            if ((strCardNumber.charAt(i) - '0') * 2 > 9) {
                int firstDigit = (strCardNumber.charAt(i) - '0') % 10;
                int secondDigit = (strCardNumber.charAt(i) - '0') / 10;
                sum = firstDigit + secondDigit;
            }
        }
        return sum;
    }

    public static boolean isDivisibleTen(long cardNumber) {
        int sumOfOddPlace = sumOfOddPlace(cardNumber);
        int sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(cardNumber);
        int totalSum = sumOfDoubleEvenPlace + sumOfOddPlace;
        if (totalSum % 10 != 0) {
            return false;
        }
        return true;
    }

    public static boolean isValid(long cardNumber) {
        boolean isValid = false;
        String strCardNumber = Long.toString(cardNumber);
        for (int i = 0; i < strCardNumber.length(); i++) {
            if (strCardNumber.charAt(0) == 4 || strCardNumber.charAt(0) == 5 || strCardNumber.charAt(0) == 6 ||
                    (strCardNumber.charAt(0) == 3 && strCardNumber.charAt(0) == 7)) {
                isValid = true;

            }
        }
        if (isDivisibleTen(cardNumber)) {
            isValid = true;
        }

        if (isValidSize(cardNumber)) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }

    public static boolean isValidSize(long cardNumber){
        String strCardNumber = Long.toString(cardNumber);
        if(strCardNumber.length() < 16 && strCardNumber.length() > 13){
            return true;
        }else {
            return false;
        }

    }
}

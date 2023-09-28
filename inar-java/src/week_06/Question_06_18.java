package week_06;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = input.nextLine();
        isValidPassword(password);
    }

    public static void isValidPassword(String password) {
        if (isAtLeastEightCharacter(password) && isConsistOfOnlyLettersOrDigit(password) &&
                isContainAtLeastTwoDigits(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");

        }
    }

    public static boolean isAtLeastEightCharacter(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isConsistOfOnlyLettersOrDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!(Character.isDigit(ch) || Character.isLetter(ch))){
                return false;
            }else{
            }
        }
        return true;
    }
    public static boolean isContainAtLeastTwoDigits(String password){

        int counter = 0;
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(Character.isDigit(ch)){
                counter++;
            }
        }if(!(counter >= 2)){
            return false;
        }else{
            return true;
        }
    }
}

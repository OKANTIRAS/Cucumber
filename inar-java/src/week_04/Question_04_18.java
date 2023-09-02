package week_04;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters");
        /* firs character is first letter of job and second is grade
        1 for freshman, 2 for sophomore and so */
        String characters = input.next();

        if(characters.length() > 2){
            System.out.println("You entered mote character");
            System.exit(1);
        }if(characters.charAt(0) == 'M'){
            System.out.print("Mathematics");
        }else if(characters.charAt(0) == 'C') {
            System.out.print("Computer Science");
        }else if (characters.charAt(0) == 'I') {
            System.out.print("Information Technology");
        }else{
            System.out.println("invalid input");
        }
        if(characters.charAt(1) == '1'){
            System.out.print(" Freshman");
        }else if (characters.charAt(1) == '2') {
            System.out.print(" Sophomore");
        }else if (characters.charAt(1) == '3') {
            System.out.print(" Junior");
        }else if  (characters.charAt(1) == '4') {
            System.out.print(" Senior");
        }else {
            System.out.println("invalid input");
        }
    }
}

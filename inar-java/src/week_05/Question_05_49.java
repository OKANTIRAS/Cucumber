package week_05;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i <= text.length() - 1; i++){

            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'u' || text.charAt(i) == 'ı' || text.charAt(i) == 'o' ||
                    text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'U' || text.charAt(i) == 'O' || text.charAt(i) == 'I' ){
                vowels++;
            }else {
                consonants++;
            }
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);

    }
}

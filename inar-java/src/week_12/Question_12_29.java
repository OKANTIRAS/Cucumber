package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_29 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String path = "C:\\Users\\OKAN\\Desktop\\workspace\\inar-java\\src\\week_12" + input.nextLine();

        File file =new File(path);
        Scanner scn = new Scanner(file);
        String page = "";
        while (scn.hasNext()){
            page += scn.nextLine() + "\n";
        }
        int [] letters = getCountOfLetters(page);
        printCountOfLetters(letters);


    }

    public static void printCountOfLetters(int[] letters) {
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Number of " + (char) ('A' + i) + "'s: " + letters[i] );

        }
    }

    public static int[] getCountOfLetters(String page) {
        int [] letters = new int['Z' - 'A' + 1];
        for (int i = 0; i < page.length(); i++) {
            if(Character.isLetter(page.charAt(i))){
                char currentLetter = Character.toUpperCase(page.charAt(i));
                letters[currentLetter - 'A']++;
            }

        }
        return letters;
    }
}

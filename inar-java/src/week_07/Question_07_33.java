package week_07;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        String [] animals = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit",
        "dragon", "snake", "horse", "sheep"};

        int year = input.nextInt();
        int index = year % 12;

        System.out.println(year + " is a year of " + animals[index] + " in zodiac");
    }
}

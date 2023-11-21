package week_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        ArrayList<Integer>integers = getIntegers();
        System.out.println("Before shuffling");
        printlist(integers);
        shuffle(integers);
        System.out.println();
        System.out.println("After shuffling");
        printlist(integers);

    }

    private static void printlist(ArrayList<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");

        }
    }

    private static ArrayList<Integer> getIntegers() {
        ArrayList<Integer>integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers ending with 0: ");

        int value;
        do {
            value = input.nextInt();
            integers.add(value);
        }while (value != 0);
        return integers;
    }
    public static void shuffle(ArrayList<Integer> integers){
         Collections.shuffle(integers);
    }
}

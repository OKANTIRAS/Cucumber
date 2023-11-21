package week_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer>integers = getIntegers();
        System.out.println("Before sorting..");
        System.out.println(integers);

        System.out.println("After sorting..");
        sort(integers);
        System.out.println(integers);
    }

    public static ArrayList<Integer> getIntegers() {
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
    public static void sort(ArrayList<Integer>integers){
        Collections.sort(integers);
    }
}

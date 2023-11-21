package week_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = getIntegers();
        double sum = sum(integers);
        System.out.println("Sum of list: " + sum);

    }

    public static ArrayList<Integer> getIntegers() {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        int value;
        int count = 0;
        do {
            value = input.nextInt();
            integers.add(value);
            count++;

        } while (count < 5);
        return integers;
    }

    public static double sum(ArrayList<Integer> integers){
        double size = 0;
        for (int i = 0; i < integers.size(); i++) {
            size += integers.get(i);
        }
        return size;
    }

}

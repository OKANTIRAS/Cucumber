package week_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = getIntegers();
        removeDuplicate(integers);
        System.out.println("The distinct integers are: " + integers);

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
    public static void removeDuplicate(ArrayList<Integer>integers){
        for (int i = 0; i < integers.size() - 1; i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                if(integers.get(i).equals(integers.get(j))){
                    integers.remove(i);
                }
            }
        }
    }

}

package week_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getListFromUser();
        printMax(list);
    }

    private static ArrayList<Integer> getListFromUser() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers ending with 0 :");
        int value;
        do {
            value = input.nextInt();
            list.add(value);
        }while (value != 0);
        return list;
    }
    public static void printMax(ArrayList<Integer> list){
        System.out.println("The largest number in the list is " + Collections.max(list).toString() );
    }
}

package week_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> integers1 = getIntegers();
        ArrayList<Integer> integers2 = getIntegers();
        ArrayList<Integer> unionList = union(integers1,integers2);
        System.out.println("The combined list is " + unionList);


    }
    public static ArrayList<Integer> getIntegers() {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers for list: ");
        int value;
        int count = 0;
        do {
            value = input.nextInt();
            integers.add(value);
            count++;

        } while (count < 5);
        return integers;
    }
    public static ArrayList<Integer>union(ArrayList<Integer>integers1,ArrayList<Integer>integers2){
        ArrayList<Integer>unionList = new ArrayList<>();

        for (int i = 0; i < integers1.size() ; i++) {
            unionList.add(integers1.get(i));
        }
        for (int i = 0; i < integers2.size() ; i++) {
            unionList.add(integers2.get(i));
        }
        return unionList;
    }

}

package week_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Question_14_02 {
    public static void main(String[] args) {
        ArrayList<Integer>list = generateNumbers();
        System.out.print("Generated ArrayList: \n" + list);
        Set<Integer>removedDuplicate = fillNumbers(list);
        System.out.print("\nArrayList after removing duplicates :\n" + removedDuplicate);

    }

    public static Set<Integer> fillNumbers(ArrayList<Integer> list) {
        Set<Integer>removedDuplicate = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            removedDuplicate.add(list.get(i));
        }
        return removedDuplicate;
    }

    public static ArrayList<Integer> generateNumbers() {
        ArrayList<Integer>listNumber = new ArrayList<>();
        int count = 0;
        while(count < 50){
            int number = (int)(Math.random() * 100);
            listNumber.add(number);
            count++;
        }
        return listNumber;
    }



}

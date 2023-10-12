package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {
        int [] list1 = createList();
        int [] list2 = createList();

        if(isIdentical(list1,list2)){
            System.out.println("Two lists are identical");
        }else{
            System.out.println("Two list are not identical");
        }
    }

    public static boolean isIdentical(int[] list1, int[] list2) {
        boolean isIdentical = false;
        if (list1.length != list2.length) {
            return false;
        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        if(Arrays.equals(list1,list2)){
            isIdentical = true;

        }
        return isIdentical;
    }

    public static int [] createList(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int sizeOfArray = input.nextInt();
        int [] list = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            list[i] = input.nextInt();

        }
        return list;


    }
}

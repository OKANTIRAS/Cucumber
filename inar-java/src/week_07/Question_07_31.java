package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int sizeOfArray1 = input.nextInt();
        int [] list1 = new int[sizeOfArray1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int sizeOfArray2 = input.nextInt();
        int [] list2 = new int[sizeOfArray2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();

        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        int [] mergedList = merge(list1,list2);
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }
    }

    private static int[] merge(int[] list1, int[] list2) {
        int count = 0;
        int [] mergedList = new int[list1.length + list2.length];
        for (int i = 0; i < mergedList.length; i++) {
            if(i < list1.length){
            mergedList[i] = list1[i];
            }else{
                mergedList[i] = list2[count];
                count++;
            }
        }
        Arrays.sort(mergedList);
        return mergedList;
    }

}

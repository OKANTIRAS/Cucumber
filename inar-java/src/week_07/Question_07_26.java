package week_07;

import java.util.Scanner;

public class Question_07_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1: ");
        int sizeOfArray1 = input.nextInt();
        int[] list1 = new int[sizeOfArray1];
        for (int i = 0; i < sizeOfArray1; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter list2: ");
        int sizeOfArray2 = input.nextInt();
        int[] list2 = new int[sizeOfArray1];
        for (int i = 0; i < sizeOfArray1; i++) {
            list2[i] = input.nextInt();
        }
        if(equals(list1,list2)){
            System.out.print("Two lists are strictly identical");
        }else{
            System.out.print("Two lists are not strictly identical");
        }

    }
    public static boolean equals(int [] list1, int [] list2){
        boolean equals = true;
        for (int i = 0; i < list1.length; i++) {
            for (int j = i; j <= i ; j++) {
                if(list1[i] == list2[j]){
                    equals = true;

                }else {
                    equals = false;
                }

            }

        }
        return equals;
    }


}

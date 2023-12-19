package week_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>arrayListA = new ArrayList<>();
        ArrayList<Integer>arrayListB = new ArrayList<>();
        ArrayList<Integer>arrayListC = new ArrayList<>();

        System.out.print("Enter the size 'n' for ArrayList A: ");
        int sizeA = input.nextInt();
        System.out.print("Enter " + sizeA + " Integers for ArraylistA: ");
        for (int i = 0; i < sizeA; i++) {
            int number = input.nextInt();
            arrayListA.add(number);
        }
        System.out.print("Enter the size 'n' for ArrayList B: ");
        int sizeB = input.nextInt();
        System.out.print("Enter " + sizeB + " Integers for ArraylistB: ");
        for (int i = 0; i < sizeB; i++) {
            int number = input.nextInt();
            arrayListB.add(number);
        }
        Collections.sort(arrayListA);
        Collections.sort(arrayListB);
        Collections.reverse(arrayListB);
        arrayListC.addAll(arrayListA);
        arrayListC.addAll(arrayListB);
        System.out.println("Merged and sorted ArraylistC: ");
        System.out.println(arrayListC);





    }
}

package week_07;

import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        System.out.print("Enter list: ");
        int [] array = createArray();
        if(isSorted(array)){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }
    }

    public static int[] createArray() {
        Scanner input = new Scanner(System.in);
        int sizeOfArray = input.nextInt();
        int [] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }
        return array;
    }
    public static boolean isSorted(int [] array){
        boolean isSorted = true;
        for (int i = 0; i < array.length; i++) {
            if(i == (array.length -1)){
                continue;
            }
            if(array[i] <= array[i+1]){
                isSorted = true;

            }else{
                isSorted = false;
            }

        }
        return isSorted;
    }

}

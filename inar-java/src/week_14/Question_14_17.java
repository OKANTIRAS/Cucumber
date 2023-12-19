package week_14;

import java.util.*;

public class Question_14_17 {
    public static void main(String[] args) {
        ArrayList<Integer>list = getList();
        int [] numbers = createArray(list);
        printMostOccurrence(numbers);
    }

    public static void printMostOccurrence(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]){
                max = numbers[i];
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == max){
                System.out.println(i + " --> " + numbers[i] + " times");
            }

        }
    }

    public static int[] createArray(ArrayList<Integer> list) {
        int [] numbers = new int[100];
        for (int i = 0; i < list.size(); i++) {
            numbers[list.get(i)]++;
        }
        return numbers;
    }


    public static ArrayList<Integer> getList() {
        ArrayList<Integer>list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (enter 0 to stop):");
        int number = input.nextInt();
        while (number != 0){
            number = input.nextInt();
            list.add(number);
        }
        return list;
    }
    

}

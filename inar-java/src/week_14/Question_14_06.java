package week_14;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Question_14_06 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = getRandomlyGeneratedList();
        System.out.println("Original list:");
        System.out.println(numbers);
        arrangeList(numbers);
        System.out.println("Rearranged list ");
        System.out.println(numbers);

    }

    public static void arrangeList(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if(isEven(numbers.get(i))){
                int tempt = numbers.remove(i);
                numbers.add(tempt);
            }

        }
    }

    public static boolean isEven(Integer integer) {
        if(integer % 2 != 0){
            return false;
        }
        return true;
    }

    public static ArrayList<Integer> getRandomlyGeneratedList() {
        ArrayList<Integer>numbers = new ArrayList<>();
        boolean condition = true;
        while (condition){
            try{
                Scanner input = new Scanner(System.in);

                System.out.println("Enter the size of ArrayList :");
                int size = input.nextInt();
                for (int i = 0; i < size; i++) {
                    int randomNumber = (int)(Math.random() * 100);
                    numbers.add(randomNumber);
                }
                condition = false;
            }catch (InputMismatchException e){
                System.out.println("Wrong input");
            }
        }
        return numbers;
    }

}

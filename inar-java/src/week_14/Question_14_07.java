package week_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_07 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = getArrayList();
        System.out.println(numbers);
        printKthLargestElement(numbers);

    }

    public static void printKthLargestElement(ArrayList<Integer> numbers) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number to determine largest one: ");
        int number = input.nextInt();
        System.out.println("What is the " + number + ". greatest number" );
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println("The " + number + "th largest element is: " + numbers.get(number - 1));
    }

    public static ArrayList<Integer> getArrayList() {
        ArrayList<Integer>numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 100);
            numbers.add(randomNumber);
        }
        return numbers;
    }

}

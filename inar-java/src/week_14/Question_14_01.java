package week_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers: ");
        ArrayList<Integer>numbers = new ArrayList<>();
        ArrayList<Integer>reversedNumbers = new ArrayList<>();
        int count = 0;
        while (count <= 9){
            int number = input.nextInt();
            numbers.add(number);
            count++;
        }
        System.out.println("Generated integers: " + numbers);
        Collections.reverse(numbers);
        reversedNumbers = numbers;
        System.out.println("Reversed list" + reversedNumbers);


    }
}

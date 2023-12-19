package week_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = createArrayList();
        System.out.println("Arraylist after moving zeros to the end: ");
        System.out.println(numbers);
    }

    public static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers for ArrayList nums (enter -1 to stop):");

        int number = input.nextInt();
        int countOfZero = 0;

        while (number != -1){
            if(number == 0) {
                countOfZero++;
            }
            else {
                numbers.add(number);
            }
            number = input.nextInt();
        }
        for (int i = 0; i < countOfZero; i++) {
            numbers.add(0);

        }
        return numbers;
    }

}

package week_07;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int sizeOfArray = input.nextInt();
        int [] numbers = new int[sizeOfArray];
        System.out.println("Enter the values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        if(isConsecutiveFour(numbers)){
            System.out.println("The list has consecutive fours");
        }else{
            System.out.println("The list has no consecutive fours");
        }
    }

    private static boolean isConsecutiveFour(int[] numbers) {
        boolean isConsecutiveFour = false;
        for (int i = 0; i < numbers.length; i++) {
            if(i >= numbers.length - 2 ){
                continue;
            }
            if(numbers[i] == numbers[i + 1] && numbers[i + 1] == numbers[i + 2] &&
                    numbers[i + 2] == numbers[i + 3]){
                isConsecutiveFour = true;
            }
        }
        return isConsecutiveFour;
    }
}

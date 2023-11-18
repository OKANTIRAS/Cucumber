package week_10;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        StackOfIntegers stackOfIntegers = new StackOfIntegers(5);
        for (int i = 2; i <= number ; i++) {
            if(isPrime(i) && number % i == 0){
                number = number / i;
                stackOfIntegers.push(i);
                i--;
            }
        }
        printIncreasedOrder(stackOfIntegers);
        System.out.println();
        printDecreasedOrder(stackOfIntegers);
    }
    public static boolean isPrime(int number){
        for (int i = 2; i <= number / 2 ; i++) {
            if(number % i == 0){
                return false;
            }
        }return true;
    }
    public static void printIncreasedOrder(StackOfIntegers stackOfIntegers){
        System.out.print("Increased order: ");
        for (int i = 0; i < stackOfIntegers.getSize(); i++) {
            System.out.print(stackOfIntegers.getPrimeFactors()[i] + " ");
        }
    }
    public static void printDecreasedOrder(StackOfIntegers stackOfIntegers){
        System.out.print("Decreased order: ");
        while(!stackOfIntegers.isEmpty()){
            System.out.print(stackOfIntegers.pop() + " ");

        }
    }
}

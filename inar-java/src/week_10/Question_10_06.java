package week_10;

public class Question_10_06 {
    public static void main(String[] args) {
        StackOfIntegers integers = new StackOfIntegers(120);

        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                integers.push(i);
            }
        }
        while(!integers.isEmpty()){
            System.out.print(integers.pop() + " ");

        }
    }
        public static boolean isPrime(int number){
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }return true;
        }


    }

package week_07;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter five numbers: ");
        int [] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int gcd = gcd(numbers);
        System.out.println("The greatest common divisior is " + gcd);
    }
    public static int gcd(int [] numbers){
        int min = min(numbers);
        int gcd = 0;
            for (int j = 2; j <= min; j++) {
                if(numbers[0] % j == 0 && numbers[1] % j == 0 &&
                        numbers[2] % j == 0 && numbers[3] % j == 0 && numbers[4] % j == 0){
                    gcd = j;
                }

            }

        return gcd;
    }
    public static int min(int [] numbers){
        int min = 1000;
        for (int i = 0; i < numbers.length; i++) {
          if(min > numbers[i]){
              min = numbers[i];
          }
        }
        return min;
    }
}

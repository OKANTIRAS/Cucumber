package week_06;

import java.util.Scanner;

public class Question_06_01 {
    public static void main(String[] args) {
        System.out.println("The first 100 pentagonal numbers, ten per line: ");
        int counter = 0;
        for (int number = 1; number <= 100; number++) {
            System.out.printf("%5d ",getPentagonalNumber(number));
            counter++;
            if(counter % 10 == 0){
                System.out.println();
            }

        }
    }
        public static int getPentagonalNumber(int number){
            int pentagonalNumber = number * ((3 * number) - 1) / 2;
            return pentagonalNumber;
        }
}


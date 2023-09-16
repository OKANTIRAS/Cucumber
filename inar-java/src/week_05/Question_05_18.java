package week_05;

import java.util.Scanner;

public class Question_05_18 {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.print("------------------------------------------------ \n");

        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 7-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.print("---------------------------------------------------\n");

        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 6-i; j++){
                System.out.print(" ");
            }for(int k = 0; k < i; k++){
                System.out.print(i-k );
            }
            System.out.println();
        }
        System.out.print("--------------------------------------------------\n");

        for(int i = 1; i <= 6; i++){;
            for(int k = 1; k <= 7-i; k++){
                System.out.print(k);
            }
            System.out.println();

        }
        System.out.print("-------------------------------------------------\n");


    }




}

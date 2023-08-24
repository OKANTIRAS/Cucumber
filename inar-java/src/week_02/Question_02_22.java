package week_02;

import java.util.Scanner;

public class Question_02_22 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount as integer, for example 1156 for 11.56: ");
        int amount = input.nextInt();
        int dollars = amount / 100;
        int quarters =(amount % 100) / 25;
        int remainigAmount = (amount % 100) % 25;
        int dimes = remainigAmount / 10;
        remainigAmount = remainigAmount % 10;
        int nickels = remainigAmount / 5;
        remainigAmount = remainigAmount % 5;
        int pennies = remainigAmount / 5;
        System.out.println("your amount " + amount + " consist of ");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");




    }
}

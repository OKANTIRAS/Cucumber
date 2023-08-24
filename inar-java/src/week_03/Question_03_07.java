package week_03;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount (e. g 11.56):  ");
        double amount = input.nextDouble();
        System.out.println("Your amount " + amount + " consist of");
        amount = amount * 100;
        int dollar = (int) (amount / 100);
        amount = (int) (amount % 100);
        int quarter = (int) (amount / 25);
        amount = amount % 25;
        int dime = (int) (amount / 10);
        amount = amount % 10;
        int nickel = (int) (amount / 5);
        amount = amount % 5;
        int pennies = (int) amount;
        if (dollar > 1) {
            System.out.println(dollar + " dollars");
        }else{
            System.out.println(dollar + " dollar");
        }if (quarter > 1) {
            System.out.println(quarter + " quarters");
        }else{
            System.out.println(quarter + " quarter");
        }if (dime > 1) {
            System.out.println(dime + " dimes");
        }else{
            System.out.println(dime + " dime");
        }if (nickel > 1) {
            System.out.println(nickel + " nickels");
        }else{
            System.out.println(nickel + " nickel");
        }if (pennies > 1) {
            System.out.println(pennies + " pennies");
        }else{
            System.out.println(pennies + " pennie");
        }



    }
}
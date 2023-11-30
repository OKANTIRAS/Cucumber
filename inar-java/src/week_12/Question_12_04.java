package week_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_04 {
    public static void main(String[] args) {
        boolean isTrue = true;
        while (isTrue){
            try{
                Loan loan =getLoan();
                System.out.println(loan);
                isTrue = false;
            }catch (InputMismatchException ex){
                System.out.println("Wrong input! Please enter greater than 0 (zero)");
            }
        }
    }
    public static Loan getLoan(){
        Scanner input = new Scanner(System.in);
        Loan loan = new Loan();
        boolean condition = true;
        while (condition){
            try{
                System.out.print("Enter annual interest rate (must be bigger than zero!: ");
                double annualInterestRate = input.nextDouble();
                System.out.print("Enter number of years(must be bigger than zero!) :");
                int numberOfYears = input.nextInt();
                System.out.print("Enter loan amount(must be bigger than zero!) :");
                double loanAmount = input.nextDouble();
                loan = new Loan(annualInterestRate,numberOfYears,loanAmount);
                condition = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Wrong input! Enter an integer ");
            }
        }
        return loan;



    }
}

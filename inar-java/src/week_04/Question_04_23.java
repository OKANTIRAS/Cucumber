package week_04;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        int numberOfHoursWorked = input.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        double grossPay = numberOfHoursWorked * payRate;
        double totalDeduction = federalTaxRate + stateTaxRate;

        System.out.printf("Employee Name: %s \n", name);
        System.out.printf("Hours Worked: %d \n", numberOfHoursWorked);
        System.out.printf("Pay Rate: $%3.2f \n", payRate);
        System.out.printf("Gross Pay: $%3.1f \n", grossPay);
        System.out.printf("Deductions: \n");
        System.out.printf("\tFederal Withholding: %3.1f \n", (grossPay * federalTaxRate));
        System.out.printf("\tState Withholding: $%3.2f \n \t", (grossPay * stateTaxRate));
        System.out.printf("Total Deduction: $%4.2f \n", (grossPay * stateTaxRate) + (grossPay * federalTaxRate));
        System.out.printf("Net Pay: $%4.2f", (grossPay - ((grossPay * stateTaxRate) + (grossPay * federalTaxRate))));







    }
}

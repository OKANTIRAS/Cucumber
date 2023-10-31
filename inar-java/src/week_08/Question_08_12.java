package week_08;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(0-single filer, 1-married jointly or qualifying widow(er)," +
                "2-married separately, 3- head of household) Enter the filing status: ");
        int status = input.nextInt();
        System.out.println("Enter the taxable income: ");
        int income = input.nextInt();
        int [][] brackets = {
                { 8350 , 33950 , 82250 , 171550 , 372950 },
                { 16700 , 67900 , 137050 , 20885 , 372950 },
                { 8350 , 33950 , 68525 , 104425 , 186475 },
                { 11950 , 45500 , 117450 , 190200 , 372950 }
        };
        double [] rates = { 0.10 , 0.15 , 0.25 , 0.28 , 0.33 , 0.35 };

    }




}

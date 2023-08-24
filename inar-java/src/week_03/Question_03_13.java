package week_03;

import java.util.Scanner;

public class Question_03_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(0-single filter, 1-married jointly or qualifying widow(er), 2-married seperately, " +
                "3-head of household) Enter the filling status: ");
        int status = input.nextInt();
        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();
        double tax = 0;
        switch (status) {
            case 0:
                if (income <= 8350) {
                    tax = income / 10;
                } else if (income >= 8351 && income <= 33950) {
                    tax = (8350 / 10) + ((income - 8350) * 15) / 100;
                } else if (income >= 33951 && income <= 82250) {
                    tax = (8350 / 10) + ((33950 - 8350) * 0.15) + ((income - 33951) * 25) / 100;
                } else if (income >= 82251 && income <= 171550) {
                    tax = (8350 / 10) + ((33950 - 8350) * 0.15) + ((82250 - 33951) * 25) / 100 + ((income - 82251) * 28) / 100;
                } else if (income >= 171551 && income <= 372950) {
                    tax = (8350 / 10) + ((33950 - 8350) * 0.15) + ((82250 - 33951) * 25) / 100 + ((171550 - 82251) * 28) / 100 + ((income - 171551) * 33) / 100;
                } else {
                    tax = (8350 / 10) + ((33950 - 8350) * 0.15) + ((82250 - 33951) * 25) / 100 + ((171550 - 82251) * 28) / 100 + ((372950 - 171551) * 33) / 100 + ((income - 372951) * 35) / 100;
                }break;
            case 1:
                if (income <= 16700) {
                    tax = (16700 / 10) + ((income - 16700) * 15) / 100;
                } else if (income >= 67901 && income <= 137050) {
                    tax = (16700 / 10) + ((67900 - 16700) * 0.15) + ((income - 67901) * 25) / 100;
                } else if (income >= 137051 && income <= 208850) {
                    tax = (16700 / 10) + ((67900 - 16700) * 0.15) + ((137051 - 67901) * 25) / 100 + ((income - 137051) * 28) / 100;
                } else if (income >= 208851 && income <= 372950) {
                    tax = (16700 / 10) + ((67900 - 16700) * 0.15) + ((137051 - 67901) * 25) / 100 + ((208850 - 137051) * 28) / 100 + ((income - 208851) * 33) / 100;
                } else {
                    tax = (16700 / 10) + ((67900 - 16700) * 0.15) + ((137051 - 67901) * 25) / 100 + ((208850 - 137051) * 28) / 100 + ((372950 - 208851) * 33) / 100 + ((income - 372951) * 35) / 100;
                }break;
            case 2:
                if (income <= 8350) {
                    tax = (8350 / 10) + ((income - 8350) * 15) / 100;
                } else if (income >= 33951 && income <= 68525) {
                    tax = (8350 / 10) + ((33950 - 8350) * 0.15) + ((income - 33951) * 25) / 100;
                } else if (income >= 68526 && income <= 104425) {
                    tax = (8350 / 10) + ((33950 - 8350) * 0.15) + ((68526 - 33951) * 25) / 100 + ((income - 68526) * 28) / 100;
                } else if (income >= 104426 && income <= 186475) {
                    tax = (8350 / 10) + ((33950 - 8350) * 0.15) + ((68526 - 33951) * 25) / 100 + ((104425 - 68526) * 28) / 100 + ((income - 104426) * 33) / 100;
                } else {
                    tax = (8350 / 10) + ((33950 - 8350) * 0.15) + ((68526 - 33951) * 25) / 100 + ((104425 - 68526) * 28) / 100 + ((186475 - 104426) * 33) / 100 + ((income - 186476) * 35) / 100;
                }break;
            case 3:
                if (income <= 11950) {
                    tax = (11950 / 10) + ((income - 11950) * 15) / 100;
                } else if (income >= 45501 && income <= 117450) {
                    tax = (11950 / 10) + ((45500 - 11950) * 0.15) + ((income - 45501) * 25) / 100;
                } else if (income >= 117451 && income <= 190200) {
                    tax = (11950 / 10) + ((45500 - 11950) * 0.15) + ((117451 - 45501) * 25) / 100 + ((income - 117451) * 28) / 100;
                } else if (income >= 190201 && income <= 186475) {
                    tax = (11950 / 10) + ((45500 - 11950) * 0.15) + ((117451 - 45501) * 25) / 100 + ((190200 - 117451) * 28) / 100 + ((income - 190201) * 33) / 100;
                } else {
                    tax = (11950 / 10) + ((45500 - 11950) * 0.15) + ((117451 - 45501) * 25) / 100 + ((190200 - 117451) * 28) / 100 + ((372950 - 190201) * 33) / 100 + ((income - 3772951) * 35) / 100;
                }break;

        }
        System.out.println("Tax is " + tax);


    }
}






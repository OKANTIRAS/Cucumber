package week_03;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates:  ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(Math.abs(x - 0) <= 5 && Math.abs(y - 0) <= 2.5) {
            System.out.println("Point (" + x + ", " + y + ") is in rectangle");
        }else{
            System.out.println("Point (" + x + ", " + y + ") is not in rectangle");

        }



    }
}

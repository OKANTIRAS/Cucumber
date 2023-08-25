package week_03;

import java.util.Scanner;

public class Question_03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point's x- and y- coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if((0 <= x) && (x <= 200) && (0 <= y) && (y <= 100) && (y <= ((-0.5 * x) + 100))){
            System.out.println("The point is in triangle");
        }else {
            System.out.println("The point is not in triangle");
        }

    }
}

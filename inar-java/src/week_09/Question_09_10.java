package week_09;

import java.util.Scanner;

public class Question_09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        QuadraticEquation point = new QuadraticEquation(a, b, c);
        if(point.getDiscriminant() > 0){
            System.out.printf("The equation has two roots %.3f and %.3f",point.getRoot1(),point.getRoot2());
        }else if(point.getDiscriminant() == 0){
            System.out.printf("The equation has one root %.1f",point.getRoot1());
        }else{
            System.out.println("The equation has no roots");
        }


    }


}

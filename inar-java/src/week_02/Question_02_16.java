package week_02;

import java.util.Scanner;

public class Question_02_16 {
    public static void main(String [] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double s = input.nextDouble();
        double area =3 * Math.sqrt(3) / 2 * Math.pow(s, 2);
        System.out.println("The area of the hexagon is " + area);


    }
}

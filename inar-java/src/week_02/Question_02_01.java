package week_02;

import java.util.Scanner;

public class Question_02_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double celcius;
        System.out.print("Enter a degree in Celcius: ");
        celcius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celcius + 32;

        System.out.println(celcius + " Celcius is " + fahrenheit +" Fahrenheit" );
        
    }
}

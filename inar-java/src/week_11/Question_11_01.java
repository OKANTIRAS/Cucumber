package week_11;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter a color: ");
        String color = input.next();
        System.out.println("Is the triangle filled (true / false)?  ");
        String filled = input.next();
        boolean isFilled = convertToBoolean(filled);
        GeometricObject triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);
        displayObject(triangle);
    }
    public static boolean convertToBoolean(String filled){
        if(filled.equalsIgnoreCase("true")){
            return true;
        }else if(filled.equalsIgnoreCase("false")){
            return false;
        }else{
            System.out.println("You enter wrong input ");
            System.exit(1);
        }
        return false;
    }
    public static void displayObject(GeometricObject object){
        if(object instanceof Triangle){
            System.out.println("Area: " + ((Triangle) object).getArea());
            System.out.println("Perimeter: " + ((Triangle) object).getPeimeter());
            System.out.println("Color: " + object.getColor());
            if(object.isFilled()){
                System.out.println("Triangle is filled");
            }
        }
    }

}

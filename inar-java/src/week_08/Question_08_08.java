package week_08;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        System.out.print("Enter " + numberOfPoints + " points: ");
        int [][] array = new int[numberOfPoints][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();

            }

        }
        double closestDistance = getClosestDistance(array);
        displayClosestPoints(array, closestDistance);


    }

    public static double getClosestDistance(int[][] array) {
        double closestDistance = 0;
        for (int i = 0; i < array.length - 1; i++) {
            double x1 = array[i][0];
            double y1 = array[i][1];
            for (int j = i + 1; j <array.length ; j++) {
                double x2 = array[j][0];
                double y2 = array[j][1];
                double currentDistance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
                    if(i == 0){
                        closestDistance = currentDistance;
                    }else{
                        if(currentDistance > closestDistance){
                            closestDistance = currentDistance;
                        }
                    }
            }
        }
        return closestDistance;
    }

    public static void displayClosestPoints(int[][] array, double closestDistance) {
        for (int point = 0; point < array.length - 1; point++) {
            double x1 = array[point][0];
            double y1 = array[point][1];
            for (int secondPoint = point + 1; secondPoint < array.length; secondPoint++) {
                double x2 = array[secondPoint][0];
                double y2 = array[secondPoint][1];
                double currentDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                if (currentDistance == closestDistance) {
                    System.out.println("The closest two points are"
                            + " (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");
                }
            }
        }
        System.out.println("Their distance is " + closestDistance);
    }
}

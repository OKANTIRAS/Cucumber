package week_08;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        double [][] coordinates = getCityCoordinate();
        double totalDistance = findCentralCity(coordinates);
        System.out.println("The total distance to all other cities is " + totalDistance);

    }

    public static double findCentralCity(double[][] coordinates) {
        double distance = 0;
        double sumDistance = 0;
        double closestDistance = 999999;
        double closesetDistanceXValue = 0;
        double closesetDistanceYValue = 0;
        for (int i = 0; i < coordinates.length - 1; i++) {
            sumDistance = 0;
            double x1 = coordinates[i][0];
            double y1 = coordinates[i][1];
            for (int j = i + 1; j <coordinates.length ; j++) {
                double x2 = coordinates[j][0];
                double y2 = coordinates[j][1];
                distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
                sumDistance += distance;
            }
            if(sumDistance < closestDistance) {
                closestDistance = sumDistance;
                closesetDistanceXValue = x1;
                closesetDistanceYValue = y1;
            }

        } System.out.println("The central city is at (" + closesetDistanceXValue + ", " +
                closesetDistanceYValue + ")");
        return closestDistance;

    }

    public static double[][] getCityCoordinate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        System.out.print("Enter the coordinates of the cities: ");
        double [][] coordinates = new double[numberOfCities][2];
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                coordinates[i][j] = input.nextDouble();
            }
        }
        return coordinates;
    }
}

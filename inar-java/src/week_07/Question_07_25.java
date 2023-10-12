package week_07;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
       double [] coefficients = getCoefficients();
       double [] roots = new double[2];
       int countOfRoots = getCountsOfRoots(roots, coefficients);
       printResult(countOfRoots,roots);




    }

    public static void printResult(int countOfRoots, double [] roots) {
        if(countOfRoots == 2){
            System.out.println("The number of real roots : " + countOfRoots);
            System.out.println("The roots of equation " + roots[0] + " " + roots[1]);
        } else if (countOfRoots == 1) {
            System.out.println("The number of real roots : " + countOfRoots);
            System.out.println("The root of equation " + roots[0]);
        } else {
            System.out.println("The equation has no real root.");
        }

    }

    public static int getCountsOfRoots(double[] roots, double[] coefficients) {
        double discriminants = Math.pow(coefficients[1], 2) - (4 * coefficients[0] * coefficients[2]);
        int countOfRoots;
        if(discriminants > 0){
            roots[0] = (-coefficients[1] + Math.sqrt(Math.pow(coefficients[1],2) -
                    4 * coefficients[0] * coefficients[2])) / 2 * coefficients[0];
            roots[1] = (-coefficients[1] - Math.sqrt(Math.pow(coefficients[1],2) -
                    4 * coefficients[0] * coefficients[2])) / 2 * coefficients[0];
            countOfRoots = 2;
        }else if(discriminants == 0){
            roots[0] = -coefficients[1] / 2 * coefficients[0];
            countOfRoots = 1;
        }else{
            countOfRoots = 0;
        }
        return countOfRoots;
    }

    public static double[] getCoefficients() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        double [] coefficients = new double[3];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = input.nextDouble();

        }
        return coefficients;
    }
}

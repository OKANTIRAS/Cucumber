package week_08;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        double [][] array = createArray();
        if(sameLine(array)){
            System.out.println("The five points are on the same line");
        }else{
            System.out.println("The five points are not on the same line");
        }
    }

    public static boolean sameLine(double[][] array) {
        boolean isSameLine = true;
        for (int i = 0; i < array.length - 2; i++) {
            double x0 = array[i][0];
            double y0 = array[i][1];
            for (int j =  i + 1; j < array.length - 1; j++) {
                double x1 = array[j][0];
                double y1 = array[j][1];
                for (int k = j + 1; k < array.length ; k++) {
                    double x2 = array[k][0];
                    double y2 = array[k][1];
                    if((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) != 0){
                        isSameLine = false;
                        break;
                    }
                }

            }
        }
        return isSameLine;
    }

    public static double[][] createArray() {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter five points: ");
        double [][] array = new double[5][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }


}

package week_06;

import java.util.Scanner;

public class Question_06_39 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for p0, p1 and p2: ");
        double p0x0 = input.nextDouble();
        double p0y0 = input.nextDouble();
        double p1x1 = input.nextDouble();
        double p1y1 = input.nextDouble();
        double p2x2 = input.nextDouble();
        double p2y2 = input.nextDouble();

        if(leftOnTheLine(p0x0,p0y0,p1x1,p1y1,p2x2,p2y2)){
            System.out.printf("(%.1f,%.1f) is on the left side of the line from (%.1f,%.1f) to (%.1f,%.1f)",p2x2,p2y2,p0x0,p0y0,p1x1,p1y1);
        }else if(onTheLineSegment(p0x0,p0y0,p1x1,p1y1,p2x2,p2y2)){
            System.out.printf("(%.1f,%.1f) is on the same line from (%.1f,%.1f) to (%.1f,%.1f)",p2x2,p2y2,p0x0,p0y0,p1x1,p1y1);
        }
        else if(rightOnTheLine(p0x0,p0y0,p1x1,p1y1,p2x2,p2y2)){
            System.out.printf("(%.1f,%.1f) is on the right side from (%.1f,%.1f) to (%.1f,%.1f)",p2x2,p2y2,p0x0,p0y0,p1x1,p1y1);
        }
    }
    public static boolean leftOnTheLine(double p0x0,double p0y0,double p1x1,double p1y1,double p2x2,double p2y2){
        double result = (p1x1 - p0x0) * (p2y2 - p0y0) - (p2x2 - p0x0) * (p1y1 - p0y0);
        if(result > 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean rightOnTheLine(double p0x0,double p0y0,double p1x1,double p1y1,double p2x2,double p2y2) {
        double result = (p1x1 - p0x0) * (p2y2 - p0y0) - (p2x2 - p0x0) * (p1y1 - p0y0);
        if (result < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean onTheLineSegment(double p0x0,double p0y0,double p1x1,double p1y1,double p2x2,double p2y2) {
        double result = (p1x1 - p0x0) * (p2y2 - p0y0) - (p2x2 - p0x0) * (p1y1 - p0y0);
        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }
}

package week_02;

import java.util.Scanner;
import java.time.LocalTime;

public class Question_02_08 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        long totalMiliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMiliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        System.out.print("Enter the time zone offset to GMT: ");
        int timeOffset = input.nextInt();
        System.out.println("The current time is " + (currentHours + timeOffset) + ":" + currentMinutes + ":" + currentSeconds);

    }
}

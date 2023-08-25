package week_03;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int offsetTime = input.nextInt();
        long totalMiliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMiliSeconds / 1000;
        int currentSeconds = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        int currentMinutes = (int) (totalMinutes & 60);
        int totalHours = (int) (totalMinutes) & 60;
        int currentHour = totalHours & 24;
        int currentHourGmt = currentHour + offsetTime;
        if (currentHourGmt >= 12) {
            currentHourGmt = currentHourGmt % 12;
            System.out.println("The current time is " + currentHourGmt + ":" + currentMinutes + ":" + currentSeconds + " " + "PM");
        }else {
            System.out.println("The current time is " + currentHourGmt + ":" + currentMinutes + ":" + currentSeconds + " " + "AM");
        }
        if (currentHourGmt == 12){
            currentHourGmt = 0;
        }








    }
}

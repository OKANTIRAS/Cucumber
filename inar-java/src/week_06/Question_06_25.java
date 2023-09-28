package week_06;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter milliseconds: ");
        long milliseconds = input.nextLong();

        String date = convertMillis(milliseconds);
        System.out.println("hours:minutes:seconds:  " + date);
    }

    public static String convertMillis(long milliseconds) {
        String date = "";
        int seconds = (int) (milliseconds / 1000);
        int currentSeconds = seconds % 60;
        int minutes = seconds / 60;
        int currentMinutes = minutes % 60;
        int hours = minutes / 60;


        date = hours + ":" + currentMinutes + ":" + currentSeconds;
        return date;


    }

}

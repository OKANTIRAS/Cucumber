package week_06;

import java.util.Scanner;

public class Question_06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter month as number between 1 and 12:  ");
        int month = input.nextInt();
        printcalender(year, month);

    }

    public static void printcalender(int year, int month) {
        System.out.printf("%20s%6d\n", getmonth(month), year);
        System.out.println("---------------------------");
        System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n","Sun","Mon","Tue","Wed","Thu","Fri","Sat");
        int dayOfMonth = getDayOfMonth(month ,year);
        int dayOfWeek = getDayOfWeek(year,month);

        if (dayOfWeek == 0) {
            dayOfWeek = 7;
        }
        for(int i = 1; i < dayOfWeek; i++){
            System.out.printf("%6s"," ");
        }
        for (int i = 1; i <= dayOfMonth; i++) {
            if (dayOfWeek % 7 == 0) {
                System.out.printf("%-6d\n", i);
            } else {
                System.out.printf("%-6d", i);
            }
            dayOfWeek++;
        }

    }

    public static String getmonth(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;

        }
        return monthName;
    }
    public static int getDayOfMonth(int month ,int year){
        if(month == 1 || month == 3 ||month == 5 || month == 7 || month == 8 ||month == 10 ||month == 12){
            return 31;
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }else{
            if(isleapyear(year)){
                return 29;
            }else{
                return 28;
            }
        }
    }
    public static boolean isleapyear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static int getDayOfWeek(int year, int month){
        int m = month + 2;
        int q = getDayOfMonth(month,year);
        int j = year / 100;
        int k = year % 100;
        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;
        return h;
    }
}

package week_06;

public class Question_06_24 {
    public static void main(String[] args) {
        long milliseconds = System.currentTimeMillis();
        int seconds = getSeconds(milliseconds);
        int currentSecond = getCurrentSecond(milliseconds);
        int minutes = getMinutes(seconds);
        int currentMinute = getCurrentMinute(milliseconds);
        int hours = getHours(minutes) ;
        int currentHour = getCurrentHour(milliseconds) + 3;
        int days = getDays(hours);
        int year = getYear(milliseconds);
        int remainingDays = getRemainingDays(milliseconds);
        int month = getTheCurrentMonth(remainingDays, year);
        int currentDayOfMonth = getTheCurrentDay(remainingDays, year);
        System.out.printf("Current date and time is %d %d %d %d %d %d",
                month, currentDayOfMonth, year, currentHour, currentMinute, currentSecond);
    }

    public static int getSeconds(long milliseconds) {
        int seconds = (int) (milliseconds / 1000);
        return seconds;
    }

    public static int getCurrentSecond(long milliseconds) {
        int second = getSeconds(milliseconds);
        int currentSecond = second % 60;
        return currentSecond;
    }

    public static int getMinutes(long milliseconds) {
        int minutes = getSeconds(milliseconds) / 60;
        return minutes;
    }

    public static int getCurrentMinute(long milliseconds) {
        int currentminutes = getMinutes(milliseconds) % 60;
        return currentminutes;
    }

    public static int getHours(long milliseconds) {
        int hours = getMinutes(milliseconds) / 60;
        return hours;
    }

    public static int getCurrentHour(long milliseconds) {
        int currentHour = getHours(milliseconds) % 24;
        return currentHour;
    }

    public static int getDays(long milliseconds) {
        int days = getHours(milliseconds) / 24;
        return days;
    }

    public static int getYear(long milliseconds) {
        int year = 1970;
        int remainingDays = getDays(milliseconds);

        while (remainingDays >= 365) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                remainingDays -= 366;
                year++;
            } else {
                remainingDays -= 365;
                year++;
            }
        }
        return year;
    }

    public static int totalDaysInTheMonth(int month, int year) {
        int result ;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            result = 31;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                result = 29;
            } else {
                result = 28;
            }
        } else {
            result = 30;
        }
        return result;
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
            result = true;
        }

        return result;
    }

    public static int getTheCurrentMonth(int remainingDays, int currentYear) {
        int month = 1;
        while (remainingDays > totalDaysInTheMonth(month, currentYear)) {
            remainingDays = remainingDays - totalDaysInTheMonth(month, currentYear);
            month++;

        }
        return month;
    }

    public static int getTheCurrentDay(int remainingDaysOfTheYear, int currentYear) {
        int month = 1;
        while (remainingDaysOfTheYear > totalDaysInTheMonth(month, currentYear)) {
            remainingDaysOfTheYear = remainingDaysOfTheYear - totalDaysInTheMonth(month, currentYear);
            month++;
        }
        return remainingDaysOfTheYear + 1;
    }
    public static int getRemainingDays(long milliseconds) {
        int year = 1970;
        int remainingDays = getDays(milliseconds);

        while (remainingDays >= 365) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                remainingDays -= 366;
                year++;
            } else {
                remainingDays -= 365;
                year++;
            }
        }
        return remainingDays;
    }
}




package week_06;

public class Question_06_16 {
    public static void main(String[] args) {
        printTable();
    }

    public static void printTable() {
        System.out.println("Year        Days in year");
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%-15d%d\n", i, numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}

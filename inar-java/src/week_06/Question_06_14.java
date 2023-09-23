package week_06;

public class Question_06_14 {
    public static void main(String[] args) {

        printTable();

    }

    public static void printTable() {
        System.out.println("i               m(i)");
        System.out.println("--------------------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-15d%.4f\n", i, calculatePi(i));
        }
    }

    public static double calculatePi(int number) {
        double result = 0;
        for (int i = 1; i <= number; i++) {
            result += Math.pow(-1, (i + 1)) / ((2 * i) - 1);

        }
        result = 4 * result;
        return result;
    }
}

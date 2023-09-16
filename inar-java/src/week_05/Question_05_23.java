package week_05;

public class Question_05_23 {
    public static void main(String[] args) {
        double sum = 0;
        double sum2 = 0;

        for (int i = 1; i <= 50000; i++) {
            sum += (1.0 / i);
        }
        for (int k = 50000; k >= 1; k--) {
            sum2 += (1.0 / k);
        }
        System.out.printf("Summation of the series left to right: %f\n",sum );
        System.out.printf("Summation of the series right to left: %f\n",sum2 );
        System.out.println("Summation of the series right to left - Summation of the series left to right: " + (sum2 - sum));


    }
}

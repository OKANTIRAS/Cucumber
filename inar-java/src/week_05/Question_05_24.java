package week_05;

public class Question_05_24 {
    public static void main(String[] args) {
        double sum = 0;
        for(double i = 1.0, k = 3.0; (i <= 97.0 && k <= 99.0); i +=2, k +=2){
            sum += i / k ;
        }
        System.out.printf("Sum of series: %f ", sum);
    }
}

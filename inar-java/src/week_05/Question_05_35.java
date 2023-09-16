package week_05;

public class Question_05_35 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1, k = 2; i <= 624 && k <= 625; i++ ,k++){
            sum += 1.0 / (Math.sqrt(i) + Math.sqrt(k));
        }
        System.out.println("The sum of the serie is " + sum);
    }
}

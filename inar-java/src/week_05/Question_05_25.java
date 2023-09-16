package week_05;

public class Question_05_25 {
    public static void main(String[] args) {
        double sum = 0;
        double pi = 0;
        for(int i = 1 ; i <= 100000; i++){
            double value = (Math.pow(-1, (i+1))) / ((2 * i) - 1);
            sum += value;
            pi = 4 * sum;
            if(i == 10000){
                System.out.println("PI value for i = 10000: " + pi);
            }if(i == 20000) {
                System.out.println("PI value for i = 20000: " + pi);
            }if(i == 100000) {
                System.out.println("PI value for i = 100000: " + pi);
            }
        }
    }
}

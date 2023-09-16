package week_05;

public class Question_05_12 {
    public static void main(String[] args) {
        int n = -1000;
        do {
            n++;
        } while (Math.pow(n, 2) > 12000);

        System.out.println("The smallest n is " + n);
    }
}

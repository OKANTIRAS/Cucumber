package week_05;

public class Question_05_26 {
    public static void main(String[] args) {
        double e = 1;
        double factoriel = 1;
        for (int i = 1; i <= 100000; i++) {
            for (int k = i; k >= 1; k--) {
                factoriel *= k;
            }
            e += (1.0 / factoriel);
            if (i == 10000) {
                System.out.println("e at i = 10000 is " + e);
            }
            if (i == 20000) {
                System.out.println("e at i = 20000 is " + e);
            }
            if (i == 100000) {
                System.out.println("e at i = 100000 is " + e);
            }
            factoriel = 1;
        }
    }
}

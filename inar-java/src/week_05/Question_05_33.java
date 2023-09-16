package week_05;

public class Question_05_33 {
    public static void main(String[] args) {
        int sum = 0;
        int k = 1;
        System.out.println("Perfect numbers are:");
        for (int i = 6; i <= 10000; i++) {
            for (k = 1; k < i; k++) {
                if ((i % k == 0) && (i > k)) {
                    sum += k;
                }

            }
            if (sum == i) {
                System.out.println(k);
            }
            sum = 0;
        }
    }
}


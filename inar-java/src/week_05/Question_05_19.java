package week_05;

public class Question_05_19 {
    public static void main(String[] args) {
        for(int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print((int) Math.pow(2, k) + " ");
            }for(int l = 2; l <= i; l++){
                System.out.print((int)Math.pow(2, i-l) + " ");
            }
            System.out.println();
        }

    }
}

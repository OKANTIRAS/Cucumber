package week_05;

public class Question_05_40 {
    public static void main(String[] args) {
        int counterHeads = 0;
        int counterTails = 0;
        for (int i = 1; i <= 1000000; i++) {
            int result = (int) (Math.random() * 2);
            if (result == 0) {
                counterHeads++;
            } else {
                counterTails++;
            }
        }
        System.out.println("Fipping coin one millon times");
        System.out.println("Heads: " + counterHeads);
        System.out.println("Tails: " + counterTails);
    }
}

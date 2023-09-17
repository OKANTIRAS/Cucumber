package week_05;

public class Question_05_39 {
    public static void main(String[] args) {

        double sale = 0;
        double commission = 0;
        // 30000 - base salary = 25000
        while (commission <= 25000) {
            if (sale <= 5000) {
                commission = 5000 * 8 / 100;
            } else if (5000 < sale && sale <= 10000) {
                commission = (5000 * 8 / 100) + ((sale - 5000) * 10 / 100);
            } else {
                commission = (5000 * 8 / 100) + (5000 * 10 / 100) + ((sale - 10000) * 12 / 100);
            }
            sale += 0.01;
        }
        System.out.printf("Minimum sales to earn $30,000: $%.2f",sale);
    }
}

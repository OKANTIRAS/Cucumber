package week_07;

public class Question_07_07 {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        int[] counts = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            counts[numbers[i]]++;
        }
        System.out.println("Count for each number between 0 and 9");

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i +"s: " + counts[i]);
        }


    }
}

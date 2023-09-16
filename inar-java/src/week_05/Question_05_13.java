package week_05;

public class Question_05_13 {
    public static void main(String[] args) {
        int number = 0;
        while (Math.pow(number, 3) < 12000){
            number++;
        }
        System.out.println("The largest n is " + number);

    }
}
package week_05;

public class Question_05_10 {
    public static void main(String [] args){

            int counter = 0;
            String numbers = "";
            for(int i = 100; i <= 1000; i++) {
                if (i % 5 == 0 && i % 6 == 0) {
                    numbers = numbers + i + " ";
                    counter++;
                    if (counter % 10 == 0) {
                        numbers = numbers + "\n";
                    }
                }
            }System.out.println(numbers);

    }
}

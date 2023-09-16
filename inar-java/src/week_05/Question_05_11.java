package week_05;

public class Question_05_11 {
    public static void main(String[] args) {
        String numbers = "";
        int counter = 0;
        for(int i= 100; i <= 200; i++){
            if(((i % 5 == 0) || (i % 6 == 0)) && (i % 30 != 0)){
                numbers = numbers + " " + i;
                counter++;
                if(counter % 10 == 0){
                    numbers = numbers + "\n";
                }

            }
        }
        System.out.print(numbers);
    }
}

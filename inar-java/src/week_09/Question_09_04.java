package week_09;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        System.out.println("Random numbers are: ");

        for (int i = 0; i < 50; i++) {
            int currentRandom = random.nextInt(100);
            if((i + 1) % 10 == 0){
                System.out.print(currentRandom + " ");
                System.out.println();
            }else{
                System.out.print(currentRandom + " ");
            }


        }
    }
}

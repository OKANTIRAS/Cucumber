package week_07;

import java.util.Arrays;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] locker = new boolean[100];
        for (int student = 1; student <= 100; student++) {
            for (int i = 0; i < 100; i++) {
                if ((i+1) % (student ) == 0) {
                    locker[i] = !locker[i];
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            if (locker[i]==true){
                System.out.print("L" + (i+1)+" ");
            }
        }
    }

}
